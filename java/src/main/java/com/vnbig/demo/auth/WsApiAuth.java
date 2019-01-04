package com.vnbig.demo.auth;

import com.vnbig.demo.util.CfgPropertiesUtil;
import com.vnbig.demo.util.MD5Util;

/**
 * @ClassName WsApiAuth
 * @Description TODO
 * @Author jiangyunpeng
 * @Date 2018/12/27 17:50
 * @Version 1.0
 */
public class WsApiAuth {

    public static String getWsSign(){
        String apiKey = CfgPropertiesUtil.get("apiKey");
        String secretKey = CfgPropertiesUtil.get("secretKey");
        String signStr = secretKey+"&"+apiKey;
        return MD5Util.getMD5String(signStr.toUpperCase());
    }

}
