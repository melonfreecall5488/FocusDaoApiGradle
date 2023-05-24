package com.smart.focus.ceoapi.common;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

public class GeneralException {

	public static void exception(HttpServletResponse response, String message, int errCode) {
		try {
			response.sendError(errCode, message);
		} catch (IOException e) {
			Log.Error(e.getMessage());
		}
	}
}
