package com.smart.focus.ceoapi.Interceptor;

import java.lang.reflect.Method;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthAspect {
	@Resource(name = "authManager")
	Auth authManager;

	// @PreAuth가 있는 지점을 pointcut으로 지정
	/*
	 * @Pointcut("execution(* com.nscnc.controller.*.*(..))")
	 * public void pointcut() { }
	 */

	@Pointcut("@annotation(com.smart.focus.ceoapi.Interceptor.PreAuth)")
	public void pointcut() {
	}

	// pointcut 한 부분 이전에, 인증 수행(joinpoint)
	@Before("pointcut()")
	public void beforeTargetMethod(JoinPoint joinPoint) {

		// Log.Debug("PreAuth Call Controller =
		// %s",joinPoint.getSignature().getDeclaringType());

		for (Object obj : joinPoint.getArgs()) {
			if (obj instanceof HttpServletRequest) {
				// HttpServletRequest request = (HttpServletRequest) obj;
				// Log.Debug("In Aspect Session id=%s",request.getSession().getId());
				break;

			}
		}
		hasAuth(joinPoint);
	}

	@SuppressWarnings("static-access")
	private void hasAuth(JoinPoint joinPoint) {

		int level = getAnnotation(joinPoint);
		if (level >= 0)
			authManager.cheakAuth(level); // 위에서 받아온 값을 넘긴다.

	}

	public int getAnnotation(JoinPoint joinPoint) {
		int level = -1;
		String called = joinPoint.getSignature().getName();
		Method[] methos = joinPoint.getSignature().getDeclaringType().getMethods();
		for (Method method : methos) {
			if (method.getName().equals(called)) {
				// GreetingAnnotation 객체를 얻는다.
				PreAuth preAuthAnnotation = method.getAnnotation(PreAuth.class);
				level = preAuthAnnotation.LEVEL();
				break;

			}
		}
		return level;
	}
}
