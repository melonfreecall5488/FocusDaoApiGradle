package com.smart.focus.ceoapi.service;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.smart.focus.ceoapi.common.CommonLib;
import com.smart.focus.ceoapi.common.ConstDef;
import com.smart.focus.ceoapi.common.Log;
import com.smart.focus.ceoapi.domain.UserDO;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;

@Service
public class JwtService {
  private String secretKey = "golf-ari-fdsjksfd"; // 서명에 사용할 secretKey

  public String createToken(UserDO userInfo) { // 토큰에 담고싶은 값 파라미터로 가져오기
    Long now = System.currentTimeMillis();
    Log.Debug(this.getClass(), "usingToken Time=%s", CommonLib.timestampToFormat(now + ConstDef.TOKEN_EXPIRED_TIME, "yyyy-MM-dd HH:mm:ss"));
    return Jwts.builder()
        .setHeaderParam("typ", "JWT") // 토큰 타입
        .setSubject("mesUserToken") // 토큰 제목
        .setIssuedAt(new Date(now))
        .setExpiration(new Date(now + ConstDef.TOKEN_EXPIRED_TIME)) // 토큰 유효시간
        .claim("userId", userInfo.getUserId()) // 토큰에 담을 데이터
        .claim("userName", userInfo.getUserName()) // 토큰에 담을 데이터
        .signWith(SignatureAlgorithm.HS256, secretKey.getBytes()) // secretKey를 사용하여 해싱 암호화 알고리즘 처리
        .compact(); // 직렬화, 문자열로 변경
  }

  public String createTokenToSignup(String phoneNo, long time) { // 토큰에 담고싶은 값 파라미터로 가져오기
    Long now = System.currentTimeMillis();
    Log.Debug(this.getClass(), "refreshToken Time = %s", CommonLib.timestampToFormat(
        now + time, "yyyy-MM-dd HH:mm:ss"));
    return Jwts.builder()
        .setHeaderParam("typ", "JWT") // 토큰 타입
        .setSubject("mesUserToken") // 토큰 제목
        .setIssuedAt(new Date(now))
        .setExpiration(new Date(now + time)) // 토큰 유효시간
        .claim("userId",
            phoneNo) // 토큰에 담을 데이터
        .claim("userName",
            phoneNo) // 토큰에 담을 데이터
        .signWith(SignatureAlgorithm.HS256, secretKey.getBytes()) // secretKey를 사용하여 해싱 암호화 알고리즘 처리
        .compact(); // 직렬화, 문자열로 변경
  }

  // 토큰에 담긴 정보를 가져오기 메서드
  public Map<String, Object> getInfo(String token) throws ExpiredJwtException, Exception {
    Jws<Claims> claims = null;
    try {
      claims = Jwts.parser().setSigningKey(secretKey.getBytes()).parseClaimsJws(token); // secretKey를 사용하여 복호화
    } catch (SignatureException | MalformedJwtException | UnsupportedJwtException | IllegalArgumentException ex) {
      Log.Error(ex.getMessage());
      throw new Exception(ex.getMessage());
    } catch (ExpiredJwtException ex) {
      // Log.Debug(ex.toString());
      // Claims tokenInfo = ex.getClaims();
      // Long exp = tokenInfo.getExpiration().getTime();
      // Long current = System.currentTimeMillis();
      // if ((current - exp) < 1000L * 10 * 60 * 60) { // 1시간 이내이면 토큰 재발급
      // UserDO userInfo = new UserDO();
      // userInfo.setUserId((String) tokenInfo.get("userId"));
      // userInfo.setUserName((String) tokenInfo.get("userName"));
      // if (tokenInfo.containsKey("permission")) {
      // userInfo.setPermission((Integer) tokenInfo.get("permission"));
      // }
      // String reToken = createToken(userInfo);
      throw ex;
    }
    // Log.Debug(claims.getHeader().toString());
    // Log.Debug(claims.getSignature());
    return claims.getBody();

  }

  // interceptor에서 토큰 유효성을 검증하기 위한 메서드
  public boolean checkValid(String token) {
    Jwts.parser().setSigningKey(secretKey.getBytes()).parseClaimsJws(token);

    try {
      Jwts.parser().setSigningKey(secretKey.getBytes()).parseClaimsJws(token);
      return true;
    } catch (MalformedJwtException e) {
      Log.Error("Invalid JWT token");
    } catch (ExpiredJwtException e) {
      Log.Error("Expired JWT token");
    } catch (UnsupportedJwtException e) {
      Log.Error("Unsupported JWT token");
    } catch (IllegalArgumentException e) {
      Log.Error("JWT claims string is empty.");
    } catch (Exception e) {
      Log.Error("Invalid JWT signature");
    }
    return false;
  }

  public UserDO getUserInfo(HttpServletRequest request) {
    String token = request.getHeader("Authorization").split(" ")[1];
    UserDO userInfo = new UserDO();

    Map<String, Object> info = null;
    try {
      info = this.getInfo(token);
    } catch (ExpiredJwtException e) {
    } catch (Exception e) {
      e.printStackTrace();
    }
    userInfo.setUserId(info.get("userId").toString());

    return userInfo;
  }
}
