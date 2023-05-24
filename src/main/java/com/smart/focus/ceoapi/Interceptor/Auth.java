package com.smart.focus.ceoapi.Interceptor;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.smart.focus.ceoapi.common.CommonLib;
import com.smart.focus.ceoapi.common.ConstDef;
import com.smart.focus.ceoapi.common.Log;
import com.smart.focus.ceoapi.common.NetwokAuthenticatonException;
import com.smart.focus.ceoapi.common.PacketResult;
import com.smart.focus.ceoapi.common.UnauthorizedException;
import com.smart.focus.ceoapi.domain.UserDO;
import com.smart.focus.ceoapi.service.JwtService;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;

@Repository("authManager")
public class Auth {
	@Autowired
	private JwtService jwtService;

	public UserDO getLoginUser() {
		return null;
	}

	public int cheakAuth(HttpServletRequest req, short apiLevel) {
		// Log.Debug("PreAuth Session
		// id=%s",RequestContextHolder.getRequestAttributes().getSessionId());
		String data = req.getHeader("Authorization");
		// Log.Debug(data);
		int result = PacketResult.SUCCESS;

		if (data == null) {
			throw new UnauthorizedException();
		}
		return result;
	}

	public int cheakAuth(int apiLevel) {
		ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
		String data = attr.getRequest().getHeader("Authorization");
		// Log.Debug(data);

		int result = PacketResult.SUCCESS;
		String token = null;
		if (data == null || data.startsWith("Bearer") == false) {
			if (attr.getRequest().getSession().getAttribute(ConstDef.SESSION_USER_INFO) == null) {
				throw new UnauthorizedException();
			} else {
				return result;
			}
		} else {
			token = data.split(" ")[1];
			Log.Debug("usingToken = %s",token);
		}
		try {
			Map<String, Object> info = jwtService.getInfo(token);
			// Log.Debug(this.getClass(), info.toString());
			// Log.Debug(this.getClass(),
			// CommonLib.timestampToFormat(Long.parseLong(info.get("exp").toString()),
			// "yyyy-MM-dd HH:mm:ss"));
			// attr.getRequest().getSession().setAttribute(ConstDef.MEDIA_SESSION, ConstDef.MEDIA_SESSION);
			// Log.Trace(info.toString());
		} catch (ExpiredJwtException ex) {
			Log.Debug(ex.toString());
			throw new NetwokAuthenticatonException();
			// Claims tokenInfo = ex.getClaims();
			// Long exp = tokenInfo.getExpiration().getTime();
			// Long current = System.currentTimeMillis();
			// if ((current - exp) < ConstDef.TOKEN_AUTO_REFRESH_TIME) { // 1시간 이내이면 토큰 재발급
			// throw new NetwokAuthenticatonException();
			// } else {
			// throw new UnauthorizedException();
			// }
		} catch (Exception e) {
			Log.Error(e.getMessage());
			throw new UnauthorizedException();
		}

		return result;
	}
	
	public int checkRefreshToken() {
		ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
		String data = attr.getRequest().getHeader("Authorization");
		// Log.Debug(data);

		int result = PacketResult.SUCCESS;
		String token = null;
		if (data == null || data.startsWith("Bearer") == false) {
			if (attr.getRequest().getSession().getAttribute(ConstDef.MEDIA_SESSION) == null) {
				throw new UnauthorizedException();
			} else {
				return result;
			}
		} else {
			token = data.split(" ")[1];
			Log.Debug("refreshToken = %s", token);
		}
		try {
			Map<String, Object> info = jwtService.getInfo(token);
			Log.Trace(this.getClass(),"rgreshToken ok=%s",info.toString());
		} catch (ExpiredJwtException ex) {
			Log.Debug(ex.toString());
			Claims tokenInfo = ex.getClaims();
			Long exp = tokenInfo.getExpiration().getTime();
			
			Log.Debug(this.getClass(), "refreshTocken Expired=%s", CommonLib.timestampToFormat(exp, "yyyy-MM-dd HH:mm:ss"));
			throw new UnauthorizedException();
		} catch (Exception e) {
			Log.Error(e.getMessage());
			throw new UnauthorizedException();
		}

		return result;
	}

}
