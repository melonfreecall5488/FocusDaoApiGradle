package com.smart.focus.ceoapi.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.mail.PasswordAuthentication;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.smart.focus.ceoapi.Interceptor.PreAuth;
import com.smart.focus.ceoapi.common.BadRequestException;
import com.smart.focus.ceoapi.common.CommonLib;
import com.smart.focus.ceoapi.common.ConstDef;
import com.smart.focus.ceoapi.common.GeneralException;
import com.smart.focus.ceoapi.common.Log;
import com.smart.focus.ceoapi.common.Msg;
import com.smart.focus.ceoapi.common.PacketResult;
import com.smart.focus.ceoapi.domain.MailDomain;
import com.smart.focus.ceoapi.domain.ParamModel;
import com.smart.focus.ceoapi.service.EmailServiceImpl;
import com.smart.focus.ceoapi.service.FileServiceImpl;
import com.smart.focus.ceoapi.service.SpProcServiceImpl;
import com.spire.xls.FileFormat;
import com.spire.xls.Workbook;


@RestController
@CrossOrigin(allowCredentials = "true", originPatterns = "*")
@RequestMapping("/restApi")
public class ReportController {
    
    @Autowired
    private SpProcServiceImpl storeProcService;
    
    @Autowired
		private FileServiceImpl fileService;
		
		@Autowired(required=true)
		private EmailServiceImpl emailService;
    
  @PreAuth
	@RequestMapping(value = "exportExcelPurchaseOrder", method = RequestMethod.POST)
	public ResponseEntity<Resource> exportExcelPurchaseOrder(HttpServletResponse response, HttpServletRequest request,
			@RequestBody String data) {
		Log.Debug("**exportExcelPurchaseOrder Client=%s", CommonLib.getRemoteIp(request));
		response.setContentType("application/ms-excel; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");

		JSONParser parser = new JSONParser();
		JSONObject param = null;

		try {
			param = (JSONObject) parser.parse(data);
			Log.Debug(param.toJSONString());
		} catch (Exception ex) {
			Log.Error(ex.getMessage());
			throw new BadRequestException();
		}
		String orderNo = param.get("발주번호").toString();
		String sql = String.format("SELECT * FROM %s.구매발주서_품목 A WHERE 발주번호='%s';", ConstDef.DATA_BASE, orderNo);
		List<Map<String, Object>> array = this.storeProcService.runSqlSelect(sql);
		Path pathFolder = null;
		pathFolder = Paths.get(fileService.getRootPath(ConstDef.WEB_ROOT) + "/excelTemp");

		Path outPath = null;
		InputStream fis = null;

		XSSFWorkbook workbook = null;
		XSSFSheet sheet = null;
		String outExcelFile = null;
		String excelFullPath = null;
		String pdfFile = null;

		try {
			String excelTempFileName = String.format("%s/%s.xlsx",
					pathFolder.toString(), ConstDef.PURCHASE_ORDER_FORM);
			fis = new FileInputStream(excelTempFileName);
			workbook = new XSSFWorkbook(fis); // xlsx 파일 Open
			// FormulaEvaluator evaluator =
			// workbook.getCreationHelper().createFormulaEvaluator();
			workbook.setForceFormulaRecalculation(true);
			sheet = workbook.getSheetAt(0);

			outPath = Paths.get(fileService.getOutRootPath(ConstDef.WEB_ROOT) + ConstDef.TEMP_FILE_PATH);
			Files.createDirectories(outPath);
			outExcelFile = String.format("%s.xlsx", orderNo);
			excelFullPath = outPath.toString() + "/" + outExcelFile;
			OutputStream outStream = new FileOutputStream(excelFullPath);
			pdfFile = outPath.toString() + "/" + orderNo + ".pdf";

			// sales assign

			// Long intTemp = 0l;
			// String strTemp = null;
			// String date = CommonLib.getToday("yyyy-MM-dd");

			// sheet.getRow(4).getCell(2).setCellValue(date);
			// JSONArray itemArray = (JSONArray) param.get("sales");
			// for (int i = 0; i < itemArray.size(); i++) {
			// 	strTemp = (String) ((JSONObject) itemArray.get(i)).get("코드명");
			// 	if (strTemp != null)
			// 		sheet.getRow(7 + i).getCell(2).setCellValue(strTemp);
			// 	intTemp = (Long) ((JSONObject) itemArray.get(i)).get("예상매출액");
			// 	if (intTemp != null)
			// 		sheet.getRow(7 + i).getCell(4).setCellValue(intTemp);
			// 	intTemp = (Long) ((JSONObject) itemArray.get(i)).get("납입매출액");
			// 	if (intTemp != null)
			// 		sheet.getRow(7 + i).getCell(5).setCellValue(intTemp);
			// 	intTemp = (Long) ((JSONObject) itemArray.get(i)).get("계산서금액");
			// 	if (intTemp != null)
			// 		sheet.getRow(7 + i).getCell(6).setCellValue(intTemp);
			// 	intTemp = (Long) ((JSONObject) itemArray.get(i)).get("예상부가액");
			// 	if (intTemp != null)
			// 		sheet.getRow(7 + i).getCell(7).setCellValue(intTemp);
			// }

			// itemArray = (JSONArray) param.get("coilSales");
			// for (int i = 0; i < itemArray.size(); i++) {
			// 	strTemp = (String) ((JSONObject) itemArray.get(i)).get("거래처명");
			// 	if (strTemp != null)
			// 		sheet.getRow(17 + i).getCell(2).setCellValue(strTemp);
			// 	intTemp = (Long) ((JSONObject) itemArray.get(i)).get("예상매출액");
			// 	if (intTemp != null)
			// 		sheet.getRow(17 + i).getCell(4).setCellValue(intTemp);
			// 	intTemp = (Long) ((JSONObject) itemArray.get(i)).get("사급매출액");
			// 	if (intTemp != null)
			// 		sheet.getRow(17 + i).getCell(5).setCellValue(intTemp);
			// 	intTemp = (Long) ((JSONObject) itemArray.get(i)).get("계산서금액");
			// 	if (intTemp != null)
			// 		sheet.getRow(17 + i).getCell(6).setCellValue(intTemp);
			// 	intTemp = (Long) ((JSONObject) itemArray.get(i)).get("계산서중량");
			// 	if (intTemp != null)
			// 		sheet.getRow(17 + i).getCell(7).setCellValue(intTemp);
			// }
			// itemArray = (JSONArray) param.get("scrapSales");
			// for (int i = 0; i < itemArray.size(); i++) {
			// 	intTemp = (Long) ((JSONObject) itemArray.get(i)).get("계획스크랩");
			// 	if (intTemp != null)
			// 		sheet.getRow(31 + i).getCell(4).setCellValue(intTemp);
			// 	intTemp = (Long) ((JSONObject) itemArray.get(i)).get("실적스크랩");
			// 	if (intTemp != null)
			// 		sheet.getRow(31 + i).getCell(5).setCellValue(intTemp);
			// }
			// //sacrap 금액
			// intTemp = (Long) param.get("계획스크랩금액");
			// if (intTemp != null)
			// 	sheet.getRow(32).getCell(4).setCellValue(intTemp);
			// intTemp = (Long) param.get("실적스크랩금액");
			// if (intTemp != null)
			// 	sheet.getRow(32).getCell(5).setCellValue(intTemp);

			// itemArray = (JSONArray) param.get("coilPurchase");
			// for (int i = 0; i < itemArray.size(); i++) {
			// 	strTemp = (String) ((JSONObject) itemArray.get(i)).get("코드명");
			// 	if (strTemp != null)
			// 		sheet.getRow(7 + i).getCell(13).setCellValue(strTemp);
			// 	intTemp = (Long) ((JSONObject) itemArray.get(i)).get("예상매입액");
			// 	if (intTemp != null)
			// 		sheet.getRow(7 + i).getCell(15).setCellValue(intTemp);
			// 	intTemp = (Long) ((JSONObject) itemArray.get(i)).get("실적매입액");
			// 	if (intTemp != null)
			// 		sheet.getRow(7 + i).getCell(16).setCellValue(intTemp);
			// 	intTemp = (Long) ((JSONObject) itemArray.get(i)).get("계산서금액");
			// 	if (intTemp != null)
			// 		sheet.getRow(7 + i).getCell(17).setCellValue(intTemp);
			// 	intTemp = (Long) ((JSONObject) itemArray.get(i)).get("이월금액");
			// 	if (intTemp != null)
			// 		sheet.getRow(7 + i).getCell(18).setCellValue(intTemp);
			// }
			// itemArray = (JSONArray) param.get("pressPurchasee");
			// for (int i = 0; i < itemArray.size(); i++) {
			// 	strTemp = (String) ((JSONObject) itemArray.get(i)).get("거래처명");
			// 	if (strTemp != null)
			// 		sheet.getRow(13 + i).getCell(13).setCellValue(strTemp);
			// 	intTemp = (Long) ((JSONObject) itemArray.get(i)).get("예상매입액");
			// 	if (intTemp != null)
			// 		sheet.getRow(13 + i).getCell(15).setCellValue(intTemp);
			// 	intTemp = (Long) ((JSONObject) itemArray.get(i)).get("실적매입액");
			// 	if (intTemp != null)
			// 		sheet.getRow(13 + i).getCell(16).setCellValue(intTemp);
			// 	intTemp = (Long) ((JSONObject) itemArray.get(i)).get("계산서금액");
			// 	if (intTemp != null)
			// 		sheet.getRow(13 + i).getCell(17).setCellValue(intTemp);
			// 	intTemp = (Long) ((JSONObject) itemArray.get(i)).get("이월금액");
			// 	if (intTemp != null)
			// 		sheet.getRow(13 + i).getCell(18).setCellValue(intTemp);
			// }
			// itemArray = (JSONArray) param.get("dokub");
			// for (int i = 0; i < itemArray.size(); i++) {
			// 	strTemp = (String) ((JSONObject) itemArray.get(i)).get("거래처명");
			// 	if (strTemp != null)
			// 		sheet.getRow(20 + i).getCell(13).setCellValue(strTemp);
			// 	intTemp = (Long) ((JSONObject) itemArray.get(i)).get("예상매입액");
			// 	if (intTemp != null)
			// 		sheet.getRow(20 + i).getCell(15).setCellValue(intTemp);
			// 	intTemp = (Long) ((JSONObject) itemArray.get(i)).get("실적매입액");
			// 	if (intTemp != null)
			// 		sheet.getRow(20 + i).getCell(16).setCellValue(intTemp);
			// 	intTemp = (Long) ((JSONObject) itemArray.get(i)).get("계산서금액");
			// 	if (intTemp != null)
			// 		sheet.getRow(20 + i).getCell(17).setCellValue(intTemp);
			// 	intTemp = (Long) ((JSONObject) itemArray.get(i)).get("이월금액");
			// 	if (intTemp != null)
			// 		sheet.getRow(20 + i).getCell(18).setCellValue(intTemp);
			// }
			// itemArray = (JSONArray) param.get("hardwarePurchase");
			// for (int i = 0; i < itemArray.size(); i++) {
			// 	strTemp = (String) ((JSONObject) itemArray.get(i)).get("코드명");
			// 	if (strTemp != null)
			// 		sheet.getRow(26 + i).getCell(13).setCellValue(strTemp);
			// 	intTemp = (Long) ((JSONObject) itemArray.get(i)).get("예상매입액");
			// 	if (intTemp != null)
			// 		sheet.getRow(26 + i).getCell(15).setCellValue(intTemp);
			// 	intTemp = (Long) ((JSONObject) itemArray.get(i)).get("실적매입액");
			// 	if (intTemp != null)
			// 		sheet.getRow(26 + i).getCell(16).setCellValue(intTemp);
			// 	intTemp = (Long) ((JSONObject) itemArray.get(i)).get("계산서금액");
			// 	if (intTemp != null)
			// 		sheet.getRow(26 + i).getCell(17).setCellValue(intTemp);
			// 	intTemp = (Long) ((JSONObject) itemArray.get(i)).get("이월금액");
			// 	if (intTemp != null)
			// 		sheet.getRow(26 + i).getCell(18).setCellValue(intTemp);
			// }
			workbook.write(outStream);
			fis.close();
			workbook.close();
			//Create a workbook
			Workbook blueWorkbook = new Workbook();
			try {
				//Load a file
				blueWorkbook.loadFromFile(excelFullPath);
				//Fit to page
				blueWorkbook.getConverterSetting().setSheetFitToPage(true);
				//Save to PDF file
				blueWorkbook.saveToFile(pdfFile, FileFormat.PDF);
			} finally {
				blueWorkbook.dispose();
			}
		} catch (Exception ex) {
			Log.Error(ex.getMessage());
			GeneralException.exception(response, ex.getMessage(), Msg.NO_COMMON_FAIL);
			return null;
		}
		try {
			Resource file = fileService.loadFileFullPath(pdfFile);
			Log.Debug(" ((org.springframework.core.io.Resource) file).getFilename()=%s",
					((org.springframework.core.io.Resource) file).getFilename());
			return ResponseEntity.ok()
					.header(HttpHeaders.CONTENT_DISPOSITION,
							"attachment; filename=\"" + ((org.springframework.core.io.Resource) file).getFilename() + "\"")
					.body(file);

		} catch (Exception e) {
			Log.Error("downloadPurchase Order - %s", e.getMessage());
			GeneralException.exception(response, e.getMessage(), Msg.NO_NOT_FOUND);
			return null;
		}
	}
	
	@PreAuth
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value = "sendEmailPurchaseOrder", method = RequestMethod.POST, headers = "Accept=application/json")
	public String sendEmailPurchaseOrder(HttpServletResponse response,HttpServletRequest request,
		@RequestBody ParamModel data) 
	{
		Log.Debug("sendEmailPurchaseOrder Client=%s", CommonLib.getRemoteIp(request));
		JSONObject rep = new JSONObject();
		JavaMailSenderImpl emailSender = new JavaMailSenderImpl();
		JSONParser parser = new JSONParser();
		JSONObject obj = null;
		try {
			obj  = (JSONObject) parser.parse(data.getBody());
		} catch (ParseException e1) {
			throw new BadRequestException();
		}
		// PasswordAuthentication pa = new PasswordAuthentication("kmtapb@naver.com", "Mantoman4063");
		// // emailSender.setHost("smtp.gmail.com");
		// emailSender.setPassword("Mantoman4063");
		// // emailSender.setPort(587);
		// emailSender.setUsername("kmtapb");
		// Properties prop = new Properties();
		// prop.setProperty("mail.smtp.auth", "true");
		// prop.setProperty("mail.smtp.ssl.enable", "true");
		// prop.setProperty("mail.smtp.port", "465");
		// prop.setProperty("mail.smtp.host", "smtp.naver.com");
		// prop.setProperty("mail.smtp.ssl.trust", "smtp.naver.com");


		emailSender.setHost("smtp.naver.com");
		emailSender.setPassword(".mantoman44");
		emailSender.setPort(465);
		emailSender.setUsername("kmtapb@naver.com");
		Properties prop = new Properties();
		prop.setProperty("mail.smtp.auth", "true");
		//prop.setProperty("mail.smtp.starttls.enable", "true");
		prop.put("mail.smtp.ssl.enable", "true");
    prop.put("mail.smtp.ssl.trust","smtp.naver.com");
		emailSender.setJavaMailProperties(prop);

		
		int result = 0;
		String title = "test mail";

		String content = "test 메일 입니다.";
		
		
	
		MailDomain mail = new MailDomain();
		//mail.title = String.format("%s 지급 %s 지급금 명세내역서", obj.get("driverPayoutDate").toString(), yunhapName);
		mail.title = title;
		mail.fromAddress = String.format("%s<%s>","Soo Hwan Kim", "kmtapb@naver.com");	

		mail.content = String.format("<html>");
		mail.content += String.format("<head>");
		mail.content += String.format(" <meta charset=\"utf-8\">");
		mail.content += String.format("<style type=\"text/css\">");
		mail.content += String.format("p {margin-bottom:2px;margin-top:2px;}");
		mail.content += String.format("</style>");
		mail.content += String.format("</head>");
		mail.content += String.format("<body>");
		mail.content += content;
		mail.content += String.format("</body>");
		mail.content += String.format("</html>");
		
		// Path outPath =  Paths.get(fileService.getOutRootPath(ConstDef.WEB_ROOT) + "/driverPayout/Y00000/"+obj.get("driverPayoutDate").toString());
		// File fp = null;
		try
		{
			//test code
			mail.toAddress = "melonfreecall@gmail.com";
			emailService.mailSend(mail,emailSender,false);
		}
		catch(Exception e)
		{
			Log.Error(e.getMessage());
			GeneralException.exception(response, e.getMessage(), Msg.NO_NOT_FOUND);
			return null;
		}

		rep.put("result", PacketResult.SUCCESS);
		rep.put("body", String.format("%d건 전송되었습니다.", result));	
		return rep.toJSONString();
	}
}
