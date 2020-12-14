package com.radiance.gupao.p5.reflect;

/**
 * @author sunhao
 * @date 2020/11/4 23:40
 * @Description:
 */
public class BallMain {
    /**
     * 通过传入的key获取对应的 Ball对象
     * @return
     */
    public static Ball getInstanceByKey(String key) {
        if ("basket".equals(key)) {
            return new BasketBall();
        }
        if ("football".equals(key)) {
            return new Football();
        }
        return null;
    }

    /**
     * 通过反射来动态获取对象
     * @param key
     * @return
     */
    public static Ball getInstanceReflectByKey(String key) {
        String basePackage = "com.radiance.gupao.p5.reflect";
        Ball ball = null;
        try {
            Class clazz = Class.forName(basePackage + "." + key); // 类型的全路径
            ball =  (Ball) clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ball;
    }

    public static void main(String[] args) {
//        System.out.println(getInstanceByKey("basket"));
        System.out.println(getInstanceReflectByKey("Football"));
    }
}
