package com.vnbig.demo.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @ClassName CfgPropertiesUtil
 * @Description 属性文件获取
 * @Author jiangyunpeng
 * @Date 2018/12/27 13:25
 * @Version 1.0
 */
public class CfgPropertiesUtil {
    // 测试环境
    private static final String ENV = "uat";
//    private static final String ENV = "test";


    private static Properties prop = null;

    static {
        prop = new Properties();
        InputStream in = CfgPropertiesUtil.class.getResourceAsStream("/cfg-" + ENV + ".properties");
        try {
            prop.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //获取属性文件配置
    public static String get(String key){
        try {
            return prop.getProperty(key);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
