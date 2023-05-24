package com.smart.focus.ceoapi.Interceptor;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.smart.focus.ceoapi.common.ConstDef;
import com.smart.focus.ceoapi.common.Log;

@Configuration
public class HttpSessionCheckingListener {
    @Bean // bean for http session listener
    public HttpSessionListener httpSessionListener() {
        return new HttpSessionListener() {
            @Override
            public void sessionCreated(HttpSessionEvent se) { // This method will be called when session created
                Log.Debug("Session Created with session id = %s", se.getSession().getId());
                se.getSession().setMaxInactiveInterval((int) (ConstDef.TOKEN_REFRESH_TIME*2 / 1000));
            }

            @Override
            public void sessionDestroyed(HttpSessionEvent se) { // This method will be automatically called when session
                                                                // destroyed
                Log.Debug("Session Destroyed, Session id= %s:", se.getSession().getId());
            }
        };
    }
}
