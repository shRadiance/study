package com.radiance.gupao.p6.pattern.singleton.register;

import java.io.ObjectInputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author sunhao
 * @date 2020/11/3 20:37
 * @Description:
 */
public class ContainerSingleton {
    private ContainerSingleton() {}
    private static Map<String, Object> ioc = new ConcurrentHashMap<>();
    public static Object getBean(String className) {
        synchronized (ioc) {
           if (!ioc.containsKey(className)) {
               Object obj = null;
               try {
                   obj = Class.forName(className).newInstance();
                   ioc.put(className, obj);
               } catch (Exception e) {
                   e.printStackTrace();
               }
               return obj;
           } else {
               return ioc.get(className);
           }
        }
    }
}
