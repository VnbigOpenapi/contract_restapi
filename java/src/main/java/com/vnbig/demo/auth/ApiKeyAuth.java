package com.vnbig.demo.auth;

import com.vnbig.demo.util.CfgPropertiesUtil;
import com.vnbig.demo.util.MD5Util;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @ClassName ApiKeyAuth
 * @Description 获取apikey
 * @Author jiangyunpeng
 * @Date 2018/12/27 12:01
 * @Version 1.0
 */
public class ApiKeyAuth {
    private static final String SIGN = "sign";
    private static final String SECRET_KEY = "secret_key";
    private static final String SECRETKEY = CfgPropertiesUtil.get("secretKey");

    /**
     * 生成签名并
     * @param paramsStr 排序过的参数
     * @return 排序过的参数+sign
     */
    public static String generateSign(StringBuffer paramsStr){
        String params = paramsStr.toString();
        // 生成sign
        paramsStr.append("&").append(SECRET_KEY).append("=").append(SECRETKEY);
        String sign = MD5Util.getMD5String(paramsStr.toString());
        return params+"&sign="+sign; // 拼接到请求参数
    }

    /**
     * 请求参数排序
     * @param parameterMap
     * @return
     */
    public static StringBuffer generateParam(Map<String, String[]> parameterMap){
        Map<String, String[]> params = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        params.putAll(parameterMap);
        StringBuffer paramsStr = new StringBuffer();
        boolean isFirst = true;
        for (Map.Entry<String, String[]> entrySet: params.entrySet()) {
            String key = entrySet.getKey();
            String[] values = entrySet.getValue();
            if (values != null && values.length > 0 && !SIGN.equalsIgnoreCase(key)) {
                if (!isFirst) {
                    paramsStr.append("&");
                }
                isFirst = false;
                paramsStr.append(key).append("=").append(values[0]);
            }
        }
        return paramsStr;
    }
}
