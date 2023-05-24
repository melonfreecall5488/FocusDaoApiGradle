package com.smart.focus.ceoapi.common;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NETWORK_AUTHENTICATION_REQUIRED)
public class NetwokAuthenticatonException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NetwokAuthenticatonException() {
		super();
	}

	public NetwokAuthenticatonException(String message) {
		super(message);
	}

	public NetwokAuthenticatonException(Throwable cause) {
		super(cause);
	}

	public NetwokAuthenticatonException(String message, Throwable cause) {
		super(message, cause);
	}

}
