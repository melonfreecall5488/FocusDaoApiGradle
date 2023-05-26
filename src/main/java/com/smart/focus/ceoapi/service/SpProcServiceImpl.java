package com.smart.focus.ceoapi.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.servlet.ServletContext;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.smart.focus.ceoapi.common.CommonLib;
import com.smart.focus.ceoapi.common.ConstDef;
import com.smart.focus.ceoapi.common.Log;
import com.smart.focus.ceoapi.common.ThreadPool.QrCodePrintRunnable;
import com.smart.focus.ceoapi.common.ThreadPool.ThreadPool;

@Service
@SuppressWarnings({ "unchecked", "rawtypes" })
@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
public class SpProcServiceImpl {

	@Autowired
	private ServletContext servletContext;

	@Autowired
	@Qualifier("JdbcTemplateSmart")
	private JdbcTemplate jdbcTemplate;

	@Autowired
	@Qualifier("JdbcTemplateSmartStSlave")
	private JdbcTemplate jdbcTemplateStSlave;
	private List<Map<String, ThreadPool>> threadPool = new ArrayList<Map<String, ThreadPool>>();
	
	private int jdbcIndex = 0;

	private JdbcTemplate getJdbcTemplate() {
		JdbcTemplate temp = this.jdbcTemplateStSlave;
		;
		int mod = this.jdbcIndex % 5;
		Log.Debug("jdbcTemplate Index = %d", mod);
		if (this.jdbcIndex == 4) {
			this.jdbcIndex = 0;
		} else {
			this.jdbcIndex++;
		}
		if (mod == 0 || mod == 2) {
			temp = this.jdbcTemplate;
		}
		return temp;
	}
	
	@PostConstruct
	public void init() {
		jdbcTemplate.setResultsMapCaseInsensitive(true);
		Log.Debug(this.servletContext.getRealPath("/"));
		// thread pool
		String path = this.servletContext.getRealPath("/");
		String[] split = path.split("WAS_SERVER/");
		if (split.length == 2) {
			ConstDef.DATA_BASE = split[1].replaceAll("/", "");
			Log.Debug(split[1].replaceAll("/", ""));
			if (ConstDef.DATA_BASE.equals("WmsApi")) {
				ConstDef.DATA_BASE = "WMS_DB";
			}
			
		} else {
			ConstDef.DATA_BASE = ConstDef.DATA_TEST_BASE;
		}
		Log.Debug("DATA_BASE=%s", ConstDef.DATA_BASE);
		this.qrPrintInit();
	}

	public void qrPrintInit() {
		// thread pool
		if (ConstDef.DATA_BASE.equals("WmsApi")) {
			String sql = String.format("SELECT 프린터명 FROM %s.프린터설정;", ConstDef.DATA_BASE);
			List<Map<String, Object>> array = this.runSqlSelect(sql);
			for (Map<String, Object> stringObjectMap : array) {
				ThreadPool pool = new ThreadPool(1, 10);
				Map<String, ThreadPool> map = new HashMap<String, ThreadPool>();
				map.put(stringObjectMap.get("프린터명").toString(), pool);
				this.threadPool.add(map);
			}
		}
	}
	
	public void queueQrcode(String printName) {
		Runnable r = new QrCodePrintRunnable(this, printName);
		try {
			for (Map<String, ThreadPool> stringThreadPoolMap : this.threadPool) {
				if (stringThreadPoolMap.containsKey(printName)) {
					stringThreadPoolMap.get(printName).execute(r);
				}
			}
		} catch (Exception e) {
			Log.Error(e.getMessage());
		}
	}

	public List<Map<String, Object>> select(JSONObject param, Boolean... primaryDb) {
		Map<String, Object> inParamMap = new HashMap<String, Object>();

		JSONObject inParam = (JSONObject) param.get("ps");
		if (inParam != null) {
			for (Object o : inParam.keySet()) {
				String key = o.toString();
				if (inParam.get(key) != null) {
					if (inParam.get(key).toString().toLowerCase() == "true"
							|| inParam.get(key).toString().toLowerCase() == "false") {
						inParamMap.put("in" + key, inParam.get(key).toString().toLowerCase() == "true" ? 1 : 0);
					} else {
						inParamMap.put("in" + key, inParam.get(key).toString());
					}
				} else {
					inParamMap.put("in" + key, null);
				}
			}
		}
		SimpleJdbcCall simpleJdbcCallRefCursor = new SimpleJdbcCall(primaryDb.length > 0 && primaryDb[0] == true ? this.jdbcTemplate: this.getJdbcTemplate())
				.withCatalogName(
						ConstDef.DATA_BASE)
				.withProcedureName(param.get("proc").toString());

		Map<String, Object> out = simpleJdbcCallRefCursor.execute(inParamMap);
		// Log.Debug(out.toString());
		if (!out.containsKey("#result-set-1")) {
			return null;
		}
		return CommonLib.underToCamel((List<Map<String, Object>>) out.get("#result-set-1"));
	}
	public List<Map<String, Object>> updateSelect(JSONObject param) {
		Map<String, Object> inParamMap = new HashMap<String, Object>();

		JSONObject inParam = (JSONObject) param.get("ps");
		if (inParam != null) {
			for (Object o : inParam.keySet()) {
				String key = o.toString();
				if (inParam.get(key) != null) {
					if (inParam.get(key).toString().equalsIgnoreCase("true")
						|| inParam.get(key).toString().equalsIgnoreCase("false")) {
						inParamMap.put("in" + key, inParam.get(key).toString().equalsIgnoreCase("true") ? 1 : 0);
					} else {
						inParamMap.put("in" + key, CommonLib.timestampToFormat(inParam.get(key)));
					}
				} else {
					inParamMap.put("in" + key, null);
				}
			}
		}
		SimpleJdbcCall simpleJdbcCallRefCursor = new SimpleJdbcCall(this.jdbcTemplate)
				.withCatalogName(
						ConstDef.DATA_BASE)
				.withProcedureName(param.get("proc").toString());

		Map<String, Object> out = simpleJdbcCallRefCursor.execute(inParamMap);
		// Log.Debug(out.toString());
		if (!out.containsKey("#result-set-1")) {
			return null;
		}
		return CommonLib.underToCamel((List<Map<String, Object>>) out.get("#result-set-1"));
	}

	public String update(JSONObject param) // insert,update,delete
	{
		String result = null;
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		JSONArray inParam = (JSONArray) param.get("ps");
		if (inParam == null) {
			SimpleJdbcCall simpleJdbcCallRefCursor = new SimpleJdbcCall(jdbcTemplate)
					.withCatalogName(
							ConstDef.DATA_BASE)
					.withProcedureName(param.get("proc").toString());
			// Log.Debug(this.getClass(), inParamMap.toString());
			Map<String, Object> out = simpleJdbcCallRefCursor.execute(inParamMap);
			if (out.containsKey("#result-set-1")) {
				List<Map<String, Object>> result_set = (List<Map<String, Object>>) out.get("#result-set-1");
				if (result_set.size() > 0 && result_set.get(0).containsKey("result")) {
					result = result_set.get(0).get("result").toString();
					if (!result.equals("0") && !result.equalsIgnoreCase("success")) {
						Log.Error(this.getClass(), "UpdateError SP=%s param=null", param.get("proc").toString());
						return result;
					} else {
						result = null;
					}
				}
			}
			return result;
		}
		for (Object o : inParam) {
			JSONObject item = (JSONObject) o;
			Iterator it = item.keySet().iterator();
			inParamMap.clear();
			while (it.hasNext()) {
				String key = it.next().toString();
				
				if (item.get(key) != null) {
					if (item.get(key).toString().equalsIgnoreCase("true")
						|| item.get(key).toString().equalsIgnoreCase("false")) {
						inParamMap.put("in" + key, item.get(key).toString().equalsIgnoreCase("true") ? 1 : 0);
					} else {
						inParamMap.put("in" + key, item.get(key).toString());
					}
				} else {
					inParamMap.put("in" + key, null);
				}
			}
			SimpleJdbcCall simpleJdbcCallRefCursor = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName(ConstDef.DATA_BASE)
				.withProcedureName(param.get("proc").toString());
			// Log.Debug(this.getClass(), inParamMap.toString());
			Map<String, Object> out = simpleJdbcCallRefCursor.execute(inParamMap);
			if (out.containsKey("#result-set-1")) {
				List<Map<String, Object>> result_set = (List<Map<String, Object>>) out.get("#result-set-1");
				if (result_set.size() > 0 && result_set.get(0).containsKey("result")) {
					result = result_set.get(0).get("result").toString();
					if (!result.equals("0") && !result.equalsIgnoreCase("success")) {
						Log.Error(this.getClass(), "UPdateError SP=%s param=%s", param.get("proc").toString(), item.toJSONString());
						return result;
					} else {
						result = null;
					}
				}
			}
		}
		return result;
	}

	public String updateFromMap(Map<String, Object> param) // insert,update,delete
	{
		String result = null;
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		List<Map<String, Object>> inParam = (List<Map<String, Object>>) param.get("ps");
		for (Map<String, Object> stringObjectMap : inParam) {
			Iterator it = ((Map<String, Object>) stringObjectMap).keySet().iterator();
			inParamMap.clear();
			while (it.hasNext()) {
				String key = it.next().toString();
				if (((Map<String, Object>) stringObjectMap).get(key) != null) {
					inParamMap.put("in" + key, ((Map<String, Object>) stringObjectMap).get(key.toString()));
				} else {
					inParamMap.put("in" + key, null);
				}
			}
			SimpleJdbcCall simpleJdbcCallRefCursor = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName(ConstDef.DATA_BASE)
				.withProcedureName(param.get("proc").toString());
			
			Map<String, Object> out = simpleJdbcCallRefCursor.execute(inParamMap);
			if (out.containsKey("#result-set-1")) {
				List<Map<String, Object>> result_set = (List<Map<String, Object>>) out.get("#result-set-1");
				if (result_set.size() > 0 && result_set.get(0).containsKey("result")) {
					result = result_set.get(0).get("result").toString();
					if (!result.equals("0")) {
						Log.Error(this.getClass(), "UPdateError SP=%s param=%s", param.get("proc").toString(), ((Map<String, Object>) stringObjectMap).toString());
						return result;
					} else {
						result = null;
					}
				}
			}
		}
		return result;
	}

	public String insertRuntimeSql(JSONObject param, boolean errMsg) {
		String sql = String.format("INSERT INTO  %s.%s", ConstDef.DATA_BASE, param.get("table").toString());
		String result = null;
		JSONArray inParam = (JSONArray) param.get("ps");
		StringBuilder fieldName = null;
		StringBuilder values = null;
		JSONArray exceptKey = null;
		boolean isExcept = false;
		if (param.containsKey("exceptKey")) {
			exceptKey = (JSONArray) param.get("exceptKey");
		}
		for (Object o : inParam) {
			JSONObject item = (JSONObject) o;
			Iterator it = item.keySet().iterator();
			fieldName = new StringBuilder(" (");
			values = new StringBuilder(" VALUES(");
			while (it.hasNext()) {
				String key = it.next().toString();
				isExcept = false;
				for (int j = 0; exceptKey != null && j < exceptKey.size(); j++) {
					if (exceptKey.get(j).toString().equals(key)) {
						isExcept = true;
						break;
					}
				}
				if (isExcept)
					continue;
				fieldName.append(CommonLib.camelCaseToUnderscore(key)).append(",");
				if (item.get(key) != null) {
					if (item.get(key).toString().equalsIgnoreCase("true")
						|| item.get(key).toString().equalsIgnoreCase("false")) {
						values.append(item.get(key).toString()).append(",");
					} else {
						values.append("'").append(item.get(key).toString()).append("',");
					}
				} else
					values.append("null" + ",");
			}
			fieldName = new StringBuilder(fieldName.substring(0, fieldName.length() - 1) + ")");
			values = new StringBuilder(values.substring(0, values.length() - 1) + ");");
			
			String runSql = sql + fieldName + values;
			try {
				this.jdbcTemplate.execute(runSql);
			} catch (Exception ex) {
				if (errMsg)
					Log.Error(this.getClass(), ex.getMessage());
				return ex.getMessage();
			}
		}

		return result;
	}

	public String insertRuntimeSqlSingleQuotation(JSONObject param, boolean errMsg) {
		String sql = String.format("INSERT INTO  %s.%s", ConstDef.DATA_BASE, param.get("table").toString());
		String result = null;
		JSONArray inParam = (JSONArray) param.get("ps");
		StringBuilder fieldName = null;
		StringBuilder values = null;
		JSONArray exceptKey = null;
		boolean isExcept = false;
		if (param.containsKey("exceptKey")) {
			exceptKey = (JSONArray) param.get("exceptKey");
		}
		for (Object o : inParam) {
			JSONObject item = (JSONObject) o;
			Iterator it = item.keySet().iterator();
			fieldName = new StringBuilder(" (");
			values = new StringBuilder(" VALUES(");
			while (it.hasNext()) {
				String key = it.next().toString();
				isExcept = false;
				for (int j = 0; exceptKey != null && j < exceptKey.size(); j++) {
					if (exceptKey.get(j).toString().equals(key)) {
						isExcept = true;
						break;
					}
				}
				if (isExcept)
					continue;
				fieldName.append(CommonLib.camelCaseToUnderscore(key)).append(",");
				if (item.get(key) != null) {
					if (item.get(key).toString().toLowerCase() == "true"
						|| item.get(key).toString().toLowerCase() == "false") {
						values.append(item.get(key).toString()).append(",");
					} else {
						values.append("'").append(item.get(key).toString().replace("'", " ")).append("',");
					}
				} else
					values.append("null" + ",");
			}
			fieldName = new StringBuilder(fieldName.substring(0, fieldName.length() - 1) + ")");
			values = new StringBuilder(values.substring(0, values.length() - 1) + ");");
			
			String runSql = sql + fieldName + values;
			try {
				this.jdbcTemplate.execute(runSql);
			} catch (Exception ex) {
				if (errMsg)
					Log.Error(this.getClass(), ex.getMessage());
				return ex.getMessage();
			}
		}

		return result;
	}

	public String insertRuntimeSqlNoArray(JSONObject param, boolean errMsg) {
		String sql = String.format("INSERT INTO  %s.%s", ConstDef.DATA_BASE, param.get("table").toString());
		String result = null;
		JSONObject item = (JSONObject) param.get("ps");
		StringBuilder fieldName = null;
		StringBuilder values = null;
		JSONArray exceptKey = null;
		boolean isExcept = false;
		if (param.containsKey("exceptKey")) {
			exceptKey = (JSONArray) param.get("exceptKey");
		}

		Iterator it = item.keySet().iterator();
		fieldName = new StringBuilder(" (");
		values = new StringBuilder(" VALUES(");
		while (it.hasNext()) {
			String key = it.next().toString();
			isExcept = false;
			for (int j = 0; exceptKey != null && j < exceptKey.size(); j++) {
				if (exceptKey.get(j).toString().equals(key)) {
					isExcept = true;
					break;
				}
			}
			if (isExcept)
				continue;

			fieldName.append(CommonLib.camelCaseToUnderscore(key)).append(",");
			if (item.get(key) != null) {
				if (item.get(key).toString().toLowerCase() == "true"
						|| item.get(key).toString().toLowerCase() == "false") {
					values.append(item.get(key).toString()).append(",");
				} else {
					values.append("'").append(item.get(key.toString())).append("',");
				}
			} else
				values.append("null" + ",");
		}
		fieldName = new StringBuilder(fieldName.substring(0, fieldName.length() - 1) + ")");
		values = new StringBuilder(values.substring(0, values.length() - 1) + ");");

		String runSql = sql + fieldName + values;
		try {
			this.jdbcTemplate.execute(runSql);
		} catch (Exception ex) {
			if (errMsg)
				Log.Error(this.getClass(), ex.getMessage());
			return ex.getMessage();
		}

		return result;
	}

	public String updateRuntimeSql(JSONObject param) {
		String sql = String.format("UPDATE  %s.%s SET ", ConstDef.DATA_BASE, param.get("table").toString());
		String result = null;
		JSONArray pk = (JSONArray) param.get("pk");
		if (pk == null || pk.size() == 0) {
			return "조건절 Key가 없음";
		}
		JSONArray inParam = (JSONArray) param.get("ps");
		StringBuilder fieldName = null;
		StringBuilder pkFieldName = null;
		JSONArray exceptKey = null;
		boolean isExcept = false;
		if (param.containsKey("exceptKey")) {
			exceptKey = (JSONArray) param.get("exceptKey");
		}

		for (int i = 0; i < inParam.size(); i++) {
			JSONObject item = (JSONObject) inParam.get(i);
			// pk null 또는 pk key value 체크
			if (i == 0) {
				for (Object o : pk) {
					if (!item.containsKey(o.toString())) {
						return "조건절 Key Value 누락";
					}
				}
			}
			Iterator it = item.keySet().iterator();
			fieldName = new StringBuilder();
			pkFieldName = new StringBuilder();
			while (it.hasNext()) {
				String key = it.next().toString();
				isExcept = false;
				for (int j = 0; exceptKey != null && j < exceptKey.size(); j++) {
					if (exceptKey.get(j).toString().equals(key)) {
						isExcept = true;
						break;
					}
				}
				if (isExcept)
					continue;
				boolean isPk = false;
				for (Object o : pk) {
					if (o.toString().equals(key)) {
						isPk = true;
					}
				}
				if (isPk) {
					if (item.get(key) != null)
						pkFieldName.append(CommonLib.camelCaseToUnderscore(key)).append("=").append("\"").append(item.get(key).toString()).append("\" AND ");
					else
						pkFieldName.append(CommonLib.camelCaseToUnderscore(key)).append("=").append("\"").append("null").append("\" AND ");
				} else {
					if (item.get(key) == null) {
						fieldName.append(CommonLib.camelCaseToUnderscore(key)).append("=null").append(",");
					} else {
						if (item.get(key).toString().equalsIgnoreCase("true")
								|| item.get(key).toString().equalsIgnoreCase("false")) {
							fieldName.append(CommonLib.camelCaseToUnderscore(key)).append("=").append(item.get(key).toString()).append(",");
						} else
							fieldName.append(CommonLib.camelCaseToUnderscore(key)).append("=").append("'").append(item.get(key).toString()).append("',");
					}
				}
			}
			fieldName = new StringBuilder(fieldName.substring(0, fieldName.length() - 1));
			pkFieldName = new StringBuilder(pkFieldName.substring(0, pkFieldName.length() - 5));

			String runSql = sql + fieldName + " WHERE " + pkFieldName + ";";
			try {
				this.jdbcTemplate.execute(runSql);
			} catch (Exception ex) {
				Log.Error(this.getClass(), ex.getMessage());
				return ex.getMessage();
			}
		}

		return result;
	}

	public List<Map<String, Object>> selectRuntimeSqlByKey(JSONObject param) {
		JSONArray pk = (JSONArray) param.get("pk");
		JSONObject inParam = (JSONObject) param.get("ps");
		String pkFieldName = "";
		
		for (Object o : pk) {
			String key = o.toString();
			// String value = inParam.get(key).toString();
			pkFieldName += (CommonLib.camelCaseToUnderscore(key) + "=" + "\""
				+ inParam.get(key).toString() + "\" AND ");
		}
		pkFieldName = pkFieldName.substring(0, pkFieldName.length() - 5);
		String runSql = String.format("SELECT * FROM  %s.%s WHERE %s;",
				ConstDef.DATA_BASE,
				param.get("table").toString(), pkFieldName);
		Log.Debug(this.getClass(), runSql);

		List<Map<String, Object>> out = this.jdbcTemplate.queryForList(runSql);

		return CommonLib.underToCamel((List<Map<String, Object>>) out);

	}

	public String insertOrupdateRuntimeSql(JSONObject param) {

		String sql = String.format("INSERT INTO  %s.%s", ConstDef.DATA_BASE, param.get("table").toString());
		String result = null;
		JSONArray inParam = (JSONArray) param.get("ps");
		StringBuilder fieldName = null;
		StringBuilder values = null;
		JSONArray exceptKey = null;
		boolean isExcept = false;
		if (param.containsKey("exceptKey")) {
			exceptKey = (JSONArray) param.get("exceptKey");
		}

		for (int i = 0; i < inParam.size(); i++) {
			int count = countRuntimeSql(param, i);
			if (count > 0) {
				/*
				 * JSONObject item = (JSONObject)inParam.get(i);
				 * if (item.containsKey("품번") && param.get("table").toString().equals("품목정보")) {
				 * Log.Trace(this.getClass(),
				 * "Already record 품번= %s",item.get("품번").toString());
				 * }
				 */
				result = eachupdateRuntimeSql(param, i);
			} else {
				JSONObject item = (JSONObject) inParam.get(i);
				Iterator it = item.keySet().iterator();
				fieldName = new StringBuilder(" (");
				values = new StringBuilder(" VALUES(");
				while (it.hasNext()) {
					String key = it.next().toString();
					isExcept = false;
					for (int j = 0; exceptKey != null && j < exceptKey.size(); j++) {
						if (exceptKey.get(j).toString().equals(key)) {
							isExcept = true;
							break;
						}
					}
					if (isExcept)
						continue;
					fieldName.append(CommonLib.camelCaseToUnderscore(key)).append(",");
					if (item.get(key) != null)
						values.append("'").append(item.get(key).toString().replace("\"", "")).append("',");
					else
						values.append("null" + ",");
				}
				fieldName = new StringBuilder(fieldName.substring(0, fieldName.length() - 1) + ")");
				values = new StringBuilder(values.substring(0, values.length() - 1) + ");");

				String runSql = sql + fieldName + values;
				Log.Debug(runSql);

				this.jdbcTemplate.execute(runSql);
			}

		}
		return result;
	}

	public String insetOrNoupdateRuntimeSql(JSONObject param) {

		String sql = String.format("INSERT INTO  %s.%s", ConstDef.DATA_BASE, param.get("table").toString());
		String result = null;
		JSONArray inParam = (JSONArray) param.get("ps");
		StringBuilder fieldName = null;
		StringBuilder values = null;
		JSONArray exceptKey = null;
		boolean isExcept = false;
		if (param.containsKey("exceptKey")) {
			exceptKey = (JSONArray) param.get("exceptKey");
		}

		for (int i = 0; i < inParam.size(); i++) {
			int count = countRuntimeSql(param, i);
			if (count > 0) {
				return null;
			} else {
				JSONObject item = (JSONObject) inParam.get(i);
				Iterator it = item.keySet().iterator();
				fieldName = new StringBuilder(" (");
				values = new StringBuilder(" VALUES(");
				while (it.hasNext()) {
					String key = it.next().toString();
					isExcept = false;
					for (int j = 0; exceptKey != null && j < exceptKey.size(); j++) {
						if (exceptKey.get(j).toString().equals(key)) {
							isExcept = true;
							break;
						}
					}
					if (isExcept)
						continue;
					fieldName.append(CommonLib.camelCaseToUnderscore(key)).append(",");
					if (item.get(key) != null)
						values.append("'").append(item.get(key).toString().replace("\"", "")).append("',");
					else
						values.append("null" + ",");
				}
				fieldName = new StringBuilder(fieldName.substring(0, fieldName.length() - 1) + ")");
				values = new StringBuilder(values.substring(0, values.length() - 1) + ");");

				String runSql = sql + fieldName + values;

				this.jdbcTemplate.execute(runSql);
			}

		}
		return result;
	}

	public int countRuntimeSql(JSONObject param, int index) {
		String sql = String.format("SELECT COUNT(*) AS COUNT FROM  %s.%s  ",
				ConstDef.DATA_BASE,
				param.get("table").toString());
		int result = 0;
		JSONArray pk = (JSONArray) param.get("pk");
		JSONArray inParam = (JSONArray) param.get("ps");
		StringBuilder pkFieldName = null;

		JSONObject item = (JSONObject) inParam.get(index);
		Iterator it = item.keySet().iterator();
		pkFieldName = new StringBuilder();

		while (it.hasNext()) {
			String key = it.next().toString();
			boolean isPk = false;
			for (Object o : pk) {
				if (o.toString().equals(key)) {
					isPk = true;
				}
			}
			if (isPk) {
				pkFieldName.append(CommonLib.camelCaseToUnderscore(key)).append("=").append("\"").append(item.get(key).toString()).append("\" AND ");
			}
		}
		pkFieldName = new StringBuilder(pkFieldName.substring(0, pkFieldName.length() - 5));

		String runSql = sql + " WHERE " + pkFieldName + ";";
		try {
			List<Map<String, Object>> out = this.getJdbcTemplate().queryForList(runSql);
			result = Integer.parseInt(out.get(0).get("COUNT").toString());
		} catch (Exception ex) {
			Log.Error(this.getClass(), ex.getMessage());
			result = -1;
		}
		return result;
	}

	public String eachupdateRuntimeSql(JSONObject param, int index) {

		String sql = String.format("UPDATE  %s.%s SET ", ConstDef.DATA_BASE, param.get("table").toString());
		String result = null;
		JSONArray pk = (JSONArray) param.get("pk");
		JSONArray inParam = (JSONArray) param.get("ps");
		StringBuilder fieldName = null;
		StringBuilder pkFieldName = null;
		JSONArray exceptKey = null;
		boolean isExcept = false;
		if (param.containsKey("exceptKey")) {
			exceptKey = (JSONArray) param.get("exceptKey");
		}

		JSONObject item = (JSONObject) inParam.get(index);
		Iterator it = item.keySet().iterator();
		fieldName = new StringBuilder();
		pkFieldName = new StringBuilder();
		while (it.hasNext()) {
			String key = it.next().toString();
			isExcept = false;
			for (int j = 0; exceptKey != null && j < exceptKey.size(); j++) {
				if (exceptKey.get(j).toString().equals(key)) {
					isExcept = true;
					break;
				}
			}
			if (isExcept)
				continue;
			boolean isPk = false;
			for (Object o : pk) {
				if (o.toString().equals(key)) {
					isPk = true;
				}
			}
			if (isPk) {
				pkFieldName.append(CommonLib.camelCaseToUnderscore(key)).append("=").append("\"").append(item.get(key).toString().replace("\"", "")).append("\" AND ");
			} else {
				if (item.get(key) == null) {
					fieldName.append(CommonLib.camelCaseToUnderscore(key)).append("=null").append(",");
				} else {
					fieldName.append(CommonLib.camelCaseToUnderscore(key)).append("=").append("'").append(item.get(key).toString().replace("\"", "")).append("',");
				}
			}
		}
		fieldName = new StringBuilder(fieldName.substring(0, fieldName.length() - 1));
		pkFieldName = new StringBuilder(pkFieldName.substring(0, pkFieldName.length() - 5));

		String runSql = sql + fieldName + " WHERE " + pkFieldName + ";";
		try {
			this.jdbcTemplate.execute(runSql);
		} catch (Exception ex) {
			Log.Error(this.getClass(), ex.getMessage());
			return ex.getMessage();
		}

		return result;
	}

	public List<Map<String, Object>> selectRuntimeSql(JSONObject param, Boolean... primaryDb) {
		String sql = null;
		JSONObject inParam = (JSONObject) param.get("ps");
		StringBuilder fieldName = new StringBuilder();
		if (inParam != null && inParam.size() > 0) {
			sql = String.format("SELECT * FROM %s.%s WHERE ",
					ConstDef.DATA_BASE,
					param.get("table").toString());
			for (Object o : inParam.keySet()) {
				String key = o.toString();
				
				fieldName.append(CommonLib.camelCaseToUnderscore(key)).append("=").append("\"").append(inParam.get(key).toString()).append("\" AND ");
				
			}
			fieldName = new StringBuilder(fieldName.substring(0, fieldName.length() - 5));
		} else {
			sql = String.format("SELECT * FROM %s.%s", ConstDef.DATA_BASE, param.get("table").toString());
		}
		String runSql = sql + fieldName + ";";

		List<Map<String, Object>> out = null;
		if(primaryDb.length > 0 && primaryDb[0] == true) {
			out = this.jdbcTemplate.queryForList(runSql);
		} else {
			out = this.getJdbcTemplate().queryForList(runSql);
		}

		return CommonLib.underToCamel((List<Map<String, Object>>) out);
	}

	public List<Map<String, Object>> selectRuntimeDevCustomSql(JSONObject param) {
		String sql = null;
		JSONObject inParam = (JSONObject) param.get("ps");

		if (inParam == null) {
			return null;
		}
		String fieldName = "";
		String sort = "";
		Long rowCount = 0l;
		JSONArray inGroup = null;
		if (inParam.containsKey("group")) {
			inGroup = (JSONArray) inParam.get("group");
			String lookupKey = ((JSONObject) inGroup.get(0)).get("selector").toString();
			
			sql = String.format("SELECT %s AS `KEY`, count(*) AS COUNT FROM %s.%s GROUP BY %s;"
					,CommonLib.camelCaseToUnderscore(lookupKey)
					,ConstDef.DATA_BASE
					,param.get("table").toString()
					,CommonLib.camelCaseToUnderscore(lookupKey)
			);

			Log.Debug(inGroup.toJSONString());

		} else if (inParam.containsKey("filter") && ((JSONArray) inParam.get("filter")).size() > 0) {
			JSONArray inFilter = (JSONArray) inParam.get("filter");
			if (inParam.containsKey("group")) {
				inGroup = (JSONArray) inParam.get("group");
				Log.Debug(inGroup.toJSONString());
			}
			sql = String.format("SELECT * FROM %s.%s WHERE ",
					ConstDef.DATA_BASE,
					param.get("table").toString());
			
			for (Object o : inFilter) {
				List array = (List) o;
				fieldName += String.format(" %s %s AND ",
					CommonLib.camelCaseToUnderscore(array.get(0).toString()),
					this.ConvertOperate(array.get(1).toString(), array.get(2)));
			}
			fieldName = fieldName.substring(0, fieldName.length() - 5);
			String totalCount = String.format("SELECT COUNT(*) AS count FROM %s.%s WHERE %s;",
				ConstDef.DATA_BASE, param.get("table").toString(), fieldName);
			List<Map<String, Object>> totalRow = this.jdbcTemplate.queryForList(totalCount);
			rowCount = (Long) totalRow.get(0).get("count");
		} else {
			sql = String.format("SELECT * FROM %s.%s", ConstDef.DATA_BASE, param.get("table").toString());
			String totalCount = String.format("SELECT COUNT(*) AS count FROM %s.%s;", ConstDef.DATA_BASE, param.get("table").toString());
			List<Map<String, Object>> totalRow = this.jdbcTemplate.queryForList(totalCount);
			rowCount = (Long) totalRow.get(0).get("count");
		}
		if (inParam.containsKey("sort")) {
			JSONArray sortArray = (JSONArray) inParam.get("sort");
			for (Object o : sortArray) {
				sort = "ORDER BY "
					+ CommonLib.camelCaseToUnderscore(((JSONObject) o).get("selector").toString())
					+ " ";
				sort += ((JSONObject) o).get("desc").toString().equalsIgnoreCase("true") ? "DESC" : "";
			}

		}
		String runSql = "";
		if (inParam.containsKey("skip")) {
			runSql = String.format(("%s%s %s Limit %d,%d;"),
					sql, fieldName, sort, (Long) inParam.get("skip"), (Long) inParam.get("take"));
		} else {
			runSql = String.format(("%s%s;"), sql, fieldName);
		}

		List<Map<String, Object>> out = this.getJdbcTemplate().queryForList(runSql);
		if (out.size() > 0) {
			out.get(0).put("TOTAL_COUNT", rowCount);
		}

		return CommonLib.underToCamel((List<Map<String, Object>>) out);
	}
	public String ConvertOperate(String op, Object value) {
		String result = op;
		switch (op) {
			case "startswith":
				result = String.format("%s '%s'", "like", value.toString() +"%");
				break;
			case "contains":
				result = String.format("%s '%s'", "like", "%" + value.toString() + "%");
				break;
			case "endswith":
				result = String.format("%s '%s'", "like", "%"+value.toString());
				break;
			case "notcontains":
				result = String.format("%s '%s'", "not like", "%" + value.toString() + "%");
				break;
			default:
				if (value instanceof String) {
					result = String.format("%s '%s'", op, value.toString());
				} else {
					result = String.format("%s %s", op, value.toString());
				}
		}
		return result;
	}

	public String deleteRuntimeSql(JSONObject param) {
		String sql = String.format("DELETE FROM  %s.%s WHERE ",
				ConstDef.DATA_BASE,
				param.get("table").toString());
		String result = null;
		JSONArray inParam = (JSONArray) param.get("ps");
		StringBuilder fieldName = null;
		if (inParam == null || inParam.size() == 0) {
			return "삭제 프라이머리키를 찾을 수 없습니다.";
		}
		for (Object o : inParam) {
			JSONObject item = (JSONObject) o;
			Iterator it = item.keySet().iterator();
			fieldName = new StringBuilder();
			while (it.hasNext()) {
				String key = it.next().toString();
				
				fieldName.append(CommonLib.camelCaseToUnderscore(key)).append("=").append("\"").append(item.get(key).toString()).append("\" AND ");
				
			}
			fieldName = new StringBuilder(fieldName.substring(0, fieldName.length() - 5));
			
			String runSql = sql + fieldName + ";";
			try {
				this.jdbcTemplate.execute(runSql);
			} catch (Exception ex) {
				Log.Error(this.getClass(), ex.getMessage());
				return ex.getMessage();
			}
		}

		return result;
	}

	public String directCallSql(String sql) {

		try {
			this.jdbcTemplate.execute(sql);
		} catch (Exception ex) {
			Log.Error(this.getClass(), ex.getMessage());
			return ex.getMessage();
		}

		return null;

	}

	public String directCallSqlNoMsg(String sql) {

		try {
			this.jdbcTemplate.execute(sql);
		} catch (Exception ex) {
			// Log.Error(this.getClass(), ex.getMessage());
			return ex.getMessage();
		}

		return null;

	}

	public List<Map<String, Object>> runSqlSelect(String sql, Boolean... primaryDb) {
		List<Map<String, Object>> result = null;
		try {
			if (primaryDb.length > 0 && primaryDb[0] == true) {
				result = this.jdbcTemplate.queryForList(sql);	
			} else {
				result = this.getJdbcTemplate().queryForList(sql);
			}
		} catch (Exception ex) {
			Log.Error(this.getClass(), ex.getMessage());
			return null;
		}

		return result;
	}

	public void eachUpdate(Map<String, Object> inParamMap, String procName, String db) {
		SimpleJdbcCall simpleJdbcCallRefCursor = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName(db)
				.withProcedureName(procName);

		simpleJdbcCallRefCursor.execute(inParamMap);
	}

	public void regActionHistory(String userId, String action, String param) {
		String sql = null;
		if (param != null) {
			sql = String.format("INSERT INTO %s.테이블수정이력(등록아이디,액션,파라메터) VALUES('%s','%s','%s');",
					ConstDef.DATA_BASE, userId, action, param.length() > 1024 ? param.substring(0, 1024) : param);
		} else {
			sql = String.format("INSERT INTO %s.테이블수정이력(등록아이디,액션) VALUES('%s','%s');",
					ConstDef.DATA_BASE, userId, action);
		}

		this.directCallSql(sql);

	}

}
