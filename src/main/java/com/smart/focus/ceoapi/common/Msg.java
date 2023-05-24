package com.smart.focus.ceoapi.common;

public class Msg {

    final public static String LOGIN_FAIL = "로그인 정보가 맞지 않습니다.";
    final public static String SYSTEM_FAIL = "시스템 이상 잠시후 다시 이용해 주세요.";
    final public static String NETWORK_FAIL = "Network 이상 잠시후 다시 이용해 주세요.";
    final public static String DUPLICATE_LOGIN = "타시스템에서 동일한 아이디로 로그인이 되어 강제 로그아웃 됩니다.";
    final public static String RSA_KEY_CREATE_FAIL = "RSA Key생성 실패 잠시후 다시 시도 하세요.";
    final public static String UPLOAD_FILE = "파일 저장 실패 하였습니다.";
    final public static String INSERT_ORDER_FAIL = "접수파일 등록 실패 하였습니다.";
    final public static String WRONG_FILE_TYPE = "파일포맷이 맞지 않습니다.";

    final public static Integer NO_LOGGING_WRONG = 1000;
    final public static Integer NO_NOT_LOGIN = 1001;
    final public static Integer NO_PERMISSION = 1002;
    final public static Integer NO_NETWORK_FAIL = 1003;
    final public static Integer NO_FILE_UPLOAD_FAIL = 1004;
    final public static Integer NO_DUPLICATE_FAIL = 1005;
    final public static Integer NO_NOT_FOUND = 1006;
    final public static Integer NO_DUPLICATE_PHONE_FAIL = 1007;
    final public static Integer NO_SYSTEM_FAIL = 1008;
    final public static Integer NO_DUPLICATE_LOGIN = 1009;
    final public static Integer NO_RSA_KEY_CREATE_FAIL = 1010;
    final public static Integer NO_UPLOAD_FILE = 1011;
    final public static Integer NO_COMMON_FAIL = 1012;

}
