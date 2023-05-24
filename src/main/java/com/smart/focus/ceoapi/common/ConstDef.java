package com.smart.focus.ceoapi.common;

public class ConstDef {
    // test 시 remark 변경할것
    // test bed
    final public static boolean TEST_BED = true;
    // 상용장비
    // final public static boolean TEST_BED = false;

    public static String DATA_BASE = "FOCUS";
    public static String DATA_TEST_BASE = "FOCUS";
    final public static String SERVICE_HOST_NAME = "dev-mes";
    // result code
    final public static Integer SUCCESS = 1;
    final public static Integer FAIL = -1;
    final public static Integer SYSTEM_ERROR = -2;
    final public static Integer DATABASE_ERROR = -3;
    final public static Integer NETWORK_ERROR = -4;
    final public static Integer WRONG_FILE = -5;
    final public static Integer NOT_FOUND_BRANCH_NAME = -6;
    final public static Integer ERROR_USER_DEFINE_MSG = -7;
    final public static Integer NOT_FOUND_DRIVER_INFO = -8;
    final public static Integer POPUP_ERROR_MSG = -9;
    final public static Integer IGNORE = -10;

    // database
    public static String LAST_ERROR_MSG = "";

    final public static Integer PACKET_HEADER_LENGTH = 16;

    final public static String WEEK_PLAN_KEY = "WEEK_PLAN";

    // session key
    final public static String SESSION_CLIENT_IP = "CLIENT_IP";
    final public static String SESSION_USER_INFO = "USER_INFO";
    final public static String MEDIA_SESSION = "MEDIA_SESSION";
    // token
    final public static long TOKEN_EXPIRED_TIME = 1000L * 30 * 60;
    // final public static long TOKEN_EXPIRED_TIME = 1000L * 10;
    final public static long TOKEN_REFRESH_TIME = 1000L * 120 * 60;
    // final public static long TOKEN_AUTO_REFRESH_TIME = 1000L * 300 * 60;

    // FILE_SAVE_PATH
    final public static Boolean SAVE_ROOT_OUT = true;
    final public static String DOWN_URL_PREFIX = "/imgLoad";
    final public static String IMAGE_FILE_EXT = "jpg,jpeg,png,gif";
    final public static long IMG_RESIZE_MAX = 1048576;
    // FILE_PATH
    final public static String WEB_ROOT = "webapp";
    final public static String WEB_PAGE_PATH = "WAS_SERVER/HiSFS";
    final public static String CONTENT_PATH = "/Users/home/HiSFS";
    final public static String TEMP_FILE_PATH = "/upload/temp";
    final public static String PHOTO_PATH = "/content/photo";
    // 기초코드
    final public static String PURCHASE_CODE = "S0106";
    final public static String PROCESSED_CODE = "S0104";
    final public static String ASSY_CODE = "S0102";
    final public static String PRODUCT_CODE = "S0100";

    // SYSTEM CONFIG FILE PATH
    final public static String PARAM_FILE_PATH = "/Users/home/pcrm/config.cfg";
    final public static String PARAM_FILE_PATH_WIN = "c:\\mes_config\\config.cfg";

    // PICKINT TYPE
    final public static String POST_PICK = "01";
    final public static String GEN_PICK = "02";
    final public static String STORE_PICK = "03";
    final public static String OTEHERS_PICK = "04";
    
    
    // SET 상품구성/해체
    final public static int SET_PICKING = 102;
    final public static int SET_INPUT = 103;
    final public static int UNSET_PICKING = 104;
    final public static int UNSET_INPUT = 105;
    //기타출고/폐기
    final public static int OTHERS_OUT = 106;
    final public static int OTHERS_IN = 107;
    final public static int DISPOSAL = 6;

    // 입출고구분
    final public static int 상품출고 = 0; // 파레트 이동 시 사용
    final public static int 상품입고 = 1;
    final public static int 불량품출고 = 4;
    final public static int 불량품반품 = 5; // 재공창고로반품
    final public static int 상품출하 = 2;
    final public static int 상품반품 = 3;
    final public static int 폐기처리 = 6;
    final public static int 매장출고 = 8;

    //배송구분
    final public static String DLV_POST = "01";

    // Excel File Name
    final public static String PURCHASE_ORDER_FORM = "PURCHASE_ORDER_FORM";

}
