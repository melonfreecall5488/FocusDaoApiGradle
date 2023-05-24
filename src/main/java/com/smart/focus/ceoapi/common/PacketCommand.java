package com.smart.focus.ceoapi.common;

public class PacketCommand {
	public static short CONNECT = 0x0000;
	public static short LOGOUT = 0x0001;
	public static short EXEC_PROC = 0x0011;
	public static short EXEC_PROC_STREAM = 0x0012;
	public static short EXEC_PROC_POI = 0x0021;
	public static short CONV_GEO_XY = 0x0022;
	public static short PROC_ALLOC = 0x0031;
	public static short PAY_CREDIT_CARD = 0x0101;
	public static short CANCEL_CREDIT_CARD = 0x0102;
	public static short CLOSE_FORCE = -4095;
}
