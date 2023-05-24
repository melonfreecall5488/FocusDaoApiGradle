package com.smart.focus.ceoapi.service.SoapService.SoapApiClass;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import java.util.Base64;
import java.util.Iterator;
import java.util.Map;
import java.util.Base64.Encoder;

import com.smart.focus.ceoapi.common.CommonLib;
import com.smart.focus.ceoapi.common.ConstDef;
import com.smart.focus.ceoapi.common.Log;

import org.json.simple.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class ByDRestApi {
	public static String getToken() {
		MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
		body.add("grant_type", "client_credentials"); // 파라메터 설정

		HttpHeaders headers = new HttpHeaders();
		Encoder encoder = Base64.getEncoder();
		String site = null;
		if (ConstDef.TEST_BED) {
			site = "https://dev.bizplus.ustracloud.com/oauth/token";
			headers.add("Authorization",
					String.format("Basic %s", new String(encoder.encode("client:secret".getBytes())))); // 권한설정 id,pw
		} else {
			site = "https://bizplus.ustracloud.com/oauth/token";
			headers.add("Authorization",
					String.format("Basic %s", new String(encoder.encode("eden_itf_prod:fdjeo34irnroe234_djfo-hei".getBytes())))); // 권한설정 id,pw
		}

		HttpEntity<MultiValueMap<String, String>> httpEntity = new HttpEntity<>(body, headers);
		RestTemplate restTemplate = new RestTemplate();

		ResponseEntity<Map> result = restTemplate.postForEntity(site, httpEntity, Map.class);
		Map<String, Object> obj = null;
		obj = result.getBody();
		if (obj.containsKey("access_token")) {
			Log.Debug(obj.get("access_token").toString());
			return obj.get("access_token").toString();
		}
		return "FAIL";
	}

	public static String sendPickingResult(JSONObject list) {
		String token = getToken();
		if (token.equals("FAIL")) {
			return "FAIL";
		}
		String result = "";
		String site = "https://sales.bizplus.ustracloud.com/api/mes/delivery/CeoRctSPking";
		if (ConstDef.TEST_BED) {
			site = "http://dev.sales.bizplus.ustracloud.com/api/mes/delivery/ceoRctSPking";
			// "https://dev.sales.bizplus.ustracloud.com/api/mes/delivery/RctSPking";
			result = CommonLib.httpConnection(site, list.toJSONString(), "POST", token);
		} else {
			result = CommonLib.httpsConnection(site, list.toJSONString(), "POST", token);
		}

		return result;
	}
	public static String sendPackingResult(JSONObject list) {
        String token = getToken();
		if (token.equals("FAIL")) {
			return "FAIL";
		}
		String result = "";
		String site = "https://sales.bizplus.ustracloud.com/api/mes/delivery/receiptPack";
		if (ConstDef.TEST_BED) {
			site = "http://dev.sales.bizplus.ustracloud.com/api/mes/delivery/receiptPack";
			result = CommonLib.httpConnection(site, list.toJSONString(), "POST", token);
		} else {
			result = CommonLib.httpsConnection(site, list.toJSONString(), "POST", token);
		}

		return result;
    }
	
	public static String sendAdcodeResult(JSONObject list) {
		String token = getToken();
		if (token.equals("FAIL")) {
			return "FAIL";
		}
		String result = "";
		String site = "http://sales.bizplus.ustracloud.com/api/mes/delivery/ceo/adResultReq";
		if (ConstDef.TEST_BED) {
			site = "http://dev.sales.bizplus.ustracloud.com/api/mes/delivery/ceo/adResultReq";
			result = CommonLib.httpConnection(site, list.toJSONString(), "POST", token);
		} else {
			result = CommonLib.httpsConnection(site, list.toJSONString(), "POST", token);
		}

		return result;
	}

	public static String reqCustomerInfo(JSONObject param) {
		String result = "";
		String queryParam = "";

		String token = getToken();
		if (token.equals("FAIL")) {
			return "FAIL";
		}
		Iterator it = param.keySet().iterator();
		while (it.hasNext()) {
			String orgKey = it.next().toString();
			queryParam += orgKey + "=" + param.get(orgKey).toString() + "&";
		}
		if (queryParam.length() > 1) {
			queryParam = queryParam.substring(0, queryParam.length()-1);
		}
		String site = "http://sales.bizplus.ustracloud.com/api/mes/delivery/cust/info";
		if (ConstDef.TEST_BED) {
			site = "http://dev.sales.bizplus.ustracloud.com/api/mes/delivery/cust/info";
			result = CommonLib.httpConnection(site, queryParam, "GET", token);
		} else {
			result = CommonLib.httpsConnection(site, queryParam, "GET", token);
		}

		return result;
	}

   

}