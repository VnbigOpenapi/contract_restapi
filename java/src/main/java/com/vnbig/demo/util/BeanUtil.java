package com.vnbig.demo.util;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName BeanUtil
 * @Description TODO
 * @Author jiangyunpeng
 * @Date 2018/12/27 15:37
 * @Version 1.0
 */
public class BeanUtil {
    /**
     * bean to map
     * @param obj
     * @return
     */
    public static Map<String, String[]> transBean2Map(Object obj) {
        if(obj == null){
            return null;
        }
        Map<String, String[]> map = new HashMap<String, String[]>();
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor property : propertyDescriptors) {
                String key = property.getName();
                // 过滤class属性
                if (!key.equals("class")) {
                    // 得到property对应的getter方法
                    Method getter = property.getReadMethod();
                    Object value = getter.invoke(obj);
                    String values[] = null;
                    if (null != value) {
                        if (value instanceof String[]) {
                            values = (String[]) value;
                        } else {
                            values = new String[]{value.toString()};
                        }
                        map.put(key, values);
                    }
                }

            }
        } catch (Exception e) {
            System.out.println("transBean2Map Error " + e);
        }
        return map;
    }
}
