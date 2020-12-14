package com.radiance.gupao.p6.pattern.singleton.register;

import java.lang.reflect.Constructor;

/**
 * @author sunhao
 * @date 2020/11/3 20:19
 * @Description:
 */
public class EnumSingletonTest2 {
    public static void main(String[] args) {
        try {
            Class clazz = EnumSingleton.class;
            Constructor c = clazz.getDeclaredConstructor();
            c.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
