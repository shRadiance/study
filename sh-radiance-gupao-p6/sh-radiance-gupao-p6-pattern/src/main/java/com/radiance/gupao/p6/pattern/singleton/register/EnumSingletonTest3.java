package com.radiance.gupao.p6.pattern.singleton.register;

import java.lang.reflect.Constructor;

/**
 * @author sunhao
 * @date 2020/11/3 20:27
 * @Description:
 */
public class EnumSingletonTest3 {
    public static void main(String[] args) {
        try {
            Class clazz = EnumSingleton.class;
            Constructor c = clazz.getDeclaredConstructor(String.class, int.class);
            c.setAccessible(true);
            EnumSingleton enumSingleton = (EnumSingleton) c.newInstance("Radiance", 666);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
