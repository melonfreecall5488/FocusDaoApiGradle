package com.smart.focus.ceoapi.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.smart.focus.ceoapi.Interceptor.Auth;
import com.smart.focus.ceoapi.Interceptor.PreAuth;
import com.smart.focus.ceoapi.common.CommonLib;
import com.smart.focus.ceoapi.common.ConstDef;
import com.smart.focus.ceoapi.common.GeneralException;
import com.smart.focus.ceoapi.common.Log;
import com.smart.focus.ceoapi.common.Msg;
import com.smart.focus.ceoapi.common.PacketResult;
import com.smart.focus.ceoapi.common.UnauthorizedException;
import com.smart.focus.ceoapi.domain.ParamModel;
import com.smart.focus.ceoapi.domain.UserDO;
import com.smart.focus.ceoapi.service.JwtService;
import com.smart.focus.ceoapi.service.SpProcServiceImpl;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(allowCredentials = "true", originPatterns = "*", allowedHeaders = "*")
@RequestMapping("/restApi")
public class UserController {
  @Autowired
  private SpProcServiceImpl storeProcService;
  @Autowired
  private JwtService jwtService;
  @Resource(name = "authManager")
  Auth authManager;

  @SuppressWarnings("unchecked")
  @RequestMapping(value = "/termsOfService", method = { RequestMethod.GET })
  public String termsOfService(HttpServletRequest request, HttpServletResponse response) {
    Log.Debug(this.getClass(), "termsOfService Client=%s", CommonLib.getRemoteIp(request));

    JSONObject rep = new JSONObject();

    String sql = String.format("SELECT * FROM %s.이용약관 ORDER BY NO;", ConstDef.DATA_BASE);
    List<Map<String, Object>> list = storeProcService.runSqlSelect(sql);
    String encodeResult = null;
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

  @SuppressWarnings("unchecked")
  @RequestMapping(value = "/nameAndPhoneNo", method = RequestMethod.GET, headers = "Accept=application/json")
  public String nameAndPhoneNo(HttpServletRequest request, HttpServletResponse response,
      @RequestParam(value = "name", required = true, defaultValue = "") String name,
      @RequestParam(value = "phoneNo", required = true, defaultValue = "") String phoneNo) {
    String session = request.getSession().getId();
    Log.Debug(this.getClass(), "nameAndPhoneNo::%s/%s session id = %s", name, phoneNo, session);
    JSONObject rep = new JSONObject();

    String sql = String.format("SELECT * FROM %s.회원정보 WHERE 이름='%s' AND `폰번호`='%s';",
        ConstDef.DATA_BASE,
        name, phoneNo);
    List<Map<String, Object>> list = storeProcService.runSqlSelect(sql);
    if (list.size() == 0) {
      rep.put("result", PacketResult.ERR_NOUSER);
    } else {
      rep.put("result", PacketResult.SUCCESS);
    }
    return rep.toJSONString();
  }

  @SuppressWarnings("unchecked")
  @RequestMapping(value = "/emailIdAndPhoneNo", method = RequestMethod.GET, headers = "Accept=application/json")
  public String emailIdAndPhoneNo(HttpServletRequest request, HttpServletResponse response,
      @RequestParam(value = "emailId", required = true, defaultValue = "") String emailId,
      @RequestParam(value = "phoneNo", required = true, defaultValue = "") String phoneNo) {
    String session = request.getSession().getId();
    Log.Debug(this.getClass(), "nameAndPhoneNo::%s/%s session id = %s", emailId, phoneNo, session);
    JSONObject rep = new JSONObject();

    String sql = String.format("SELECT * FROM %s.회원정보 WHERE 이메일='%s' AND `폰번호`='%s';",
        ConstDef.DATA_BASE,
        emailId, phoneNo);
    List<Map<String, Object>> list = storeProcService.runSqlSelect(sql);
    if (list.size() == 0) {
      rep.put("result", PacketResult.ERR_NOUSER);
    } else {
      rep.put("result", PacketResult.SUCCESS);
    }
    return rep.toJSONString();
  }

  @SuppressWarnings("unchecked")
  @RequestMapping(value = "/getCertiSmsNo", method = RequestMethod.GET, headers = "Accept=application/json")
  public String getCertiSmsNo(HttpServletRequest request, HttpServletResponse response,
      @RequestParam(value = "type", required = true, defaultValue = "") String type,
      @RequestParam(value = "phoneNo", required = true, defaultValue = "") String phoneNo) {
    String session = request.getSession().getId();
    Log.Debug(this.getClass(), "getCertiSmsNo::%s/%s session id = %s", phoneNo, type, session);
    JSONObject rep = new JSONObject();
    // sms 회수

    String sql = String.format(
        "SELECT COUNT(*) AS count FROM %s.SMS인증번호 WHERE (폰번호='%s' OR SESSION='%s') AND 용도='%s' AND CREATE_TIME BETWEEN '%s' AND '%s 23:59:59';",
        ConstDef.DATA_BASE,
        phoneNo,
        session,
        type,
        CommonLib.getToday("yyyy-MM-dd"),
        CommonLib.getToday("yyyy-MM-dd"));
    List<Map<String, Object>> list = storeProcService.runSqlSelect(sql);
    if (list == null) {
      Log.Error(this.getClass(), "SMS 인증 3회 조회 error %s", phoneNo);
      rep.put("result", PacketResult.ERR_SERVER);
      return rep.toJSONString();
    }
    if ((Long) list.get(0).get("count") >= 3) {
      Log.Trace(this.getClass(), "SMS 인증 3회 오버 %s", phoneNo);
      rep.put("result", 3);
      GeneralException.exception(response, "test", Msg.NO_COMMON_FAIL);
      return null;
      // return rep.toJSONString();
    }

    int no = (int) (Math.random() * 100000);
    sql = String.format("INSERT INTO %s.SMS인증번호(폰번호, 인증번호, SESSION, 용도) VALUES('%s', %d, '%s', '%s');",
        ConstDef.DATA_BASE,
        phoneNo, no, session, type);
    if (storeProcService.directCallSql(sql) != null) {
      Log.Trace(this.getClass(), "SMS 인증 insert error %s", phoneNo);
      rep.put("result", PacketResult.ERR_SERVER);
      return rep.toJSONString();
    }

    JSONObject result = new JSONObject();

    result.put("읹증번호", no);
    result.put("폰번호", phoneNo);

    rep.put("result", PacketResult.SUCCESS);
    rep.put("body", result.toJSONString());
    return rep.toJSONString();

  }

  @SuppressWarnings("unchecked")
  @RequestMapping(value = "/certiSms", method = RequestMethod.GET, headers = "Accept=application/json")
  public String certiSms(HttpServletRequest request, HttpServletResponse response,
      @RequestParam(value = "type", required = true, defaultValue = "") String type,
      @RequestParam(value = "smsNo", required = true, defaultValue = "") String smsNo,
      @RequestParam(value = "phoneNo", required = true, defaultValue = "") String phoneNo) {

    Log.Debug(this.getClass(), "certiSms::%s smsNo = %s type=%s", phoneNo, smsNo, type);
    JSONObject rep = new JSONObject();
    // sms 회수
    JSONObject sendParam = new JSONObject();

    JSONObject ps = new JSONObject();
    ps.put("phoneNo", phoneNo);
    ps.put("smsNo", smsNo);
    ps.put("type", type);

    sendParam.put("proc", "spCertiSmsNo");
    sendParam.put("db", ConstDef.DATA_BASE);
    sendParam.put("ps", ps);
    List<Map<String, Object>> list = storeProcService.select(sendParam);

    if (list != null)
      Log.Trace(this.getClass(), "%s result row = %d", sendParam.get("proc").toString(), list.size());
    else
      Log.Trace(this.getClass(), "%s result row = null", sendParam.get("proc").toString());

    // 임시 JWT 발행
    if (Integer.parseInt(list.get(0).get("count").toString()) > 0) {
      String token = jwtService.createTokenToSignup(phoneNo, 1000L * 10);
      list.get(0).put("token", token);
    }

    String encodeResult = null;
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
    // GeneralException.exception(response, "test", Msg.NO_COMMON_FAIL);
    // return null;
    return rep.toJSONString();
  }

  @SuppressWarnings("unchecked")
  @RequestMapping(value = "/jwtTockenByAuthkey", method = { RequestMethod.GET, RequestMethod.POST })
	public String jwtTockenByAuthkey(HttpServletRequest request, HttpServletResponse response,
        @RequestBody ParamModel data) {
    Log.Debug(this.getClass(), "jwtTockenByAuthkey Client=%s Session Id= %s", CommonLib.getRemoteIp(request),
        request.getSession().getId());
    Log.Debug(this.getClass(), data.toString());
    JSONObject obj = null;
    JSONParser parser = new JSONParser();
    JSONObject rep = new JSONObject();

    try {
      obj = (JSONObject) parser.parse(data.getBody());
    } catch (ParseException e1) {
      e1.printStackTrace();
    }
    String sql = String.format("SELECT * FROM %s.WAS_AUTH WHERE id='%s' AND passwd='%s';", 
      ConstDef.DATA_BASE,
      obj.get("userId").toString(),
      obj.get("passwd").toString());
    List<Map<String, Object>> result = this.storeProcService.runSqlSelect(sql);
    if (result.size() == 0) {
      rep.put("result", PacketResult.ERR_NOUSER);
    } else {
      String token = jwtService.createTokenToSignup(obj.get("userId").toString(), 1000L * 120 * 60);
      rep.put("result", PacketResult.SUCCESS);
      rep.put("token", token);
    }
    
    return rep.toJSONString();
  }
  
  @SuppressWarnings("unchecked")
  @RequestMapping(value = "/auth/loginJwt", method = { RequestMethod.GET, RequestMethod.POST })
  public String loginJwt(HttpServletRequest request, HttpServletResponse response,
      @RequestBody ParamModel data) {

    Log.Debug(this.getClass(), "/auth/loginJwt=*************************************************",
        request.getSession().getId());
    Log.Debug(this.getClass(), data.toString());
    JSONObject obj = null;
    JSONParser parser = new JSONParser();
    JSONObject rep = new JSONObject();

    try {
      obj = (JSONObject) parser.parse(data.getBody());
    } catch (ParseException e1) {
      e1.printStackTrace();
    }
    String encodeResult = null;
    List<Map<String, Object>> array = storeProcService.select(obj);

    UserDO user = new UserDO();

    if (array.size() == 0) {
      user.setAuthResult(PacketResult.ERR_NOUSER);
    } else {
      Map<String, Object> result = array.get(0);
      user.setAuthResult(PacketResult.SUCCESS);
      user.setUserId(result.get("사번").toString());
      user.setPasswd("");
      user.setUserName((String) result.get("성명"));
      user.setPermission((Integer) result.get("권한"));
      user.setUserStatus(((Boolean) result.get("사용유무")) ? "N" : "T");
      user.setCompanyCode((String) result.get("회사코드"));
      user.setDivision((String) result.get("부서코드"));
      String token = jwtService.createToken(user);
      user.setToken(token);
      user.setRefreshToken(jwtService.createTokenToSignup(result.get("사번").toString(), ConstDef.TOKEN_REFRESH_TIME));
      user.setUserImage((String) result.get("포토url"));
      request.getSession().setAttribute(ConstDef.SESSION_USER_INFO, user);
    }

    try {
      Gson gson = CommonLib.getGsonTimestamp();
      encodeResult = gson.toJson(user);
    } catch (Exception e) {
      Log.Error(this.getClass(), e.getMessage());
      rep.put("result", PacketResult.ERR_PARAMS);
      return rep.toJSONString();
    }
    rep.put("result", PacketResult.SUCCESS);
    rep.put("body", encodeResult);
    return rep.toJSONString();
  }

  @SuppressWarnings("unchecked")
  @RequestMapping(value = "/auth/refreshJwt", method = { RequestMethod.GET, RequestMethod.POST })
  public String refreshJwt(HttpServletRequest request, HttpServletResponse response,
      @RequestBody String jsonString) {

    Log.Debug(this.getClass(), "/auth/refreshJwt=*************************************************",
        request.getSession().getId());
    authManager.checkRefreshToken();

    JSONObject rep = new JSONObject();
    JSONParser parser = new JSONParser();
    JSONObject obj = null;

    try {
      obj = (JSONObject) parser.parse(jsonString);
    } catch (ParseException e1) {
      e1.printStackTrace();
    }
    String sql = String.format("SELECT * FROM %s.직원정보 WHERE 사번='%s'",
        ConstDef.DATA_BASE,
        obj.get("userId").toString());
    List<Map<String, Object>> array = storeProcService.runSqlSelect(sql);

    if (array.size() == 0) {
      throw new UnauthorizedException();
    } else {
      UserDO user = new UserDO();
      user.setUserId(obj.get("userId").toString());
      user.setUserName("refreshToken");
      String token = jwtService.createToken(user);
      String refreshToekn = (jwtService.createTokenToSignup(obj.get("userId").toString(), ConstDef.TOKEN_REFRESH_TIME));
      rep.put("token", token);
      rep.put("refreshToken", refreshToekn);
    }

    return rep.toJSONString();
  }

  @SuppressWarnings("unchecked")
  @RequestMapping(value = "/auth/logout", method = { RequestMethod.GET, RequestMethod.POST })
  public String logout(HttpServletRequest request, HttpServletResponse response) {
    JSONObject rep = new JSONObject();
    Log.Debug(this.getClass(), "**logout Client=%s", CommonLib.getRemoteIp(request));

    request.getSession().removeAttribute(ConstDef.MEDIA_SESSION);
    rep.put("result", "SUCCESS");
    return rep.toJSONString();
  }
  @PreAuth
  @SuppressWarnings("unchecked")
  @RequestMapping(value = "/checkToken", method = { RequestMethod.GET }, headers = "Accept=application/json")
  public String logOut(HttpServletRequest request, HttpServletResponse response) {
    JSONObject rep = new JSONObject();
    Log.Debug(this.getClass(), "**checkToken Client=%s", CommonLib.getRemoteIp(request));

    rep.put("result", "SUCCESS");
    return rep.toJSONString();
  }

  @PreAuth
  @SuppressWarnings("unchecked")
  @RequestMapping(value = "/checkSession", method = { RequestMethod.GET }, headers = "Accept=application/json")
  public String checkSession(HttpServletRequest request, HttpServletResponse response) {
    JSONObject rep = new JSONObject();
    Log.Debug(this.getClass(), "**checkSession Client=%s", CommonLib.getRemoteIp(request));
    if (request.getSession().getAttribute(ConstDef.MEDIA_SESSION) == null) {
      request.getSession().setAttribute(ConstDef.MEDIA_SESSION, ConstDef.MEDIA_SESSION);
    }
    rep.put("result", "SUCCESS");
    return rep.toJSONString();
  }
}
