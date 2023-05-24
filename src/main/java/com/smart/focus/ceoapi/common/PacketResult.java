package com.smart.focus.ceoapi.common;

public class PacketResult {
    public static int SUCCESS = 0x01;

    public static int CONTINUE = 0x02;

    public static int COMPLETE = 0x03;

    /// <summary>
    /// 에러 (메시지 첨부)
    /// </summary>
    public static int ERR_MESSAGE = 0x10;

    /// <summary>
    /// 서버 에러
    /// </summary>
    public static int ERR_SERVER = 0x11;

    /// <summary>
    /// JSON 파싱 에러
    /// </summary>
    public static int ERR_JSON = 0x12;

    /// <summary>
    /// 사용자 없음
    /// </summary>
    public static int ERR_NOUSER = 0x16;

    /// <summary>
    /// 암호 틀림
    /// </summary>
    public static int ERR_PASSWORD = 0x17;

    /// <summary>
    /// 패킷 버전 다름
    /// </summary>
    public static int ERR_PACKETVER = 0x18;

    /// <summary>
    /// 세션ID 다름
    /// </summary>
    public static int ERR_SESSIONID = 0x19;

    /// <summary>
    /// 파라미터 에러
    /// </summary>
    public static int ERR_PARAMS = 0x21;
    public static int SAP_EXCEPTION = 0x22;
    public static int ERR_NETWOTK_RECONNECT = 0x98;
    public static int NETWOTK_RECONNECT = 0x99;
}
