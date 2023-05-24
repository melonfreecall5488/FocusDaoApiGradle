package com.smart.focus.ceoapi.service;

import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.GroupPrincipal;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.UserPrincipal;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.servlet.ServletContext;

import org.apache.commons.io.FilenameUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.smart.focus.ceoapi.Excel.ExcelWrite;
import com.smart.focus.ceoapi.common.ConstDef;
import com.smart.focus.ceoapi.common.Log;

@Service
public class FileServiceImpl {

	@Autowired
	private ServletContext servletContext;

	@Autowired
	private ApplicationContext appContext;

	public String getRootPath(String webRoot) {

		String rootPath = null;
		String realPath = servletContext.getRealPath("");
		int pathIndex = realPath.indexOf(webRoot + "s");
		if (pathIndex >= 0) {
			rootPath = realPath.substring(0, pathIndex - 1) + "/" + webRoot + "s/" + ConstDef.WEB_PAGE_PATH;
		} else {
			pathIndex = realPath.indexOf(webRoot);
			rootPath = realPath.substring(0, pathIndex - 1) + "/" + webRoot;
		}
		Log.Debug("getRootPath=%s", rootPath);
		return rootPath;
	}

	public String getOutRootPath(String webRoot) {
		if (ConstDef.CONTENT_PATH.length() > 0) {
			return ConstDef.CONTENT_PATH;
		}
		String realPath = servletContext.getRealPath("");
		int pathIndex = realPath.indexOf(webRoot);
		String rootPath = realPath.substring(0, pathIndex - 1);
		Log.Debug("getOutRootPath=%s", rootPath);
		return rootPath;
	}

	public void chown(Path path, String own) {
		FileSystem fileSystem = path.getFileSystem();
		UserPrincipalLookupService service = fileSystem.getUserPrincipalLookupService();
		try {

			UserPrincipal userPrincipal = service.lookupPrincipalByName(own);
			Files.setOwner(path, userPrincipal);
			GroupPrincipal group = service.lookupPrincipalByGroupName(own);
			Files.getFileAttributeView(path, PosixFileAttributeView.class, LinkOption.NOFOLLOW_LINKS).setGroup(group);
		} catch (IOException e) {
			Log.Error(e.getMessage());
		}
	}

	public Path store(MultipartFile file, String filename, String webRoot, String filePath) throws IOException {
		Path pathFolder = null;
		Path pathFile = null;
		if (ConstDef.SAVE_ROOT_OUT) {
			pathFolder = Paths.get(this.getOutRootPath(webRoot) + filePath);
			pathFile = Paths.get(this.getOutRootPath(webRoot) + filename);
		} else {
			pathFolder = Paths.get(this.getRootPath(webRoot) + filePath);
			pathFile = Paths.get(this.getRootPath(webRoot) + filename);
		}
		if (!Files.exists(pathFolder))
			Files.createDirectories(pathFolder);
		Files.copy(file.getInputStream(), pathFile, StandardCopyOption.REPLACE_EXISTING);

		return pathFile;
	}

	public Path storeAbsolutePath(MultipartFile file, String filename) throws IOException {

		Files.copy(file.getInputStream(), Paths.get(filename), StandardCopyOption.REPLACE_EXISTING);

		return Paths.get(filename);
	}

	public Path storeFromBmpToPng(MultipartFile file, String filename, String webRoot, String filePath)
			throws IOException {
		Path pathFolder = null;
		Path pathFile = null;
		if (ConstDef.SAVE_ROOT_OUT) {
			pathFolder = Paths.get(this.getOutRootPath(webRoot) + filePath);
			pathFile = Paths.get(this.getOutRootPath(webRoot) + filename);
		} else {
			pathFolder = Paths.get(this.getRootPath(webRoot) + filePath);
			pathFile = Paths.get(this.getRootPath(webRoot) + filename);
		}
		if (!Files.exists(pathFolder))
			Files.createDirectories(pathFolder);
		BufferedImage input_image = null;
		input_image = ImageIO.read(file.getInputStream());

		BufferedImage newBufferedImage = new BufferedImage(input_image.getWidth(),
				input_image.getHeight(), BufferedImage.TYPE_INT_RGB);
		newBufferedImage.createGraphics().drawImage(input_image, 0, 0, null);

		ImageIO.write(input_image, "jpg", pathFile.toFile()); // write PNG output to file

		return pathFile;
	}

	public Path storeInWebRoot(MultipartFile file, String filename, String webRoot, String filePath) throws IOException {
		Path pathFolder = null;
		Path pathFile = null;
		pathFolder = Paths.get(this.getRootPath(webRoot) + filePath);
		pathFile = Paths.get(this.getRootPath(webRoot) + filename);

		if (!Files.exists(pathFolder))
			Files.createDirectories(pathFolder);
		Files.copy(file.getInputStream(), pathFile, StandardCopyOption.REPLACE_EXISTING);

		return pathFile;
	}

	public Path getFilePath(String filename, String webRoot) {
		Path file = null;
		if (ConstDef.SAVE_ROOT_OUT) {
			file = Paths.get(this.getOutRootPath(webRoot) + filename);
		} else {
			file = Paths.get(this.getRootPath(webRoot) + filename);
		}
		return file;
	}

	public Resource loadFile(String filename, String webRoot) {

		// Log.Debug("FileServiceImpl::loadFile: [Filename] = %s", filename);

		Path file = null;
		if (ConstDef.SAVE_ROOT_OUT) {
			file = Paths.get(this.getOutRootPath(webRoot) + filename);
		} else {
			file = Paths.get(this.getRootPath(webRoot) + filename);
		}

		// Log.Debug("FileServiceImpl::loadFile: [toUri] = %s", file.toAbsolutePath());

		Resource resource = appContext.getResource("file:" + file.toAbsolutePath().toString());

		// Log.Debug("FileServiceImpl::loadFile: [Exist:Readable] = %s:%s",
		// resource.exists(), resource.isReadable());

		if (resource.exists() || resource.isReadable()) {
			return resource;
		} else {
			throw new RuntimeException("Failed to read file!");
		}
	}

	public Resource loadFileFullPath(String filename) {

		// Log.Debug("FileServiceImpl::loadFile: [Filename] = %s", filename);
		Resource resource = appContext.getResource("file:" + filename);

		// Log.Debug("FileServiceImpl::loadFile: [Exist:Readable] = %s:%s",
		// resource.exists(), resource.isReadable());

		if (resource.exists() || resource.isReadable()) {
			return resource;
		} else {
			throw new RuntimeException("Failed to read file!");
		}
	}

	public Resource loadFileInWebRoot(String filename, String webRoot) {

		// Log.Debug("FileServiceImpl::loadFile: [Filename] = %s", filename);

		Path file = null;

		file = Paths.get(this.getRootPath(webRoot) + filename);

		// Log.Debug("FileServiceImpl::loadFile: [toUri] = %s", file.toAbsolutePath());

		Resource resource = appContext.getResource("file:" + file.toAbsolutePath().toString());

		// Log.Debug("FileServiceImpl::loadFile: [Exist:Readable] = %s:%s",
		// resource.exists(), resource.isReadable());

		if (resource.exists() || resource.isReadable()) {
			return resource;
		} else {
			throw new RuntimeException("Failed to read file!");
		}
	}

	public void deleteFile(String filename, String webRoot) throws InvalidPathException {
		Path path = null;

		if (ConstDef.SAVE_ROOT_OUT)
			path = Paths.get(this.getOutRootPath(webRoot) + filename);
		else
			path = Paths.get(this.getRootPath(webRoot) + filename);

		path.toFile().delete();

	}

	public void deleteFileInWebRoot(String filename, String webRoot) throws InvalidPathException {
		Path path = null;

		path = Paths.get(this.getRootPath(webRoot) + filename);

		path.toFile().delete();

	}

	public void deleteFile(String absoluteFilename) {
		try {
			Path path = Paths.get(absoluteFilename);
			path.toFile().delete();
		} catch (InvalidPathException e) {
			Log.Error(e.getMessage());
		}

	}

	public void deleteFolder(String delPath, String webRoot) {

		Path path = null;

		if (ConstDef.SAVE_ROOT_OUT)
			path = Paths.get(this.getOutRootPath(webRoot) + delPath);
		else
			path = Paths.get(this.getRootPath(webRoot) + delPath);

		try {
			File dirFile = new File(path.toString());
			File[] fileList = dirFile.listFiles();
			for (int j = 0; j < fileList.length; j++) {
				fileList[j].delete();
			}
			dirFile.delete();
		} catch (InvalidPathException e) {
			Log.Error(e.getMessage());
		}

	}

	public void deleteFolderAbsolutePath(String delPath) {

		try {
			File dirFile = new File(delPath);
			File[] fileList = dirFile.listFiles();
			for (int j = 0; j < fileList.length; j++) {
				fileList[j].delete();
			}
			dirFile.delete();
		} catch (InvalidPathException e) {
			Log.Error(e.getMessage());
		}

	}

	public void copyFile(String fromFilePath, String fromFileName, String destFilePath, String destFileName,
			String webRoot) throws IOException {
		String basePath = null;
		String destPath = null;

		if (ConstDef.SAVE_ROOT_OUT) {
			basePath = this.getOutRootPath(webRoot);
			destPath = this.getOutRootPath(webRoot) + destFilePath;
		} else {
			basePath = this.getRootPath(webRoot);
			destPath = this.getRootPath(webRoot) + destFilePath;
		}

		Path destDir = Paths.get(destPath);

		if (!Files.exists(destDir)) {
			try {
				Files.createDirectories(destDir);
			} catch (IOException e) {
				throw new RuntimeException("Failed to create storage: [File Path]: " + destFilePath);
			}
		}

		fromFilePath = basePath + fromFilePath + "/" + fromFileName;
		destFilePath = destPath + "/" + destFileName;

		if (Files.exists(Paths.get(fromFilePath)))
			Files.copy(new File(fromFilePath).toPath(), new File(destFilePath).toPath(), StandardCopyOption.REPLACE_EXISTING);

	}

	public void copyFile(String absoluteSrcFileName, String absoluteDestFileName) throws IOException {

		Files.copy(new File(absoluteSrcFileName).toPath(), new File(absoluteDestFileName).toPath(),
				StandardCopyOption.REPLACE_EXISTING);
	}

	public void moveFile(String absoluteSrcFileName, String absoluteDestFileName) throws IOException {

		Files.move(new File(absoluteSrcFileName).toPath(), new File(absoluteDestFileName).toPath(),
				StandardCopyOption.REPLACE_EXISTING);
	}

	public void moveFile(String fromFilePath, String fromFileName, String destFilePath, String destFileName,
			String webRoot) throws IOException {

		String basePath = null;
		String destPath = null;

		if (ConstDef.SAVE_ROOT_OUT) {
			basePath = this.getOutRootPath(webRoot);
			destPath = basePath + destFilePath;
		} else {
			basePath = this.getRootPath(webRoot);
			destPath = basePath + destFilePath;
		}

		Path path = Paths.get(destPath);

		if (!Files.exists(path)) {
			try {
				Files.createDirectories(path);
			} catch (IOException e) {
				throw new RuntimeException("Failed to create storage: [File Path]: " + destFilePath);
			}
		}

		fromFilePath = basePath + fromFilePath + "/" + fromFileName;
		destFilePath = basePath + destFilePath + "/" + destFileName;

		Files.move(new File(fromFilePath).toPath(), new File(destFilePath).toPath(), StandardCopyOption.REPLACE_EXISTING);
	}

	@SuppressWarnings("unchecked")
	public JSONArray fileList(String filePath, String webRoot) {
		JSONArray array = new JSONArray();
		Path pathFolder = null;
		if (ConstDef.SAVE_ROOT_OUT) {
			pathFolder = Paths.get(this.getOutRootPath(webRoot) + filePath);
		} else {
			pathFolder = Paths.get(this.getRootPath(webRoot) + filePath);
		}

		File dirFile = new File(pathFolder.toString());
		File[] fileList = dirFile.listFiles();
		if (fileList == null) {
			return null;
		}
		for (File tempFile : fileList) {
			if (tempFile.isFile() && !tempFile.isHidden()) {
				// String tempPath=tempFile.getParent();
				String tempFileName = filePath + tempFile.getName();
				String ext = FilenameUtils.getExtension(tempFileName).toLowerCase();
				// if(ext.toLowerCase().equals("png") || ext.toLowerCase().equals("gif") ||
				// ext.toLowerCase().equals("jpg") || ext.toLowerCase().equals("jpeg"))
				if (ConstDef.IMAGE_FILE_EXT.indexOf(ext.toLowerCase()) >= 0) {
					ext = "image";
				} else {
					ext = "video";
				}
				// Log.Debug("FileName=%s",tempFileName);
				JSONObject obj = new JSONObject();

				obj.put("imgPath", tempFileName);
				obj.put("ext", ext);
				array.add(obj);
			}
		}

		return array;
	}

	@SuppressWarnings("unchecked")
	public JSONArray fileAttrList(String filePath, String webRoot) {
		JSONArray array = new JSONArray();
		Path pathFolder = null;
		if (ConstDef.SAVE_ROOT_OUT) {
			pathFolder = Paths.get(this.getOutRootPath(webRoot) + filePath);
		} else {
			pathFolder = Paths.get(this.getRootPath(webRoot) + filePath);
		}

		File dirFile = new File(pathFolder.toString());
		File[] fileList = dirFile.listFiles();
		if (fileList == null) {
			return null;
		}
		for (File tempFile : fileList) {
			if (tempFile.isFile() && !tempFile.isHidden()) {
				BasicFileAttributes attr = null;
				String tempFileName = pathFolder.toString() + "/" + tempFile.getName();
				Path path = Paths.get(tempFileName);
				try {
					attr = Files.readAttributes(path, BasicFileAttributes.class);
				} catch (IOException e) {
					Log.Error(e.getMessage());
					return null;
				}

				// Log.Debug("FileName=%s",tempFileName);
				JSONObject obj = new JSONObject();

				obj.put("filePath", tempFileName);
				obj.put("createdTime", attr.creationTime().toMillis());

				array.add(obj);
			}
		}

		return array;
	}

	@SuppressWarnings("unchecked")
	public JSONArray fileListInWebRoot(String filePath, String webRoot) {
		JSONArray array = new JSONArray();
		Path pathFolder = null;
		pathFolder = Paths.get(this.getRootPath(webRoot) + filePath);

		File dirFile = new File(pathFolder.toString());
		File[] fileList = dirFile.listFiles();
		if (fileList == null) {
			return null;
		}
		for (File tempFile : fileList) {
			if (tempFile.isFile() && !tempFile.isHidden()) {
				// String tempPath=tempFile.getParent();
				String tempFileName = filePath + tempFile.getName();
				String ext = FilenameUtils.getExtension(tempFileName).toLowerCase();
				if (ext.toLowerCase().equals("png") || ext.toLowerCase().equals("gif") || ext.toLowerCase().equals("jpg")
						|| ext.toLowerCase().equals("jpeg")) {
					ext = "image";
				} else {
					ext = "video";
				}
				Log.Debug("FileName=%s", tempFileName);
				JSONObject obj = new JSONObject();

				obj.put("imgPath", tempFileName);
				obj.put("ext", ext);
				array.add(obj);
			}
		}

		return array;
	}

	public String readFileInWebRoot(String path, String webRoot) {
		String result = "";
		Path pathFile = null;
		pathFile = Paths.get(this.getRootPath(webRoot) + path);
		Charset cs = StandardCharsets.UTF_8;
		// 파일 내용담을 리스트
		List<String> list = new ArrayList<String>();
		try {
			list = Files.readAllLines(pathFile, cs);
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (String readLine : list) {
			result += readLine;
		}
		return result;
	}

	public String getAbsolutePath(String filename, String webRoot) {
		Path file = null;
		if (ConstDef.SAVE_ROOT_OUT) {
			file = Paths.get(this.getOutRootPath(webRoot) + filename);
		} else {
			file = Paths.get(this.getRootPath(webRoot) + filename);
		}
		return file.toString();
	}

	public Path excelWrite(ExcelWrite wr, String filename, String webRoot, String filePath) {
		Path pathFolder = null;
		Path pathFile = null;
		if (ConstDef.SAVE_ROOT_OUT) {
			pathFolder = Paths.get(this.getOutRootPath(webRoot) + filePath);
			pathFile = Paths.get(this.getOutRootPath(webRoot) + filename);
		} else {
			pathFolder = Paths.get(this.getRootPath(webRoot) + filePath);
			pathFile = Paths.get(this.getRootPath(webRoot) + filename);
		}
		if (!Files.exists(pathFolder)) {
			try {
				Files.createDirectories(pathFolder);
			} catch (IOException e) {
				Log.Error(e.getMessage());
				return null;
			}
		}

		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fos = new FileOutputStream(pathFile.toString());
			bos = new BufferedOutputStream(fos);
			wr.getXSSFWorkbook().write(bos);
		} catch (Exception e1) {
			Log.Error("ez_download Exception: %s", e1.toString());
			return null;
		} finally {
			wr.closeWorkBook();
			if (bos != null) {
				try {
					bos.close();
				} catch (IOException e1) {
					Log.Error(e1.toString());
				}
			}

		}

		return pathFile;
	}

	public Path getSitePath(String webPath) {
		String rootPath = null;
		rootPath = servletContext.getRealPath(webPath);
		Log.Debug(rootPath);
		return Paths.get(rootPath);

	}

	public String readFileInsite(String fileName) {
		String result = "";
		Path pathFile = null;
		pathFile = getSitePath(fileName);
		Charset cs = StandardCharsets.UTF_8;
		// 파일 내용담을 리스트
		List<String> list = new ArrayList<String>();
		try {
			list = Files.readAllLines(pathFile, cs);
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (String readLine : list) {
			result += readLine;
		}
		return result;
	}

}
