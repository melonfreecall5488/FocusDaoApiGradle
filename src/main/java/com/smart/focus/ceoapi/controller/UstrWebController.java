package com.smart.focus.ceoapi.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.JsonObject;
import com.smart.focus.ceoapi.Interceptor.PreAuth;
import com.smart.focus.ceoapi.common.CommonLib;
import com.smart.focus.ceoapi.common.ConstDef;
import com.smart.focus.ceoapi.common.Json;
import com.smart.focus.ceoapi.common.Log;
import com.smart.focus.ceoapi.common.PacketResult;
import com.smart.focus.ceoapi.service.SpProcServiceImpl;
import com.smart.focus.ceoapi.service.SoapService.SoapService;
import com.smart.focus.ceoapi.service.SoapService.SoapApiClass.ByDRestApi;

@RestController
@CrossOrigin(allowCredentials = "true", originPatterns = "*")
@RequestMapping("/restApi")
public class UstrWebController {
	@Autowired
	private SpProcServiceImpl storeProcService;

	
	// 확장WEB에서 호출 : 택배/일반/매장 포함된 피킹리스트
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/picking", method = { RequestMethod.GET, RequestMethod.POST })
	public String picking(HttpServletRequest request, HttpServletResponse response,
			@RequestBody String data) {

		Log.Debug("/picking Client=%s Session=%s", CommonLib.getRemoteIp(request), request.getSession().getId());
		Log.Debug("data = %s", data);
		JSONObject obj = null;
		JSONParser parser = new JSONParser();
		JSONObject rep = new JSONObject();

		try {
			obj = (JSONObject) parser.parse(data);
		} catch (ParseException e1) {
			Log.Error(e1.getMessage());
			rep.put("IF_MES", "2");
			rep.put("NM_IF", "JSON Parsing Error");
			return rep.toJSONString();
		}
		Log.Debug(obj.toJSONString());
		JSONArray array = null;
		JSONArray pk = null;
		JSONObject sendParam = null;
		String result = null;

		if (obj.containsKey("DATA")) {
			JSONArray pData = (JSONArray) obj.get("DATA");
			array = new JSONArray();
			for (int i = 0; i < pData.size(); i++) {
				JSONObject temp = new JSONObject();
				JSONObject ar = (JSONObject) pData.get(i);
				temp.put("CD_COMPANY", ar.get("CD_COMPANY").toString());
				temp.put("TYPE_IF", ar.get("TYPE_IF").toString());
				temp.put("NO_DLVPRPS", ar.get("NO_DLVPRPS").toString());
				temp.put("DT_DLVPRPS", ar.get("DT_DLVPRPS").toString());
				temp.put("DS_CD_STORE", ar.get("DS_CD_STORE").toString());
				temp.put("RMK_DLVPRPS", ar.get("RMK_DLVPRPS").toString());
				if(ar.containsKey("NO_SALES")) {
					temp.put("NO_SALES", ar.get("NO_SALES").toString());
				}
				if(ar.containsKey("CD_CUST")) {
					temp.put("CD_CUST", ar.get("CD_CUST").toString());
				}
				JSONArray list = (JSONArray) ar.get("ARRAY");
				for (int j = 0; j < list.size(); j++) {
					temp.put("UUID", UUID.randomUUID().toString());
					JSONObject temp1 = new JSONObject();
					temp1.putAll((Map<String, Object>) temp);
					temp1.putAll((Map<String, Object>) list.get(j));
					array.add(temp1);
				}
				// delete old data
				deletePicking((JSONObject) array.get(i));
			}
			
			Log.Trace("피킹지시서 = %s", array.toJSONString());
			sendParam = new JSONObject();
			sendParam.put("table", "피킹지시서");
			sendParam.put("db", ConstDef.DATA_BASE);
			sendParam.put("ps", array);
			pk = new JSONArray();
			pk.add("TYPE_IF");
			pk.add("NO_DLVPRPS");
			pk.add("DS_CD_STORE");
			pk.add("NO_LINE");
			sendParam.put("pk", pk);
			result = storeProcService.insetOrNoupdateRuntimeSql(sendParam);
			if (result != null) {
				Log.Error("Picking List Save Error");
				rep.put("IF_MES", "2");
				rep.put("NM_IF", "Picking List Save Error");
				return rep.toJSONString();
			}
			Log.Trace("Picking Insert completed");
		} else {
			Log.Error("Picking List Empty");
			rep.put("IF_MES", "2");
			rep.put("NM_IF", "Picking List Empty");
			return rep.toJSONString();
		}

		rep.put("IF_MES", "1");
		rep.put("NM_IF", "SUCCESS");
		return rep.toJSONString();
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/pickingDelete", method = { RequestMethod.GET, RequestMethod.POST })
	public String pickingDelete(HttpServletRequest request, HttpServletResponse response,
			@RequestBody String data) {
		Log.Debug("/pickingDelete Client=%s Session=%s", CommonLib.getRemoteIp(request), request.getSession().getId());
		Log.Debug(data.toString());
		JSONObject param = null;
		JSONParser parser = new JSONParser();
		JSONObject rep = new JSONObject();
		if (checkRemoteIp(CommonLib.getRemoteIp(request)) == false) {
			Log.Trace("인가되지 않은 ip");
			rep.put("IF_MES", "2");
			rep.put("NM_IF", "Auth Fail");
			return rep.toJSONString();
		}

		try {
			param = (JSONObject) parser.parse(data);
		} catch (ParseException e1) {
			Log.Error(e1.getMessage());
			rep.put("IF_MES", "2");
			rep.put("NM_IF", "JSON Parsing Error");
			return rep.toJSONString();
		}
		deletePicking((JSONObject) param);
		Log.Trace("deletePicking Delete completed");

		rep.put("IF_MES", "1");
		rep.put("NM_IF", "SUCCESS");
		return rep.toJSONString();
	}

	@SuppressWarnings("unchecked")
	void deletePicking(JSONObject order) {
		JSONObject sendParam = new JSONObject();
		JSONArray array = new JSONArray();
		JSONObject ps = new JSONObject();
		ps.put("noDlvprps", order.get("NO_DLVPRPS").toString());
		ps.put("typeIf", order.get("TYPE_IF").toString());
		ps.put("dsCdStore", order.get("DS_CD_STORE").toString());
		array.add(ps);

		sendParam.put("proc", "spDeletePickinByKey");
		sendParam.put("db", ConstDef.DATA_BASE);
		sendParam.put("ps", array);
		Log.Debug("DELETE Picking=%s", sendParam.toJSONString());
		storeProcService.update(sendParam);
	}
	// 확장WEB에서 호출 : 패킹검수
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/orderInfo", method = { RequestMethod.GET, RequestMethod.POST })
	public String orderInfo(HttpServletRequest request, HttpServletResponse response,
			@RequestBody String data) {

		Log.Debug("/orderInfo Client=%s Session=%s", CommonLib.getRemoteIp(request), request.getSession().getId());
		Log.Debug(data);
		JSONArray array = null;
		JSONParser parser = new JSONParser();
		JSONObject rep = new JSONObject();
		JSONObject obj = null;

		try {
			obj = (JSONObject) parser.parse(data);
		} catch (ParseException e1) {
			Log.Error(e1.getMessage());
			rep.put("IF_MES", "2");
			rep.put("NM_IF", "JSON Parsing Error");
			return rep.toJSONString();
		}
		JSONArray pData = (JSONArray) obj.get("DATA");
		array = new JSONArray();
		for (int i = 0; i < pData.size(); i++) {
			JSONObject temp = new JSONObject();
			JSONObject ar = (JSONObject) pData.get(i);
			temp.put("CD_COMPANY", ar.get("CD_COMPANY").toString());
			temp.put("TYPE_IF", ar.get("TYPE_IF").toString());
			temp.put("DT_DLVPRPS", ar.get("DT_DLVPRPS").toString());
			temp.put("NO_SALES", ar.get("NO_SALES").toString());
			temp.put("NO_ORD", ar.get("NO_ORD").toString());
			if (ar.get("TYPE_IF").toString().equals(ConstDef.STORE_PICK)) {
				temp.put("NM_CUST", ar.get("DS_NM_STORE").toString());
			} else {
				temp.put("NM_CUST", ar.get("NM_CUST").toString());
			}
			temp.put("DS_NM_STORE", ar.get("DS_NM_STORE").toString());
			JSONArray list = (JSONArray) ar.get("ARRAY");
			for (int j = 0; j < list.size(); j++) {
				JSONObject temp1 = new JSONObject();
				temp1.putAll((Map<String, Object>) temp);
				temp1.putAll((Map<String, Object>) list.get(j));
				array.add(temp1);
			}
		}

		JSONObject sendParam = new JSONObject();
		sendParam.put("table", "패킹검수요청");
		sendParam.put("db", ConstDef.DATA_BASE);
		sendParam.put("ps", array);
		JSONArray pk = new JSONArray();
		pk.add("NO_SALES");
		pk.add("NO_LINE");
		pk.add("TYPE_IF");

		sendParam.put("pk", pk);
		String result = storeProcService.insertOrupdateRuntimeSql(sendParam);
		if (result != null) {
			Log.Error("Packing List Save Error");
			rep.put("IF_MES", "2");
			rep.put("NM_IF", "Picking List Save Error");
			return rep.toJSONString();
		}
		Log.Trace("Order Info Insert completed");

		rep.put("IF_MES", "1");
		rep.put("NM_IF", "SUCCESS");
		return rep.toJSONString();
	}
	
	// 확장WEB에서 호출 : 택배포장/추로 리스트
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/packing", method = { RequestMethod.GET, RequestMethod.POST })
	public String packing(HttpServletRequest request, HttpServletResponse response,
			@RequestBody String data) {

		Log.Debug("/packing Client=%s Session=%s", CommonLib.getRemoteIp(request), request.getSession().getId());
		Log.Debug(data.toString());
		JSONArray array = null;
		JSONParser parser = new JSONParser();
		JSONObject rep = new JSONObject();
		JSONObject obj = null;

		try {
			obj = (JSONObject) parser.parse(data);
		} catch (ParseException e1) {
			Log.Error(e1.getMessage());
			rep.put("IF_MES", "2");
			rep.put("NM_IF", "JSON Parsing Error");
			return rep.toJSONString();
		}
		JSONArray pData = (JSONArray) obj.get("DATA");
		array = new JSONArray();
		for (int i = 0; i < pData.size(); i++) {
			array.clear();
			JSONObject temp = new JSONObject();
			JSONObject ar = (JSONObject) pData.get(i);
			temp.put("CD_COMPANY", ar.get("CD_COMPANY").toString());
			temp.put("DT_PACK", ar.get("DT_PACK").toString());
			temp.put("TYPE_IF", ar.get("TYPE_IF").toString());
			temp.put("NO_SALES", ar.get("NO_SALES").toString());
			temp.put("NO_ORD", ar.get("NO_ORD").toString());
			if(ar.containsKey("CD_DISTBROUT")) {
				temp.put("CD_DISTBROUT", ar.get("CD_DISTBROUT").toString());
			}
			temp.put("ASSIG_WBL", ar.get("ASSIG_WBL").toString());
			temp.put("CD_CUST", ar.get("CD_CUST") == null ? null:ar.get("CD_CUST").toString());
			temp.put("NM_CUST", ar.get("NM_CUST").toString());
			if (ar.get("TYPE_IF").toString().equals(ConstDef.STORE_PICK)) {
				temp.put("CD_CUST", ar.get("DS_CD_STORE").toString());
				temp.put("NM_CUST", ar.get("DS_NM_STORE").toString());
			}
			temp.put("DS_CD_STORE", ar.get("DS_CD_STORE").toString());
			temp.put("DS_NM_STORE", ar.get("DS_NM_STORE").toString());
			if (ar.containsKey("CD_WAREHOUSE")) {
				temp.put("CD_WAREHOUSE", ar.get("CD_WAREHOUSE").toString());				
			} else {
				temp.put("CD_WAREHOUSE", "");
			}
			temp.put("CD_CENTER", ar.get("CD_CENTER").toString());
			temp.put("NM_CENTER", ar.get("NM_CENTER").toString());
			temp.put("CD_COS", ar.get("CD_COS").toString());
			if (ar.containsKey("CD_LABEL")) {
				temp.put("CD_LABEL", ar.get("CD_LABEL").toString());
			}	
			temp.put("NM_CARGO", ar.get("NM_CARGO").toString());
			temp.put("TXT_ADDR", ar.get("TXT_ADDR").toString());
			temp.put("NO_TEL", ar.get("NO_TEL").toString());
			temp.put("NO_PHONE", ar.get("NO_PHONE").toString());
			temp.put("barCode1", ar.get("BAR_CODE1").toString());
			if (ar.containsKey("CD_COSTCENTER")) {
				temp.put("CD_COSTCENTER", ar.get("CD_COSTCENTER").toString());
			}

			JSONArray list = (JSONArray) ar.get("ARRAY");
			for (int j = 0; j < list.size(); j++) {
				JSONObject temp1 = new JSONObject();
				temp1.putAll((Map<String, Object>) temp);
				temp1.putAll((Map<String, Object>) list.get(j));
				Log.Debug(getClass(), temp1.toJSONString());
				array.add(temp1);
			}
		
			JSONObject sendParam = new JSONObject();
			sendParam.put("table", "패킹리스트");
			sendParam.put("db", ConstDef.DATA_BASE);
			sendParam.put("ps", array);
			JSONArray pk = new JSONArray();
			pk.add("NO_SALES");
			pk.add("ASSIG_WBL");
			pk.add("CD_ITEM");
			pk.add("NO_LINE");
			pk.add("CD_IDENTSTOCK");
			sendParam.put("pk", pk);

			String result = storeProcService.insetOrNoupdateRuntimeSql(sendParam);
			if (result != null) {
				Log.Error("Packing List Save Error");
				rep.put("IF_MES", "2");
				rep.put("NM_IF", "Packing List Save Error");
				return rep.toJSONString();
			}
			Log.Trace("Packing Insert completed");
		}

		rep.put("IF_MES", "1");
		rep.put("NM_IF", "SUCCESS");
		return rep.toJSONString();
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/packingDelete", method = { RequestMethod.GET, RequestMethod.POST })
	public String postPackingDelete(HttpServletRequest request, HttpServletResponse response,
			@RequestBody String data) {

		Log.Debug("/postPackingDelete Client=%s Session=%s", CommonLib.getRemoteIp(request), request.getSession().getId());
		Log.Debug(data.toString());
		JSONObject param = null;
		JSONParser parser = new JSONParser();
		JSONObject rep = new JSONObject();
		if (checkRemoteIp(CommonLib.getRemoteIp(request)) == false) {
			Log.Trace("인가되지 않은 ip");
			rep.put("IF_MES", "2");
			rep.put("NM_IF", "Auth Fail");
			return rep.toJSONString();
		}

		try {
			param = (JSONObject) parser.parse(data);
		} catch (ParseException e1) {
			Log.Error(e1.getMessage());
			rep.put("IF_MES", "2");
			rep.put("NM_IF", "JSON Parsing Error");
			return rep.toJSONString();
		}
		deletePacking((JSONObject) param, "패킹리스트");
		Log.Trace("deletePacking Delete completed");

		rep.put("IF_MES", "1");
		rep.put("NM_IF", "SUCCESS");
		return rep.toJSONString();
	}
	@SuppressWarnings("unchecked")
	void deletePacking(JSONObject order, String table) {
		JSONObject sendParam = new JSONObject();
		JSONArray array = new JSONArray();
		JSONObject ps = new JSONObject();
		ps.put("typeIf", order.get("TYPE_IF").toString());
		ps.put("noSales", order.get("NO_SALES").toString());
		ps.put("assigWbl", order.get("ASSIG_WBL").toString());
		ps.put("table", table);
		array.add(ps);

		sendParam.put("proc", "spDeletePackinByNoSales");
		sendParam.put("db", ConstDef.DATA_BASE);
		sendParam.put("ps", array);
		Log.Debug("DELETE Packing NO_SALES =%s", order.get("NO_SALES").toString());
		storeProcService.update(sendParam);
	}
	
	// POP에서 호출 
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/reqAdcodeCheck", method = { RequestMethod.GET, RequestMethod.POST })
	public String reqAdcodeCheck(HttpServletRequest request, HttpServletResponse response,
			@RequestBody String data) {

		Log.Debug("/reqAdcodeCheck Client=%s Session=%s", CommonLib.getRemoteIp(request), request.getSession().getId());
		JSONObject obj = null;
		JSONParser parser = new JSONParser();
		JSONObject rep = new JSONObject();

		try {
			obj = (JSONObject) parser.parse(data);
		} catch (ParseException e1) {
			Log.Error(e1.getMessage());
			rep.put("IF_MES", "2");
			rep.put("NM_IF", "JSON Parsing Error");
			return rep.toJSONString();
		}
		Log.Debug(obj.toJSONString());
		JSONArray array = null;
		JSONArray pk = null;
		JSONObject sendParam = null;
		String result = null;

		if (obj.containsKey("DATA")) {
			JSONArray pData = (JSONArray) obj.get("DATA");
			array = new JSONArray();
			for (int i = 0; i < pData.size(); i++) {
				JSONObject temp = new JSONObject();
				JSONObject ar = (JSONObject) pData.get(i);
				temp.put("CD_COMPANY", ar.get("CD_COMPANY").toString());
				temp.put("DT_PACK", ar.get("DT_PACK").toString());
				temp.put("TYPE_IF", ar.get("TYPE_IF").toString());
				temp.put("NO_SALES", ar.get("NO_SALES").toString());
				temp.put("NO_ORD", ar.get("NO_ORD").toString());
				temp.put("ASSIG_WEL", ar.get("ASSIG_WEL").toString());
				temp.put("NM_CUST", ar.get("NM_CUST").toString());
				JSONArray list = (JSONArray) ar.get("ARRAY");
				for (int j = 0; j < list.size(); j++) {
					JSONObject temp1 = new JSONObject();
					temp1.putAll((Map<String, Object>) temp);
					temp1.putAll((Map<String, Object>) list.get(j));
					array.add(temp1);
				}
				// delete old data
				deleteAdcodeChecking((JSONObject) array.get(i));
			}

			Log.Trace("ADCODE CHECK = %s", array.toJSONString());
			sendParam = new JSONObject();
			sendParam.put("table", "ADCODE_CHECK");
			sendParam.put("db", ConstDef.DATA_BASE);
			sendParam.put("ps", array);
			pk = new JSONArray();
			pk.add("NO_SALES");
			pk.add("CD_ITEM");
			sendParam.put("pk", pk);
			result = storeProcService.insertOrupdateRuntimeSql(sendParam);
			if (result != null) {
				Log.Error("adcode check list Save Error");
				rep.put("IF_MES", "2");
				rep.put("NM_IF", "adcode check List Save Error");
				return rep.toJSONString();
			}
			Log.Trace("Adcode check list Insert completed");
		}


		rep.put("IF_MES", "1");
		rep.put("NM_IF", "SUCCESS");
		return rep.toJSONString();

	}
	void deleteAdcodeChecking(JSONObject order) {
		Log.Debug("DELETE ADCODE_CHECK NO_SALES =%s", order.get("NO_SALES").toString());
		String sql = String.format("DELETE FROM %s.ADCODE_CHECK WHERE NO_SALES='%s';", ConstDef.DATA_BASE,
				order.get("NO_SALES").toString());
		storeProcService.directCallSql(sql);
	}
	// 확장WEB에서 호출 : 판매상품 반송리스트
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/takeBack", method = { RequestMethod.GET, RequestMethod.POST })
	public String returnList(HttpServletRequest request, HttpServletResponse response,
			@RequestBody String data) {

		Log.Debug("/takeBack=%s*************************************************", request.getSession().getId());
		Log.Debug(data.toString());
		JSONArray objArray = null;
		JSONParser parser = new JSONParser();
		JSONObject rep = new JSONObject();

		try {
			objArray = (JSONArray) parser.parse(data);
		} catch (ParseException e1) {
			Log.Error(e1.getMessage());
			rep.put("IF_MES", "2");
			rep.put("NM_IF", "JSON Parsing Error");
			return rep.toJSONString();
		}
		Log.Debug(objArray.toJSONString());

		JSONArray array = new JSONArray();
		for (int i = 0; i < objArray.size(); i++) {
			JSONObject temp = (JSONObject) ((JSONObject) objArray.get(i)).get("DATA");
			JSONArray list = (JSONArray) temp.get("ARRAY");
			for (int j = 0; j < list.size(); j++) {
				JSONObject temp1 = new JSONObject();
				temp1.putAll((Map<String, Object>) temp);
				temp1.putAll((Map<String, Object>) list.get(j));
				temp1.remove("ARRAY");
				array.add(temp1);
			}
		}
		Log.Trace("반품리스트 = %s", array.toJSONString());
		JSONObject sendParam = new JSONObject();
		sendParam.put("table", "출고반품리스트");
		sendParam.put("db", ConstDef.DATA_BASE);
		sendParam.put("ps", array);
		JSONArray pk = new JSONArray();
		pk.add("TYPE_IF");
		pk.add("NO_DLVREQD");
		pk.add("SITELOGISTICSLOTMATERIALOUTPUTUUID");
		sendParam.put("pk", pk);
		String result = storeProcService.insertOrupdateRuntimeSql(sendParam);
		if (result != null) {
			Log.Error("반품리스트 List Save Error");
			rep.put("IF_MES", "2");
			rep.put("NM_IF", "반품리스트 List Save Error");
			return rep.toJSONString();
		}
		Log.Trace("return Insert completed");

		rep.put("IF_MES", "1");
		rep.put("NM_IF", "SUCCESS");
		return rep.toJSONString();
	}
	
	// set상품 구성/해체 요청
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/reqSet", method = { RequestMethod.GET, RequestMethod.POST })
	public String reqSet(HttpServletRequest request, HttpServletResponse response,
			@RequestBody String data) {

		Log.Debug("/reqSet=%s*************************************************", request.getSession().getId());
		Log.Debug(data.toString());
		JSONObject obj= null;
		JSONParser parser = new JSONParser();
		JSONObject rep = new JSONObject();

		try {
			obj = (JSONObject) parser.parse(data);
		} catch (ParseException e1) {
			Log.Error(e1.getMessage());
			rep.put("IF_MES", "2");
			rep.put("NM_IF", "JSON Parsing Error");
			return rep.toJSONString();
		}
		Log.Debug(obj.toJSONString());
		JSONArray array = null;
		JSONArray pk = null;
		JSONObject sendParam = null;
		String result = null;

		if (obj.containsKey("DATA")) {
			JSONArray pData = (JSONArray) obj.get("DATA");
			array = new JSONArray();
			for (int i = 0; i < pData.size(); i++) {
				JSONObject temp = new JSONObject();
				JSONObject ar = (JSONObject) pData.get(i);
				temp.put("CD_COMPANY", ar.get("CD_COMPANY").toString());
				temp.put("TYPE_IF", ar.get("TYPE_IF").toString());
				temp.put("NO_REQ", ar.get("NO_REQ").toString());
				temp.put("CD_ITEM_SET", ar.get("CD_ITEM_SET").toString());
				temp.put("NM_ITEM_SET", ar.get("NM_ITEM_SET").toString());
				temp.put("QT_SET", ar.get("QT_SET").toString());
				JSONArray list = (JSONArray) ar.get("ARRAY");
				for (int j = 0; j < list.size(); j++) {
					JSONObject temp1 = new JSONObject();
					temp1.putAll((Map<String, Object>) temp);
					temp1.putAll((Map<String, Object>) list.get(j));
					array.add(temp1);
				}
			}

			Log.Trace("새트상품구성해체 = %s", array.toJSONString());
			sendParam = new JSONObject();
			sendParam.put("table", "새트상품구성해체");
			sendParam.put("db", ConstDef.DATA_BASE);
			sendParam.put("ps", array);
			pk = new JSONArray();
			pk.add("TYPE_IF");
			pk.add("NO_REQ");
			pk.add("CD_ITEM");
			sendParam.put("pk", pk);
			result = storeProcService.insertOrupdateRuntimeSql(sendParam);
			if (result != null) {
				Log.Error("새트상품구성해체 list Save Error");
				rep.put("IF_MES", "2");
				rep.put("NM_IF", "새트상품구성해체 List Save Error");
				return rep.toJSONString();
			}
			Log.Trace("새트상품구성해체 list Insert completed");
		}

		rep.put("IF_MES", "1");
		rep.put("NM_IF", "SUCCESS");
		return rep.toJSONString();
	}
	// ***************************************************************************************************
	// *******************************  POP에서 호출  ******************************************************
	// ***************************************************************************************************
	// 피킹결과 확장웹 전송
	@SuppressWarnings({ "unchecked" })
	@PreAuth
	@RequestMapping(value = "/updateToUstraPicking/{typeIf}", method = { RequestMethod.GET, RequestMethod.POST })
	public String updateToUstraPostPicking(HttpServletRequest request, HttpServletResponse response,
			@PathVariable String typeIf) {
		Log.Debug("updateToUstraPicking Client=%s Session Id= %s", CommonLib.getRemoteIp(request),
				request.getSession().getId());
		JSONObject rep = new JSONObject();

		String sql = String.format(
				"select  NO_DLVPRPS as taskId, TYPE_IF as typeIf, DS_CD_STORE AS dsCdStore from %s.피킹지시서 where TYPE_IF='%s' AND 피킹완료=true and SAP_UPDATED=false GROUP BY TYPE_IF,NO_DLVPRPS,DS_CD_STORE;",
				ConstDef.DATA_BASE, typeIf);
		List<Map<String, Object>> taskId = storeProcService.runSqlSelect(sql);

		for (int i = 0; i < taskId.size(); i++) {
			JSONObject sendParam = new JSONObject();
			JSONObject ps = new JSONObject();
			ps.put("taskId", taskId.get(i).get("taskId").toString());
			ps.put("typeIf", taskId.get(i).get("typeIf").toString());
			ps.put("dsCdStore", taskId.get(i).get("dsCdStore").toString());
			sendParam.put("proc", "spFindAllPickingResultByTaskId");
			sendParam.put("db", ConstDef.DATA_BASE);
			sendParam.put("ps", ps);
			List<Map<String, Object>> pickingList = storeProcService.select(sendParam);
			if (pickingList.size() == 0) {
				continue;
			}
			JSONObject list = buildJsonPicking(pickingList, typeIf);
			Log.Trace("Post picking send = %s", list.toJSONString());
			String result = ByDRestApi.sendPickingResult(list);
			if (result == null) {
				rep.put("result", PacketResult.SAP_EXCEPTION);
				rep.put("body", "FAIL");
				return rep.toJSONString();
			}
			Log.Debug("send picking list result=%s", result);
			JSONParser parser = new JSONParser();
			try {
				JSONObject jsonResult = (JSONObject) parser.parse(result);
				if (jsonResult.get("IF_MES").toString().equals("1")) {
					sql = String.format(
							"update %s.피킹지시서 set SAP_UPDATED=true where TYPE_IF='%s' AND NO_DLVPRPS='%s' AND DS_CD_STORE='%s';",
							ConstDef.DATA_BASE,
							typeIf,
							taskId.get(i).get("taskId").toString(),
							taskId.get(i).get("dsCdStore").toString());
					storeProcService.directCallSql(sql);
				} else {
					Log.Error("picking result error msg=%s", jsonResult.get("NM_IF").toString());
					rep.put("result", PacketResult.ERR_SERVER);
					rep.put("body", "피킹지시서 업데이트 에러");
					return rep.toJSONString();
				}
			} catch (ParseException e) {
				Log.Error(e.getMessage());
				rep.put("result", PacketResult.SAP_EXCEPTION);
				rep.put("body", "FAIL");
				return rep.toJSONString();
			}
		}
		rep.put("result", PacketResult.SUCCESS);
		rep.put("body", "SUCCESS");
		return rep.toJSONString();
	}
	@SuppressWarnings({ "unchecked" })
	@PreAuth
	@RequestMapping(value = "/updateToUstraPackingResult/{typeIf}", method = { RequestMethod.GET, RequestMethod.POST })
	public String updateToUstraPAckingResult(HttpServletRequest request, HttpServletResponse response,
			@PathVariable String typeIf) {
		Log.Debug("updateToUstraPAckingResult Client=%s Session Id= %s", CommonLib.getRemoteIp(request),
				request.getSession().getId());

		JSONObject rep = new JSONObject();
		String sql = String.format(
				"select distinct NO_SALES as taskId from %s.패킹리스트 where TYPE_IF='%s' AND 출고확인=true AND USTRA_UPDATED=false;",
				ConstDef.DATA_BASE, typeIf);
		List<Map<String, Object>> taskId = storeProcService.runSqlSelect(sql);
		for (int i = 0; i < taskId.size(); i++) {
			JSONObject sendParam = new JSONObject();
			JSONObject ps = new JSONObject();
			ps.put("noSales", taskId.get(i).get("taskId").toString());
			ps.put("typeIf", typeIf);
			sendParam.put("proc", "spFindAllPackingByDateAndTypeAndNoSales");
			sendParam.put("db", ConstDef.DATA_BASE);
			sendParam.put("ps", ps);
			List<Map<String, Object>> packingList = storeProcService.select(sendParam);

			JSONObject list = buildJsonPackingList(packingList, typeIf);
			Log.Trace("Packing List result send = %s", list.toJSONString());
			String result = ByDRestApi.sendPackingResult(list);
			Log.Debug("send Adcode Check result=%s", result);
			JSONParser parser = new JSONParser();
			try {
				JSONObject jsonResult = (JSONObject) parser.parse(result);
				if (jsonResult.get("IF_MES").toString().equals("1")) {
					sql = String.format("update %s.패킹리스트 set USTRA_UPDATED=true where NO_SALES='%s';",
							ConstDef.DATA_BASE,
							taskId.get(i).get("taskId").toString());
					storeProcService.directCallSql(sql);
				} else {
					Log.Error("packing send result error msg=%s", jsonResult.get("NM_IF").toString());
					rep.put("result", PacketResult.ERR_SERVER);
					rep.put("body", "패킹정보 업데이트 에러");
					return rep.toJSONString();
				}
			} catch (ParseException e) {
				Log.Error(e.getMessage());
				rep.put("result", PacketResult.SAP_EXCEPTION);
				rep.put("body", "FAIL");
				return rep.toJSONString();
			}
		}
		rep.put("result", PacketResult.SUCCESS);
		rep.put("body", "SUCCESS");
		return rep.toJSONString();
	}
	@SuppressWarnings({ "unchecked" })
	public JSONObject buildJsonPackingList(List<Map<String, Object>> list, String pickType) { // 01 : 택배, 02 : 일반, 03 : 매장이동

		JSONObject result = new JSONObject();
		JSONArray data = new JSONArray();
		JSONObject head = new JSONObject();
		head.put("CD_COMPANY", list.get(0).get("cdCompany").toString());
		head.put("TYPE_IF", pickType);
		head.put("NO_SALES", list.get(0).get("noSales").toString());
		head.put("ASSIG_WBL", null);
		head.put("DLV_TYPE", list.get(0).get("dlvType").toString());
		head.put("DLV_TYPE_DTL", list.get(0).get("dlvTypeDtl").toString());
		JSONArray array = new JSONArray();
		for (int i = 0; i < list.size(); i++) {
			JSONObject temp = new JSONObject();
			temp.put("NO_LINE", list.get(i).get("noLine").toString());
			temp.put("NO_PATIN", list.get(i).get("noPatin").toString());
			temp.put("NO_PACKLINE", list.get(i).get("noPackline").toString());
			temp.put("CD_ITEM", list.get(i).get("cdItem").toString());
			temp.put("CD_IDENTSTOCK", list.get(i).get("cdIdentstock").toString());
			temp.put("QT_PACK", list.get(i).get("qtPack").toString());
			array.add(temp);
		}
		head.put("ARRAY", array);
		data.add(head);
		result.put("DATA", data);

		return result;
	}

	@SuppressWarnings({ "unchecked" })
	@PreAuth
	@RequestMapping(value = "/updateToUstraAdcodeCheck/{typeIf}", method = { RequestMethod.GET, RequestMethod.POST })
	public String updateToUstraAdcodeCheck(HttpServletRequest request, HttpServletResponse response,
			@PathVariable String typeIf) {
		Log.Debug("updateToUstraAdcodeCheck Client=%s Session Id= %s", CommonLib.getRemoteIp(request),
				request.getSession().getId());

		JSONObject rep = new JSONObject();
		String sql = String.format(
				"select distinct NO_SALES as taskId from %s.패킹검수요청 where TYPE_IF='%s' AND 패킹검수확인=true and SAP_UPDATED=false;",
				ConstDef.DATA_BASE, typeIf);
		List<Map<String, Object>> taskId = storeProcService.runSqlSelect(sql);
		for (int i = 0; i < taskId.size(); i++) {
			JSONObject sendParam = new JSONObject();
			JSONObject ps = new JSONObject();
			ps.put("taskId", taskId.get(i).get("taskId").toString());
			ps.put("typeIf", typeIf);
			sendParam.put("proc", "spFindAllAdcodeCheckResultByTaskId");
			sendParam.put("db", ConstDef.DATA_BASE);
			sendParam.put("ps", ps);
			List<Map<String, Object>> checkList = storeProcService.select(sendParam);
			if (checkList.size() == 0) {
				sql = String.format("update %s.패킹검수요청 set SAP_UPDATED=true where NO_SALES='%s';", ConstDef.DATA_BASE,
						taskId.get(i).get("taskId").toString());
				storeProcService.directCallSql(sql);
				continue;
			}
			JSONObject list = buildJsonAdcodeCheck(checkList, typeIf);
			Log.Trace("Adcode Check result send = %s", list.toJSONString());
			String result = ByDRestApi.sendAdcodeResult(list);
			Log.Debug("send Adcode Check result=%s", result);
			JSONParser parser = new JSONParser();
			try {
				JSONObject jsonResult = (JSONObject) parser.parse(result);
				if (jsonResult.get("IF_MES").toString().equals("1")) {
					sql = String.format("update %s.패킹검수요청 set SAP_UPDATED=true where NO_SALES='%s';", ConstDef.DATA_BASE,
							taskId.get(i).get("taskId").toString());
					storeProcService.directCallSql(sql);
				} else {
					Log.Error("adcode check result error msg=%s", jsonResult.get("NM_IF").toString());
					rep.put("result", PacketResult.ERR_SERVER);
					rep.put("body", "패킹검수요청 업데이트 에러");
					return rep.toJSONString();
				}
			} catch (ParseException e) {
				Log.Error(e.getMessage());
				rep.put("result", PacketResult.SAP_EXCEPTION);
				rep.put("body", "FAIL");
				return rep.toJSONString();
			}
		}
		rep.put("result", PacketResult.SUCCESS);
		rep.put("body", "SUCCESS");
		return rep.toJSONString();
	}

	@SuppressWarnings({ "unchecked" })
	public JSONObject buildJsonPicking(List<Map<String, Object>> list, String pickType) { // 01 : 택배, 02 : 일반, 03 : 매장이동

		JSONObject result = new JSONObject();
		JSONObject head = new JSONObject();
		head.put("CD_COMPANY", list.get(0).get("cdCompany").toString());
		head.put("TYPE_IF", pickType);
		head.put("NO_DLVPRPS", list.get(0).get("noDlvprps").toString());
		head.put("DS_CD_STORE", list.get(0).get("dsCdStore").toString());
		head.put("NO_PICK", list.get(0).get("dtDlvprps").toString().replace("-", "").substring(0, 8));
		JSONArray array = new JSONArray();
		for (int i = 0; i < list.size(); i++) {
			JSONObject temp = new JSONObject();
			temp.put("NO_PICKLINE", i + "");
			temp.put("CD_ITEM", list.get(i).get("cdItem").toString());
			temp.put("QT_PICK", list.get(i).get("수량").toString());
			temp.put("CD_IDENTSTOCK", list.get(i).get("동종재고코드") == null ? null : list.get(i).get("동종재고코드").toString());
			temp.put("CD_SITE", list.get(i).get("사이트") == null ? "" : list.get(i).get("사이트").toString());
			temp.put("CD_STOGLCN", list.get(i).get("저장장소") == null ? "" : list.get(i).get("저장장소").toString());
			temp.put("CD_WHOUSAREA", list.get(i).get("장소코드") == null ? null : list.get(i).get("장소코드").toString());
			array.add(temp);
		}
		head.put("ARRAY", array);
		result.put("DATA", head);

		return result;
	}
	
	@SuppressWarnings({ "unchecked" })
	public JSONObject buildJsonAdcodeCheck(List<Map<String, Object>> list, String pickType) { // 01 : 택배, 02 : 일반, 03 : 매장이동

		JSONObject result = new JSONObject();
		JSONArray data = new JSONArray();
		JSONObject head = new JSONObject();
		head.put("CD_COMPANY", list.get(0).get("cdCompany").toString());
		head.put("TYPE_IF", pickType);
		head.put("NO_SALES", list.get(0).get("noSales").toString());
		head.put("NO_ORD", list.get(0).get("noOrd").toString());
		head.put("ASSIG_WBL", null);
		head.put("NM_CUST", list.get(0).get("nmCust").toString());
		JSONArray array = new JSONArray();
		for (int i = 0; i < list.size(); i++) {
			JSONObject temp = new JSONObject();
			temp.put("CD_ITEM", list.get(i).get("cdItem").toString());
			temp.put("NM_ITEM", list.get(i).get("nmItem").toString());
			temp.put("CD_AD", list.get(i).get("adCode").toString());
			temp.put("QT_ADGROUP", list.get(i).get("qtAdgroup") == null ? null : list.get(i).get("qtAdgroup").toString());
			array.add(temp);
		}
		head.put("ARRAY", array);
		data.add(head);
		result.put("DATA", data);

		return result;
	}
	// 고객정보 요청
	// @PreAuth
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/reqCustomerByCustId", method = { RequestMethod.GET, RequestMethod.POST })
	public String reqCustomerBycustId(HttpServletRequest request, HttpServletResponse response,
			@RequestBody String data) {

		Log.Debug("/reqCustomerByCustId=%s*************************************************", request.getSession().getId());
		Log.Debug(data.toString());
		JSONObject obj= null;
		JSONParser parser = new JSONParser();
		JSONObject rep = new JSONObject();

		try {
			obj = (JSONObject) parser.parse(data);
		} catch (ParseException e1) {
			Log.Error(e1.getMessage());
			rep.put("IF_MES", "2");
			rep.put("NM_IF", "JSON Parsing Error");
			return rep.toJSONString();
		}
		Log.Debug(obj.toJSONString());
		String result = ByDRestApi.reqCustomerInfo(obj);
		try {
			obj = (JSONObject) parser.parse(result);
		} catch (ParseException e1) {
			Log.Error(e1.getMessage());
			rep.put("IF_MES", "2");
			rep.put("NM_IF", "JSON Parsing Error");
			return rep.toJSONString();
		}
		if (obj.get("IF_MES").toString().equals("02")) {
			rep.put("result", PacketResult.ERR_MESSAGE);
			rep.put("message",obj.get("NM_IF").toString());
		} else {
			rep.put("result", PacketResult.SUCCESS);
			JSONObject temp = CommonLib.underToCamelFromJson((JSONObject)obj.get("DATA"));
			rep.put("body",temp.toJSONString());
		}

		return rep.toJSONString();
	}

	public boolean checkRemoteIp(String ip) {
		boolean result = true;
		String mHostName = null;
		String[] authIp = new String[] { "15.165.97.18", "13.209.207.125" };
		try {
			InetAddress addr = InetAddress.getLocalHost();
			mHostName = addr.getHostName();
			if (mHostName.equals(ConstDef.SERVICE_HOST_NAME)) {
				result = true;
				for (int i = 0; i < authIp.length; i++) {
					if (authIp[i].equals(ip)) {
						return true;
					}
				}
			}
		} catch (UnknownHostException e) {
			Log.Error(e.getMessage());
		}
		
		return result;
	}
}
