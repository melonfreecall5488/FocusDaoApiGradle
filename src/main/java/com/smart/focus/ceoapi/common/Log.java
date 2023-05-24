package com.smart.focus.ceoapi.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log {

	private static String log_tag = "Trace,Debug,Error";
	public static Logger logger = LoggerFactory.getLogger(Log.class);

	public static void Debug(String msg) {
		if (log_tag.indexOf("Debug") >= 0) {
			logger.debug(msg);
		}
	}

	public static void Error(String msg) {
		if (log_tag.indexOf("Error") >= 0) {
			logger.error(msg);
		}
	}

	public static void Trace(String msg) {
		if (log_tag.indexOf("Trace") >= 0) {
			logger.trace(msg);
		}
	}

	public static void Debug(Class<?> cName, String arg0, Object... msg) {
		if (log_tag.indexOf("Debug") >= 0) {
			String format = String.format(arg0, msg);
			logger.debug("[" + cName.getSimpleName() + "] : " + format);
		}
	}

	public static void Error(Class<?> cName, String arg0, Object... msg) {
		if (log_tag.indexOf("Debug") >= 0) {
			String format = String.format(arg0, msg);
			logger.error("[" + cName.getSimpleName() + "] : " + format);
		}
	}

	public static void Trace(Class<?> cName, String arg0, Object... msg) {
		if (log_tag.indexOf("Debug") >= 0) {
			String format = String.format(arg0, msg);
			logger.trace("[" + cName.getSimpleName() + "] : " + format);
		}
	}

	public static void Debug(String arg0, Object... msg) {
		if (log_tag.indexOf("Debug") >= 0) {
			String format = String.format(arg0, msg);
			logger.debug(format);
		}
	}

	public static void Error(String arg0, Object... msg) {
		if (log_tag.indexOf("Error") >= 0) {
			String format = String.format(arg0, msg);
			logger.error(format);
		}
	}

	public static void Trace(String arg0, Object... msg) {
		if (log_tag.indexOf("Trace") >= 0) {
			String format = String.format(arg0, msg);
			logger.trace(format);
		}
	}

}
