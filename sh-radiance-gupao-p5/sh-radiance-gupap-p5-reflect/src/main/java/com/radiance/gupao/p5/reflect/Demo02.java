package com.radiance.gupao.p5.reflect;

/**
 * @author sunhao
 * @date 2020/11/4 23:56
 * @Description:
 */
public class Demo02 {
    public static void main(String[] args) {
        String key = "basket";
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
//            getInstanceByKey(key);
            getInstanceReflectByKey("BasketBall");
        }
        long end = System.currentTimeMillis();
        System.out.println("总计耗时：" + (end - start));
    }
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
}
