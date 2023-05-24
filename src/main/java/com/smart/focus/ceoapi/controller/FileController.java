package com.smart.focus.ceoapi.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smart.focus.ceoapi.Interceptor.PreAuth;
import com.smart.focus.ceoapi.common.BadRequestException;
import com.smart.focus.ceoapi.common.ConstDef;
import com.smart.focus.ceoapi.common.GeneralException;
import com.smart.focus.ceoapi.common.Log;
import com.smart.focus.ceoapi.common.Msg;
import com.smart.focus.ceoapi.common.MultipartFileSender;
import com.smart.focus.ceoapi.domain.UserDO;
import com.smart.focus.ceoapi.service.FileServiceImpl;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

@RestController
@CrossOrigin(allowCredentials = "true", originPatterns = "*")
@RequestMapping("/restApi")
public class FileController {

	@Autowired
	private FileServiceImpl fileService;

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/myPhotoUpload", method = RequestMethod.POST, headers = "Accept=application/json")
	public String myPhotoUpload(HttpServletResponse response, HttpServletRequest request,
			@RequestParam(value = "file", required = false) MultipartFile[] files) {
		JSONObject rep = new JSONObject();
		for (MultipartFile file : files) {
			Log.Debug(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" + file.getOriginalFilename() + "////" + file.getSize());
		}

		UserDO user = (UserDO) request.getSession().getAttribute(ConstDef.SESSION_USER_INFO);
		String uuidImg = null;

		for (int i = 0; i < files.length; i++) {
			long fileSize = files[i].getSize();
			if (fileSize != 0) {
				try {
					uuidImg = "/content/photo/" + user.getUserId() + ".png";
					fileService.store(files[i], uuidImg, ConstDef.WEB_ROOT, "/content/photo");
				} catch (Exception ex) {
					Log.Error(ex.getMessage());
					GeneralException.exception(response, ex.getMessage(), Msg.NO_COMMON_FAIL);
					return null;

				}
			}
		}

		rep.put("RESULT", "SUCCESS");
		rep.put("PATH", uuidImg);
		return rep.toJSONString();
	}

	@PreAuth
	@RequestMapping(value = "/imgLoad", method = RequestMethod.GET, headers = "Accept=application/json")
	@ResponseBody
	public ResponseEntity<Resource> loadFileAns(
			@RequestParam(value = "file", required = true, defaultValue = "") String fileUid) {
		// Log.Debug("PollController::loadFileAns - %s", fileUid);
		try {

			Resource file = fileService.loadFile(fileUid, ConstDef.WEB_ROOT);

			return ResponseEntity.ok()
					.header(HttpHeaders.CONTENT_DISPOSITION,
							"attachment; filename=\"" + ((org.springframework.core.io.Resource) file).getFilename() + "\"")
					.body(file);

		} catch (Exception e) {
			Log.Error("PollController::loadFileAns - %s", e.getMessage());

			throw new BadRequestException(e.getMessage());
		}
	}

	@PreAuth
	@RequestMapping(value = "/imgLoadAll", method = RequestMethod.GET, headers = "Accept=application/json")
	@ResponseBody
	public ResponseEntity<Resource> loadFileAnsAll(
			@RequestParam(value = "file", required = true, defaultValue = "") String fileUid) {
		Log.Debug("PollController::loadFileAns - %s", fileUid);
		try {

			Resource file = fileService.loadFile(fileUid, ConstDef.WEB_ROOT);

			return ResponseEntity.ok()
					.header(HttpHeaders.CONTENT_DISPOSITION,
							"attachment; filename=\"" + ((org.springframework.core.io.Resource) file).getFilename() + "\"")
					.body(file);

		} catch (Exception e) {
			Log.Error("PollController::loadFileAns - %s", e.getMessage());

			throw new BadRequestException(e.getMessage());
		}
	}

	@PreAuth
	@RequestMapping(value = "/mediaLoadAsync", method = RequestMethod.GET)
	public StreamingResponseBody mediaLoadAsync(
			@RequestParam(value = "file", required = true, defaultValue = "") String fileName) throws Exception {
		Log.Debug("PollController::loadFileAns - %s", fileName);

		Path filePath = fileService.getFilePath(fileName, ConstDef.WEB_ROOT);
		final InputStream is = new FileInputStream(filePath.toFile());
		return os -> {
			readAndWrite(is, os);
		};
	}

	public void readAndWrite(final InputStream is, OutputStream os) throws IOException {

		byte[] data = new byte[2048];
		int read = 0;
		while ((read = is.read(data)) > 0) {
			os.write(data, 0, read);
		}
		os.flush();
	}

	@PreAuth
	@RequestMapping(value = "/mediaLoad", method = RequestMethod.GET)
	public void mediaLoad(HttpServletResponse response, HttpServletRequest request,
			@RequestParam(value = "file", required = true, defaultValue = "") String fileName) {

		Log.Debug("/mediaLoad fileName=%s", fileName);
		Path filePath = fileService.getFilePath(fileName, ConstDef.WEB_ROOT);
		try {
			MultipartFileSender.fromFile(new File(filePath.toString()))
					.with(request)
					.with(response)
					.serveResource();
		} catch (Exception e) {
			Log.Error(e.getMessage());
		}
	}

	@PreAuth
	@RequestMapping(value = "/mediaLoad/{path0}/{path1}/{fileName:.+}", method = { RequestMethod.GET,
			RequestMethod.POST })
	public void mediaLoad0(HttpServletResponse response, HttpServletRequest request,
			@PathVariable String path0, @PathVariable String path1, @PathVariable String fileName) {

		Log.Debug("/mediaLoad fileName = %s", fileName);
		String path = "/" + path0 + "/" + path1 + "/" + fileName;
		Path filePath = fileService.getFilePath(path, ConstDef.WEB_ROOT);
		try {
			MultipartFileSender.fromFile(new File(filePath.toString()))
					.with(request)
					.with(response)
					.serveResource();
		} catch (Exception e) {
			Log.Error(e.getMessage());
		}
	}

	@PreAuth
	@RequestMapping(value = "/mediaLoad/{path0}/{path1}/{path3}/{fileName:.+}", method = { RequestMethod.GET,
			RequestMethod.POST })
	public void mediaLoad1(HttpServletResponse response, HttpServletRequest request,
			@PathVariable String path0, @PathVariable String path1, @PathVariable String path3,
			@PathVariable String fileName) {

		Log.Debug("/mediaLoad fileName = %s", fileName);
		String path = "/" + path0 + "/" + path1 + "/" + path3 + "/" + fileName;
		Path filePath = fileService.getFilePath(path, ConstDef.WEB_ROOT);
		try {
			MultipartFileSender.fromFile(new File(filePath.toString()))
					.with(request)
					.with(response)
					.serveResource();
		} catch (Exception e) {
			Log.Error(e.getMessage());
		}
	}

	@PreAuth
	@RequestMapping(value = "/mediaLoad/{path0}/{path1}/{path3}/{path4}/{fileName:.+}", method = { RequestMethod.GET,
			RequestMethod.POST })
	public void mediaLoad2(HttpServletResponse response, HttpServletRequest request,
			@PathVariable String path0, @PathVariable String path1, @PathVariable String path3, @PathVariable String path4,
			@PathVariable String fileName) {

		Log.Debug("/mediaLoad fileName= %s", fileName);
		String path = "/" + path0 + "/" + path1 + "/" + path3 + "/" + path4 + "/" + fileName;
		Path filePath = fileService.getFilePath(path, ConstDef.WEB_ROOT);
		try {
			MultipartFileSender.fromFile(new File(filePath.toString()))
					.with(request)
					.with(response)
					.serveResource();
		} catch (Exception e) {
			Log.Error(e.getMessage());
		}
	}

}
