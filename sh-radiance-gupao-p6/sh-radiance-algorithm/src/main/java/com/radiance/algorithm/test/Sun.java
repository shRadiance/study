package com.radiance.algorithm.test;

/**
 * @author sunhao
 * @date 2021/1/5 14:15
 * @Description:
 */
public class Sun {

    private String name;

//    private void init() {
//        System.out.println("Sun init method!");
//    }
//
//    private void destory() {
//        System.out.println("Sun destory method!");
//    }
    public static void main(String[] args) {
//        Thread
        String s1 = new String("Java");
        String s2 = s1.intern();
        String s3 = "Java";
        System.out.println(s1 == s2); // false
        System.out.println(s2 == s3); // true
        System.out.println("---------");
        ITest iTest = new ITestImpl();
        iTest.a();
        System.out.println("---------");
        ITestImpl iTest1 = new ITestImpl();
        iTest1.a();
        iTest1.b();

    }

}
