package com.gourdjyao.main.http.utils;

import java.util.HashMap;

public class ResultUtils {
    public static final String VERSION_STRING="v1.0.0";

    public static final HashMap<String,String> RESPONSE_MESSAGE_TYPE_MAP = new HashMap<String,String>();
    public static final HashMap<Integer,String> RESPONSE_MESSAGE_MAP = new HashMap<Integer,String>();

    static {
        RESPONSE_MESSAGE_TYPE_MAP.put("MSG_REGISTER_REQ","MSG_REGISTER_RSP");
        RESPONSE_MESSAGE_TYPE_MAP.put("MSG_LOGIN_REQ","MSG_LOGIN_RSP");

        RESPONSE_MESSAGE_MAP.put(ResultCodeUtils.SUCCESS_CODE_INT,"success");

        RESPONSE_MESSAGE_MAP.put(ResultCodeUtils.REGISTER_FAILED_CODE_INT,"failed");

        RESPONSE_MESSAGE_MAP.put(ResultCodeUtils.LOGIN_FAILED_CODE_INT,"failed");

    }

}
