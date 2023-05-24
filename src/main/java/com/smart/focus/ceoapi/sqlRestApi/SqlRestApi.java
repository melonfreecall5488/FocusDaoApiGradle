package com.smart.focus.ceoapi.sqlRestApi;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


@SuppressWarnings({ "unchecked", "rawtypes" })
public class SqlRestApi {
    
    private String userId;
    private String passwd;
    private static JSONObject receiveToken = new JSONObject();
    JSONParser parser = new JSONParser();
    private Long SUCCESS = 0x01L;
    private Long FAIL = 0x0L;

    public SqlRestApi(String userId, String passwd) {
        this.userId = userId;
        this.passwd = passwd;
    }

    public String getToken(String url) {
        if (SqlRestApi.receiveToken.containsKey("token")) {
            Long now =  new Date().getTime();
            Long effectiveDate = (Long) SqlRestApi.receiveToken.get("effectiveDate");
            if (effectiveDate > now) {
                return SqlRestApi.receiveToken.get("token").toString();
            }
        }
        JSONObject param = new JSONObject();

        param.put("userId", this.userId);
        param.put("passwd", this.passwd);
        SendParamModel sendParm = new SendParamModel();
        sendParm.command = 0x0011;
        sendParm.body = param.toJSONString();

        String result = this.sendHttpByHttpEntity(url + "/jwtTockenByAuthkey", sendParm, "POST", "");
        try {
            JSONObject decode = (JSONObject) this.parser.parse(result);
            if ((Long) decode.get("result") == this.SUCCESS) {
                SqlRestApi.receiveToken.put("token", decode.get("token").toString());
                SqlRestApi.receiveToken.put("effectiveDate", new Date().getTime() + (3600 * 1000L));
                return decode.get("token").toString();
            }
        } catch (Exception e) {
            return "FAIL";
        }
        return "FAIL";
    }
    
    public String sendHttpByHttpEntity(String site, SendParamModel param, String type, String token) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.add("Authorization", "Bearer " + token);

        HttpEntity<SendParamModel> entity = new HttpEntity<>(param, httpHeaders);
        RestTemplate restTemplate = new RestTemplate();
        String responseNode = "";
        try {
            if (type.equals("POST")) {
                responseNode = restTemplate.postForObject(site, entity, String.class);
            } else {
                responseNode = restTemplate.getForObject(site, String.class);
            }
        } catch (Exception ex) {
            return null;
        }
        return responseNode;
    }
     
    public Object runFindProc(String proc, JSONObject param, String url, Boolean isResultJsonArray) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("proc", proc);
        jsonObject.put("ps", param);

        SendParamModel sendParm = new SendParamModel();
        sendParm.command = 0x0011;
        sendParm.body = jsonObject.toJSONString();

        String result = this.sendHttpByHttpEntity(url + "/spSelect", sendParm, "POST", this.getToken(url));
        JSONObject decode = null;
        Object reply = null;
        if (result != null) {
            try {
                decode = (JSONObject) this.parser.parse(result);
                if ((Long) decode.get("result") != this.SUCCESS) {
                    return null;
                }
                if (isResultJsonArray) {
                    reply = (JSONArray) this.parser.parse((String) decode.get("body"));
                } else {
                    reply = new ObjectMapper().readValue((String) decode.get("body"),
                            new TypeReference<List<Map<String, Object>>>() {
                            });
                }
            } catch (Exception e) {
                return null;
            }
        }

        return reply;
    }
    public Object runUpdateFindProc(String proc, JSONObject param, String url, Boolean isResultJsonArray) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("proc", proc);
        jsonObject.put("ps", param);

        SendParamModel sendParm = new SendParamModel();
        sendParm.command = 0x0011;
        sendParm.body = jsonObject.toJSONString();

        String result = this.sendHttpByHttpEntity(url + "/spUpdateSelect", sendParm, "POST", this.getToken(url));
        JSONObject decode = null;
        Object reply = null;
        if (result != null) {
            try {
                decode = (JSONObject) this.parser.parse(result);
                if ((Long) decode.get("result") != this.SUCCESS) {
                    return null;
                }
                if (isResultJsonArray) {
                    reply = (JSONArray) this.parser.parse((String) decode.get("body"));
                } else {
                    reply = new ObjectMapper().readValue((String) decode.get("body"), new TypeReference<List<Map<String, Object>>>() {});
                }
            } catch (Exception e) {
                return null;
            }
        }

        return reply;
    }
    
    public Long runUpdateProc(String proc, JSONArray param, String url) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("proc", proc);
        jsonObject.put("ps", param);

        SendParamModel sendParm = new SendParamModel();
        sendParm.command = 0x0011;
        sendParm.body = jsonObject.toJSONString();

        String result = this.sendHttpByHttpEntity(url + "/spUpdate", sendParm, "POST", this.getToken(url));
        JSONObject decode = null;
        if (result != null) {
            try {
                decode = (JSONObject) this.parser.parse(result);
                if ((Long) decode.get("result") != this.SUCCESS) {
                    return this.FAIL;
                }

            } catch (Exception e) {
                return null;
            }
        }
        return this.SUCCESS;
    }
    
    public Object runFindSqlProc(String table, JSONObject param, String url, Boolean isResultJsonArray) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("table", table);
        jsonObject.put("ps", param);

        SendParamModel sendParm = new SendParamModel();
        sendParm.command = 0x0011;
        sendParm.body = jsonObject.toJSONString();

        String result = this.sendHttpByHttpEntity(url + "/runtimeSqlSelect", sendParm, "POST", this.getToken(url));
        JSONObject decode = null;
        Object reply = null;
        if (result != null) {
            try {
                decode = (JSONObject) this.parser.parse(result);
                if ((Long) decode.get("result") != this.SUCCESS) {
                    return null;
                }
                if (isResultJsonArray) {
                    reply = (JSONArray) this.parser.parse((String) decode.get("body"));
                } else {
                    reply = new ObjectMapper().readValue((String) decode.get("body"),
                            new TypeReference<List<Map<String, Object>>>() {
                            });
                }
            } catch (Exception e) {
                return null;
            }
        }

        return reply;
    }
    
    /* *******************************************************
        SqlRestApi api = new SqlRestApi("system", "1234568a");
    	JSONArray ps = new JSONArray();
    	JSONObject param = new JSONObject();
    	param.put("TEST", 11111);
    	param.put("id", 123456);
    	ps.add(param);
    	JSONArray exceptKey = new JSONArray();
    	exceptKey.add("id");
        Long result = (Long)api.runInsertSqlProc("TEST", exceptKey, ps, "http://127.0.0.1:8082/restApi");
     ********************************************************** */
    public Long runInsertSqlProc(String table, JSONArray exceptKey, JSONArray params, String url) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("table", table);
        jsonObject.put("exceptKey", exceptKey);
        jsonObject.put("ps", params);

        SendParamModel sendParm = new SendParamModel();
        sendParm.command = 0x0011;
        sendParm.body = jsonObject.toJSONString();

        String result = this.sendHttpByHttpEntity(url + "/runtimeSqlInsert", sendParm, "POST", this.getToken(url));
        JSONObject decode = null;
        if (result != null) {
            try {
                decode = (JSONObject) this.parser.parse(result);
                if ((Long) decode.get("result") != this.SUCCESS) {
                    return this.FAIL;
                }
            } catch (Exception e) {
                return null;
            }
        }
        return this.SUCCESS;
    }

    public Long runUpdateSqlProc(String table, JSONArray pk, JSONArray exceptKey, JSONArray params, String url) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("table", table);
        jsonObject.put("pk", pk);
        jsonObject.put("exceptKey", exceptKey);
        jsonObject.put("ps", params);

        SendParamModel sendParm = new SendParamModel();
        sendParm.command = 0x0011;
        sendParm.body = jsonObject.toJSONString();

        String result = this.sendHttpByHttpEntity(url + "/runtimeSqlUpdate", sendParm, "POST", this.getToken(url));
        JSONObject decode = null;
        if (result != null) {
            try {
                decode = (JSONObject) this.parser.parse(result);
                if ((Long) decode.get("result") != this.SUCCESS) {
                    return this.FAIL;
                }
            } catch (Exception e) {
                return null;
            }
        }
        return this.SUCCESS;
    }

    public Long runDeleteSqlProc(String table, JSONArray params, String url) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("table", table);
        jsonObject.put("ps", params);

        SendParamModel sendParm = new SendParamModel();
        sendParm.command = 0x0011;
        sendParm.body = jsonObject.toJSONString();

        String result = this.sendHttpByHttpEntity(url + "/runtimeSqlDelete", sendParm, "POST", this.getToken(url));
        JSONObject decode = null;
        if (result != null) {
            try {
                decode = (JSONObject) this.parser.parse(result);
                if ((Long) decode.get("result") != this.SUCCESS) {
                    return this.FAIL;
                }
            } catch (Exception e) {
                return null;
            }
        }
        return this.SUCCESS;
    }
}
