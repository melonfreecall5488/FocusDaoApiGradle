package com.smart.focus.ceoapi.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.smart.focus.ceoapi.Interceptor.PreAuth;
import com.smart.focus.ceoapi.common.BadRequestException;
import com.smart.focus.ceoapi.common.CommonLib;
import com.smart.focus.ceoapi.common.ConstDef;
import com.smart.focus.ceoapi.common.GeneralException;
import com.smart.focus.ceoapi.common.Log;
import com.smart.focus.ceoapi.common.Msg;
import com.smart.focus.ceoapi.common.PacketResult;
import com.smart.focus.ceoapi.domain.ParamModel;
import com.smart.focus.ceoapi.service.SpProcServiceImpl;
import com.smart.focus.ceoapi.service.SoapService.SoapService;
import com.smart.focus.ceoapi.sqlRestApi.SqlRestApi;

@RestController
@CrossOrigin(allowCredentials = "true", originPatterns = "*")
@SuppressWarnings("unchecked")
@RequestMapping("/restApi")
public class ProxyController {
	@Autowired
	private SpProcServiceImpl storeProcService;

	@Autowired
	private SoapService soapService;

	@RequestMapping(value = "/test", method = { RequestMethod.GET, RequestMethod.POST })
	public String test(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(value = "data", required = true, defaultValue = "0") String data) {
		Log.Debug(this.getClass(), "test Client=%s Session Id= %s", CommonLib.getRemoteIp(request),
				request.getSession().getId());

		// soapService.reqCustomer();
		// soapService.reqSupplier();
		// soapService.reqMaterialV2();
		// soapService.sendConsumptionCost();
		// soapService.sendGoodsMovement();
		// String sql = "SELECT * FROM WMS_DB.품목정보;";
		// List<Map<String, Object>> list = storeProcService.runSqlSelect(sql);
		// JSONParser parser = new JSONParser();
		// JSONArray array = null;

		// String encodeResult = null;
		// try {
		// 	Gson gson = CommonLib.getGsonTimestamp();
		// 	encodeResult = gson.toJson(list);
		// 	array = (JSONArray)parser.parse(encodeResult);
		// } catch (Exception e) {
		// 	Log.Error(this.getClass(), e.getMessage());
		// }
		// return array.toJSONString();
		/*
		p1.put("Text", "Federal Shipping");
		p1.put("Value", 3);
		p2.put("Text", "Federal Shipping----");
		p2.put("Value", 2);
		 */
		// JSONObject p1 = new JSONObject();
		// JSONObject p2 = new JSONObject();
		// JSONArray array = new JSONArray();
		// JSONObject rep = new JSONObject();
		// p1.put("코드", "활성");
		// p1.put("코드명", "활성명");
		// p2.put("코드", "비활성");
		// p2.put("코드명", "비활성명");
		// array.add(p1);
		// array.add(p2);
		// rep.put("data", array);
		// return array.toJSONString();

		// List<Map<String, Object>> returnList=null;
		// String sql = String.format("SELECT 상위코드 FROM %s.공통코드 WHERE 상위코드 IS NOT NULL GROUP BY 상위코드;", ConstDef.DATA_BASE);
		// List<Map<String, Object>> array = this.storeProcService.runSqlSelect(sql);
		// for (int i = 0; i < 1; i++) {
		// 	JSONObject sendParam = new JSONObject();
		// 	JSONObject ps = new JSONObject();
		// 	ps.put("pcode", array.get(i).get("상위코드").toString());
		// 	sendParam.put("proc", "spFindAllBaseCodeByPcode");
		// 	sendParam.put("db", ConstDef.DATA_BASE);
		// 	sendParam.put("ps", ps);
		// 	returnList = storeProcService.select(sendParam);
		// }
		// String encodeResult = null;
		// try {
		// 	Gson gson = CommonLib.getGsonTimestamp();
		// 	encodeResult = gson.toJson(returnList);
		// } catch (Exception e) {
		// 	Log.Error(this.getClass(), e.getMessage());
		// 	return "ERROR";
		// }
		// return encodeResult;
		SqlRestApi api = new SqlRestApi("system", "1234568a");
		JSONArray ps = new JSONArray();
		JSONObject param = new JSONObject();
		param.put("TEST", 11111);
		param.put("id", 123456);
		ps.add(param);
		JSONArray exceptKey = new JSONArray();
		exceptKey.add("id");

		Long array = (Long)api.runInsertSqlProc("TEST", null, ps, "http://127.0.0.1:8082/restApi");
		return null;
	}
	
	@RequestMapping(value = "/getDevLookup", method = { RequestMethod.GET, RequestMethod.POST })
	public String getDevLookup(HttpServletRequest request, HttpServletResponse response,
			@RequestBody String data) {
		Log.Debug(this.getClass(), "getDevLookup Client=%s Session Id= %s", CommonLib.getRemoteIp(request),
				request.getSession().getId());

		JSONParser parser = new JSONParser();
		JSONArray array = null;
		JSONArray keyArray = new JSONArray();
		JSONObject rep = new JSONObject();

		try {
			array = (JSONArray) parser.parse(data);
		} catch (Exception e) {
			Log.Error(this.getClass(), e.getMessage());
			throw new BadRequestException();
		}
		for (int i = 0; i < array.size(); i++) {
			JSONObject obj = new JSONObject();
			JSONObject temp = (JSONObject) array.get(i);
			if (temp.containsKey("코드명")) {
				obj.put("key", temp.get("코드명").toString());
				obj.put("count", 1);
				keyArray.add(obj);
			} else if (temp.containsKey("사번")) {
				obj.put("key", temp.get("사번").toString());
				obj.put("count", 1);
				keyArray.add(obj);
			}
		}
		
		rep.put("data", keyArray.toJSONString());
		rep.put("totalCount", 0);
		return rep.toJSONString();

	}

	@GetMapping("/getServerTime")
	public String setServerTime() {
		Log.Debug(this.getClass(), CommonLib.getToday("yyyy-MM-dd HH:mm:ss"));
		return CommonLib.getToday("yyyy-MM-dd HH:mm:ss");
	}

	@RequestMapping(value = "/checkNetwork", method = { RequestMethod.GET })
	public String checkNetwork(HttpServletRequest request, HttpServletResponse response) {
		Log.Debug(this.getClass(), "checkNetwork Client=%s Session Id= %s", CommonLib.getRemoteIp(request),
				request.getSession().getId());
		return "";
	}

	@PreAuth
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/spSelect", method = { RequestMethod.POST })
	public String spSelect(HttpServletRequest request, HttpServletResponse response,
			@RequestBody ParamModel data) {
		Log.Debug(this.getClass(), "**spSelect Client=%s", CommonLib.getRemoteIp(request));
		JSONObject jsonProc = null;
		JSONObject rep = new JSONObject();
		JSONParser parser = new JSONParser();
		String decode = null;
		try {
			decode = data.getBody().replaceAll("'", "");
			Log.Debug(this.getClass(), decode);
			jsonProc = (JSONObject) parser.parse(decode);
		} catch (Exception e) {
			Log.Error(this.getClass(), e.getMessage());
			throw new BadRequestException();
		}

		String encodeResult = null;
		List<Map<String, Object>> array = storeProcService.select(jsonProc);
		Log.Trace(this.getClass(), "%s result row = %d", jsonProc.get("proc").toString(), array.size());
		try {
			Gson gson = CommonLib.getGsonTimestamp();
			encodeResult = gson.toJson(array);
		} catch (Exception e) {
			Log.Error(this.getClass(), e.getMessage());
			rep.put("result", PacketResult.ERR_PARAMS);
			return rep.toJSONString();
		}
		rep.put("result", PacketResult.SUCCESS);
		rep.put("body", encodeResult);
		return rep.toJSONString();
	}
	@PreAuth
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/spUpdateSelect", method = { RequestMethod.POST })
	public String spUpdateSelect(HttpServletRequest request, HttpServletResponse response, @RequestBody ParamModel data) {
		Log.Debug(this.getClass(), "**select Client=%s", CommonLib.getRemoteIp(request));
		JSONObject jsonProc = null;
		JSONObject rep = new JSONObject();
		JSONParser parser = new JSONParser();
		String decode = null;
		try {
			decode = data.getBody().replaceAll("'", "");
			Log.Debug(this.getClass(), decode);
			jsonProc = (JSONObject) parser.parse(decode);
		} catch (Exception e) {

			Log.Error(this.getClass(), e.getMessage());
			throw new BadRequestException();
		}

		String encodeResult = null;
		List<Map<String, Object>> array = storeProcService.updateSelect(jsonProc);
		// Log.Debug(array.toString());
		if (array != null)
			Log.Trace(this.getClass(), "%s result row = %d", jsonProc.get("proc").toString(), array.size());
		else
			Log.Trace(this.getClass(), "%s result row = null", jsonProc.get("proc").toString());

		try {
			Gson gson = CommonLib.getGsonTimestamp();
			encodeResult = gson.toJson(array);
		} catch (Exception e) {
			Log.Error(this.getClass(), e.getMessage());
			rep.put("result", PacketResult.ERR_PARAMS);
			return rep.toJSONString();
		}
		rep.put("result", PacketResult.SUCCESS);
		rep.put("body", encodeResult);
		return rep.toJSONString();
	}

	@PreAuth
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/spUpdate", method = { RequestMethod.POST })
	// update insert 모두처리
	public String update(HttpServletRequest request, HttpServletResponse response, @RequestBody ParamModel data) {
		Log.Debug(this.getClass(), "**update Client=%s", CommonLib.getRemoteIp(request));
		JSONObject jsonProc = null;
		JSONObject rep = new JSONObject();
		JSONParser parser = new JSONParser();
		String decode = null;
		try {
			decode = data.getBody().replaceAll("'", "");
			Log.Debug(this.getClass(), decode);
			jsonProc = (JSONObject) parser.parse(decode);
		} catch (Exception e) {
			Log.Error(this.getClass(), e.getMessage());
			throw new BadRequestException();
		}
		String encodeResult = null;
		String result = storeProcService.update(jsonProc);
		Log.Trace(this.getClass(), "Update completed");
		if (result != null) {
			Log.Error(this.getClass(), "Store Proc=%s MSG=%s", jsonProc.get("proc").toString(), result);
			GeneralException.exception(response, result, Msg.NO_COMMON_FAIL);
			return null;
		}

		try {
			encodeResult = "command update or insert";
		} catch (Exception e) {
			Log.Error(this.getClass(), e.getMessage());
			rep.put("result", PacketResult.ERR_PARAMS);
			return rep.toJSONString();
		}
		rep.put("result", PacketResult.SUCCESS);
		rep.put("body", encodeResult);
		return rep.toJSONString();
	}

	@PreAuth
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/runtimeSqlInsert", method = { RequestMethod.POST })
	// update insert 모두처리
	public String runtimeSqlInsert(HttpServletRequest request, HttpServletResponse response,
			@RequestBody ParamModel data) {
		Log.Debug(this.getClass(), "**runtimeSqlInsert Client=%s", CommonLib.getRemoteIp(request));
		JSONObject jsonProc = null;
		JSONObject rep = new JSONObject();
		JSONParser parser = new JSONParser();
		String decode = null;
		try {
			decode = data.getBody().replaceAll("'", "");
			Log.Debug(this.getClass(), decode);
			jsonProc = (JSONObject) parser.parse(decode);
		} catch (Exception e) {
			Log.Error(this.getClass(), e.getMessage());
			throw new BadRequestException();
		}
		String encodeResult = null;
		String result = storeProcService.insertRuntimeSql(jsonProc, true);
		Log.Trace(this.getClass(), "Insert completed");
		if (result != null) {
			Log.Error(this.getClass(), "Insert TABLE=%s MSG=%s", jsonProc.get("table").toString(), result);
			GeneralException.exception(response, result, Msg.NO_COMMON_FAIL);
			return null;
		}

		try {
			encodeResult = "command update or insert";
		} catch (Exception e) {
			Log.Error(this.getClass(), e.getMessage());
			rep.put("result", PacketResult.ERR_PARAMS);
			return rep.toJSONString();
		}
		rep.put("result", PacketResult.SUCCESS);
		rep.put("body", encodeResult);
		return rep.toJSONString();
	}

	@PreAuth
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/runtimeSqlInsertAndFind", method = { RequestMethod.POST })
	// update insert 모두처리
	public String runtimeSqlInsertAndFind(HttpServletRequest request, HttpServletResponse response,
			@RequestBody ParamModel data) {
		Log.Debug(this.getClass(), "**runtimeSqlInsertAndFind Client=%s", CommonLib.getRemoteIp(request));
		JSONObject jsonProc = null;
		JSONObject rep = new JSONObject();
		JSONParser parser = new JSONParser();
		String decode = null;
		try {
			decode = data.getBody().replaceAll("'", "");
			Log.Debug(this.getClass(), decode);
			jsonProc = (JSONObject) parser.parse(decode);
		} catch (Exception e) {
			Log.Error(this.getClass(), e.getMessage());
			throw new BadRequestException();
		}

		String encodeResult = null;
		String result = storeProcService.insertRuntimeSqlNoArray(jsonProc, true);
		Log.Trace(this.getClass(), "Insert completed");
		if (result != null) {
			Log.Error(this.getClass(), "Insert TABLE=%s MSG=%s", jsonProc.get("table").toString(), result);
			GeneralException.exception(response, result, Msg.NO_COMMON_FAIL);
			return null;
		}

		List<Map<String, Object>> list = storeProcService.selectRuntimeSqlByKey(jsonProc);

		try {
			Gson gson = CommonLib.getGsonTimestamp();
			encodeResult = gson.toJson(list);
		} catch (Exception e) {
			Log.Error(this.getClass(), e.getMessage());
			rep.put("result", PacketResult.ERR_PARAMS);
			return rep.toJSONString();
		}
		rep.put("result", PacketResult.SUCCESS);
		rep.put("body", encodeResult);
		return rep.toJSONString();
	}

	@PreAuth
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/runtimeSqlUpdate", method = { RequestMethod.POST })
	// update insert 모두처리
	public String runtimeSqlUpdate(HttpServletRequest request, HttpServletResponse response,
			@RequestBody ParamModel data) {
		Log.Debug(this.getClass(), "**runtimeSqlUpdate Client=%s", CommonLib.getRemoteIp(request));
		JSONObject jsonProc = null;
		JSONObject rep = new JSONObject();
		JSONParser parser = new JSONParser();
		String decode = null;
		try {
			decode = data.getBody().replaceAll("'", "");
			Log.Debug(this.getClass(), decode);
			jsonProc = (JSONObject) parser.parse(decode);
		} catch (Exception e) {
			Log.Error(this.getClass(), e.getMessage());
			throw new BadRequestException();
		}
		String encodeResult = null;
		String result = storeProcService.updateRuntimeSql(jsonProc);
		Log.Trace(this.getClass(), "Update completed");
		if (result != null) {
			Log.Error(this.getClass(), "Update TABLE=%s MSG=%s", jsonProc.get("table").toString(), result);
			GeneralException.exception(response, result, Msg.NO_COMMON_FAIL);
			return null;
		}

		try {
			encodeResult = "command update or insert";
		} catch (Exception e) {
			Log.Error(this.getClass(), e.getMessage());
			rep.put("result", PacketResult.ERR_PARAMS);
			return rep.toJSONString();
		}
		rep.put("result", PacketResult.SUCCESS);
		rep.put("body", encodeResult);
		return rep.toJSONString();
	}

	@PreAuth
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/runtimeSqlSelect", method = { RequestMethod.POST })
	public String runtimeSqlSelect(HttpServletRequest request, HttpServletResponse response,
			@RequestBody ParamModel data) {
		Log.Debug(this.getClass(), "**runtimeSqlNoEncodeSelect Client=%s", CommonLib.getRemoteIp(request));
		JSONObject jsonProc = null;
		JSONObject rep = new JSONObject();
		JSONParser parser = new JSONParser();
		String decode = null;
		try {
			decode = data.getBody();
			Log.Debug(this.getClass(), decode);
			jsonProc = (JSONObject) parser.parse(decode);
		} catch (Exception e) {

			Log.Error(this.getClass(), e.getMessage());
			throw new BadRequestException();
		}

		String encodeResult = null;
		List<Map<String, Object>> array = storeProcService.selectRuntimeSql(jsonProc);
		Log.Trace(this.getClass(), "%s result row=%d", jsonProc.get("table").toString(), array.size());
		try {
			Gson gson = CommonLib.getGsonTimestamp();
			encodeResult = gson.toJson(array);
		} catch (Exception e) {
			Log.Error(this.getClass(), e.getMessage());
			rep.put("result", PacketResult.ERR_PARAMS);
			return rep.toJSONString();
		}
		rep.put("result", PacketResult.SUCCESS);
		rep.put("body", encodeResult);
		return rep.toJSONString();
	}

	@PreAuth
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/runtimeSqlDevCustomSelect", method = { RequestMethod.POST })
	public String runtimeSqlDevCustomSelect(HttpServletRequest request, HttpServletResponse response,
			@RequestBody ParamModel data) {
		Log.Debug(this.getClass(), "**runtimeSqlDevCustomSelect Client=%s", CommonLib.getRemoteIp(request));
		JSONObject jsonProc = null;
		JSONObject rep = new JSONObject();
		JSONParser parser = new JSONParser();
		String decode = null;
		try {
			decode = data.getBody();
			Log.Debug(this.getClass(), decode);
			jsonProc = (JSONObject) parser.parse(decode);
		} catch (Exception e) {
			Log.Error(this.getClass(), e.getMessage());
			throw new BadRequestException();
		}

		String encodeResult = null;
		List<Map<String, Object>> array = storeProcService.selectRuntimeDevCustomSql(jsonProc);
		if (array == null) {
			Log.Error( "runtimeSqlDevCustomSelect Param is null");
			throw new BadRequestException();
		}
		Log.Trace(this.getClass(), "%s result row=%d", jsonProc.get("table").toString(), array.size());
		Long totalCount = 0l;
		if (array.size() > 0) {
			totalCount = (Long)array.get(0).get("totalCount");
		}
		
		try {
			Gson gson = CommonLib.getGsonTimestamp();
			encodeResult = gson.toJson(array);
		} catch (Exception e) {
			Log.Error(this.getClass(), e.getMessage());
			rep.put("result", PacketResult.ERR_PARAMS);
			return rep.toJSONString();
		}
		rep.put("data", encodeResult);
		rep.put("totalCount", totalCount);
		return rep.toJSONString();
	}

	@PreAuth
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/runtimeSqlDelete", method = { RequestMethod.POST })
	// update insert 모두처리
	public String runtimeSqlDelete(HttpServletRequest request, HttpServletResponse response,
			@RequestBody ParamModel data) {
		Log.Debug(this.getClass(), "**runtimeSqlDelete Client=%s", CommonLib.getRemoteIp(request));
		JSONObject jsonProc = null;
		JSONObject rep = new JSONObject();
		JSONParser parser = new JSONParser();
		String decode = null;
		try {
			decode = data.getBody().replaceAll("'", "");
			Log.Debug(this.getClass(), decode);
			jsonProc = (JSONObject) parser.parse(decode);
		} catch (Exception e) {
			Log.Error(this.getClass(), e.getMessage());
			throw new BadRequestException();
		}
		String encodeResult = null;
		String result = storeProcService.deleteRuntimeSql(jsonProc);
		Log.Trace(this.getClass(), "Delete completed");
		if (result != null) {
			Log.Error(this.getClass(), "Store TABLE=%s MSG=%s", jsonProc.get("table").toString(), result);
			GeneralException.exception(response, result, Msg.NO_COMMON_FAIL);
			return null;
		}

		try {
			encodeResult = "command update or insert";
		} catch (Exception e) {
			Log.Error(this.getClass(), e.getMessage());
			rep.put("result", PacketResult.ERR_PARAMS);
			return rep.toJSONString();
		}
		rep.put("result", PacketResult.SUCCESS);
		rep.put("body", encodeResult);
		return rep.toJSONString();
	}

	@PreAuth
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/runtimeSqlInsertOrUpdate", method = { RequestMethod.POST })
	// update insert 모두처리
	public String runtimeSqlInsertOrUpdate(HttpServletRequest request, HttpServletResponse response,
			@RequestBody ParamModel data) {
		Log.Debug(this.getClass(), "**runtimeSqlInsertOrUpdate Client=%s", CommonLib.getRemoteIp(request));
		JSONObject jsonProc = null;
		JSONObject rep = new JSONObject();
		JSONParser parser = new JSONParser();
		String decode = null;
		try {
			decode = data.getBody().replaceAll("'", "");
			Log.Debug(this.getClass(), decode);
			jsonProc = (JSONObject) parser.parse(decode);
		} catch (Exception e) {
			Log.Error(this.getClass(), e.getMessage());
			throw new BadRequestException();
		}
		String encodeResult = null;
		String result = storeProcService.insertOrupdateRuntimeSql(jsonProc);
		Log.Trace(this.getClass(), "Insert/Update completed");
		if (result != null) {
			Log.Error(this.getClass(), "Insert TABLE=%s MSG=%s", jsonProc.get("table").toString(), result);
			GeneralException.exception(response, result, Msg.NO_COMMON_FAIL);
			return null;
		}

		try {
			encodeResult = "command update or insert";
		} catch (Exception e) {
			Log.Error(this.getClass(), e.getMessage());
			rep.put("result", PacketResult.ERR_PARAMS);
			return rep.toJSONString();
		}
		rep.put("result", PacketResult.SUCCESS);
		rep.put("body", encodeResult);
		return rep.toJSONString();
	}

	@PreAuth
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/runtimeSqlInsertOrNoUpdate", method = { RequestMethod.POST })
	// update insert 모두처리
	public String runtimeSqlInsertOrNoUpdate(HttpServletRequest request, HttpServletResponse response,
			@RequestBody ParamModel data) {
		Log.Debug(this.getClass(), "**runtimeSqlInsertOrNoUpdate Client=%s", CommonLib.getRemoteIp(request));
		JSONObject jsonProc = null;
		JSONObject rep = new JSONObject();
		JSONParser parser = new JSONParser();
		String decode = null;
		try {
			decode = data.getBody().replaceAll("'", "");
			Log.Debug(this.getClass(), decode);
			jsonProc = (JSONObject) parser.parse(decode);
		} catch (Exception e) {
			Log.Error(this.getClass(), e.getMessage());
			throw new BadRequestException();
		}
		String encodeResult = null;
		String result = storeProcService.insetOrNoupdateRuntimeSql(jsonProc);
		Log.Trace(this.getClass(), "Insert/Update completed");
		if (result != null) {
			if (!result.equals("already inserted")) {
				Log.Error(this.getClass(), "Insert TABLE=%s MSG=%s", jsonProc.get("table").toString(), result);
				GeneralException.exception(response, result, Msg.NO_COMMON_FAIL);
				return null;
			}
		}

		try {
			if (result == null) {
				result = "command update or insert";
			}
			encodeResult = result;
		} catch (Exception e) {
			Log.Error(this.getClass(), e.getMessage());
			rep.put("result", PacketResult.ERR_PARAMS);
			return rep.toJSONString();
		}
		rep.put("result", PacketResult.SUCCESS);
		rep.put("body", encodeResult);
		return rep.toJSONString();
	}

	@PreAuth
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/runtimeSqlInsertAndUpdateId", method = { RequestMethod.POST })
	// update insert 모두처리
	public String runtimeSqlInsertAndUpdateId(HttpServletRequest request, HttpServletResponse response,
			@RequestBody ParamModel data) {
		Log.Debug(this.getClass(), "**runtimeSqlInsertAndUpdateId Client=%s", CommonLib.getRemoteIp(request));
		JSONObject jsonProc = null;
		JSONObject rep = new JSONObject();
		JSONParser parser = new JSONParser();
		String decode = null;
		try {
			decode = data.getBody().replaceAll("'", "");
			Log.Debug(this.getClass(), decode);
			jsonProc = (JSONObject) parser.parse(decode);
		} catch (Exception e) {
			Log.Error(this.getClass(), e.getMessage());
			throw new BadRequestException();
		}
		String encodeResult = null;
		String result = storeProcService.insertRuntimeSqlNoArray(jsonProc, true);
		Log.Trace(this.getClass(), "Insert completed");
		if (result != null) {
			Log.Error(this.getClass(), "Insert TABLE=%s MSG=%s", jsonProc.get("table").toString(), result);
			GeneralException.exception(response, result, Msg.NO_COMMON_FAIL);
			return null;
		}

		List<Map<String, Object>> list = storeProcService.selectRuntimeSqlByKey(jsonProc);
		if (list.size() != 1) {
			Log.Error(this.getClass(), "find errort TABLE=%s MSG=%s", jsonProc.toString(), result);
			GeneralException.exception(response, result, Msg.NO_COMMON_FAIL);
			return null;
		}
		String autoId = list.get(0).get(jsonProc.get("autoIdFieldName").toString()).toString();
		String prefix = jsonProc.get("idPrefix").toString();
		String surfix = jsonProc.containsKey("idSurfix") == true ? jsonProc.get("idSurfix").toString() : "";
		String updateId = prefix + autoId + surfix;
		String sql = String.format("UPDATE %s.%s SET %s='%s' WHERE %s=%s;", ConstDef.DATA_BASE,
				jsonProc.get("table").toString(),
				CommonLib.camelCaseToUnderscore(jsonProc.get("updateFieldName").toString()), updateId,
				CommonLib.camelCaseToUnderscore(jsonProc.get("autoIdFieldName").toString()), autoId);
		result = storeProcService.directCallSql(sql);
		Log.Trace(this.getClass(), "Update completed");
		if (result != null) {
			Log.Error(this.getClass(), "Update TABLE=%s MSG=%s", jsonProc.get("table").toString(), result);
			GeneralException.exception(response, result, Msg.NO_COMMON_FAIL);
			return null;
		}

		list.get(0).put(jsonProc.get("updateFieldName").toString(), updateId);

		try {
			Gson gson = CommonLib.getGsonTimestamp();
			encodeResult = gson.toJson(list);
		} catch (Exception e) {
			Log.Error(this.getClass(), e.getMessage());
			rep.put("result", PacketResult.ERR_PARAMS);
			return rep.toJSONString();
		}
		rep.put("result", PacketResult.SUCCESS);
		rep.put("body", encodeResult);
		return rep.toJSONString();
	}

	@PreAuth
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/runtimeSqlInsertAndUpdateAutoIdSurfix", method = { RequestMethod.POST })
	// update insert 모두처리
	public String runtimeSqlInsertAndUpdateAutoIdSurfix(HttpServletRequest request, HttpServletResponse response,
			@RequestBody ParamModel data) {
		Log.Debug(this.getClass(), "**runtimeSqlInsertAndUpdateAutoIdSurfix Client=%s", CommonLib.getRemoteIp(request));
		JSONObject jsonProc = null;
		JSONObject rep = new JSONObject();
		JSONParser parser = new JSONParser();
		String decode = null;
		try {
			decode = data.getBody().replaceAll("'", "");
			Log.Debug(this.getClass(), decode);
			jsonProc = (JSONObject) parser.parse(decode);
		} catch (Exception e) {
			Log.Error(this.getClass(), e.getMessage());
			throw new BadRequestException();
		}
		String encodeResult = null;
		String result = storeProcService.insertRuntimeSqlNoArray(jsonProc, true);
		Log.Trace(this.getClass(), "Insert completed");
		if (result != null) {
			Log.Error(this.getClass(), "Insert TABLE=%s MSG=%s", jsonProc.get("table").toString(), result);
			GeneralException.exception(response, result, Msg.NO_COMMON_FAIL);
			return null;
		}

		List<Map<String, Object>> list = storeProcService.selectRuntimeSqlByKey(jsonProc);
		if (list.size() != 1) {
			Log.Error(this.getClass(), "find errort TABLE=%s MSG=%s", jsonProc.toString(), result);
			GeneralException.exception(response, result, Msg.NO_COMMON_FAIL);
			return null;
		}
		String autoId = list.get(0).get(jsonProc.get("autoIdFieldName").toString()).toString();
		String prefix = jsonProc.get("prefix").toString();
		String updateId = prefix + autoId;
		String sql = String.format("UPDATE %s.%s SET %s='%s' WHERE %s=%s;", ConstDef.DATA_BASE,
				jsonProc.get("table").toString(),
				CommonLib.camelCaseToUnderscore(jsonProc.get("updateFieldName").toString()), updateId,
				CommonLib.camelCaseToUnderscore(jsonProc.get("autoIdFieldName").toString()), autoId);
		result = storeProcService.directCallSql(sql);
		Log.Trace(this.getClass(), "Update completed");
		if (result != null) {
			Log.Error(this.getClass(), "Update TABLE=%s MSG=%s", jsonProc.get("table").toString(), result);
			GeneralException.exception(response, result, Msg.NO_COMMON_FAIL);
			return null;
		}

		list.get(0).put(jsonProc.get("updateFieldName").toString(), updateId);

		try {
			Gson gson = CommonLib.getGsonTimestamp();
			encodeResult = gson.toJson(list);
		} catch (Exception e) {
			Log.Error(this.getClass(), e.getMessage());
			rep.put("result", PacketResult.ERR_PARAMS);
			return rep.toJSONString();
		}
		rep.put("result", PacketResult.SUCCESS);
		rep.put("body", encodeResult);
		return rep.toJSONString();
	}

	@PreAuth
	@RequestMapping(value = "/qrCodePrinting", method = { RequestMethod.GET, RequestMethod.POST })
	public String qrCodePrinting(HttpServletRequest request, HttpServletResponse response,
			@RequestBody String jsonData) {
		Log.Debug("qrCodePrinting Client=%s Session Id= %s", CommonLib.getRemoteIp(request), request.getSession().getId());
		JSONObject param = new JSONObject();
		JSONParser parser = new JSONParser();
		try {
			param = (JSONObject) parser.parse(jsonData);
		} catch (Exception e) {
			Log.Error(e.getMessage());
			throw new BadRequestException();
		}
		this.storeProcService.queueQrcode(param.get("printName").toString());
		return null;
	}

	@PreAuth
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/customerInfo", method = { RequestMethod.GET, RequestMethod.POST })
	public String customerInfo(HttpServletRequest request, HttpServletResponse response,
		@RequestBody JSONObject paramObj) {
		Log.Debug("customerInfo Client=%s Session Id= %s param=%s", CommonLib.getRemoteIp(request),
				request.getSession().getId(), paramObj.toJSONString());
		// Log.Debug("customerInfo Client=%s Session Id= %s filter=%s", CommonLib.getRemoteIp(request), request.getSession().getId(),filter);
		JSONObject rep = new JSONObject();

		String sql = String.format("SELECT * FROM %s.고객정보 ORDER BY NM_CUST Limit %d,%d;",
				ConstDef.DATA_BASE,
				(Integer)paramObj.get("skip"),
				(Integer)paramObj.get("take"));
		String totalCount = String.format("SELECT COUNT(*) AS count FROM %s.고객정보;", ConstDef.DATA_BASE);
		
		List<Map<String, Object>> info = CommonLib.underToCamel(this.storeProcService.runSqlSelect(sql));
		Log.Debug("select rows=%d", info.size());
		List<Map<String, Object>> tCount = this.storeProcService.runSqlSelect(totalCount);

		String encodeResult = null;
		try {
			Gson gson = CommonLib.getGsonTimestamp();
			encodeResult = gson.toJson(info);
		} catch (Exception e) {
			Log.Error(this.getClass(), e.getMessage());
			rep.put("result", PacketResult.ERR_PARAMS);
			return rep.toJSONString();
		}
		
		rep.put("data", encodeResult);
		rep.put("totalCount", (Long)tCount.get(0).get("count"));
		return rep.toJSONString();
	}
	
}
