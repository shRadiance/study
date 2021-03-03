package com.radiance.gupao.p6.pattern;

/**
 * @author sunhao
 * @date 2021/1/27 11:45
 * @Description:
 */
public class Test {

    static String aa = "0";

    public static void main(String[] args) {
        String result = tryTest();
        System.out.println("------------");
        System.out.println(result);
    }

    public static String tryTest() {
        int a11 = 1, b11 = 2;
        String a1 = "a1", a2 = "a2";
        System.out.println(b11 + a11);
        System.out.println(a1 + a2);
        String aaa = "0";
//        String aa = "0";
        try {
            System.out.println("try1");
            int a = 1/0;
            System.out.println("try2");
            aa = "1";
            return aa;
//            return "try";
        } catch (Exception e) {
            aa = "2";
            e.printStackTrace();
            System.out.println("catch");
            return aa;
//            return "catch";
        } finally {
            aa = "3";
            System.out.println("finally");
//            return aa;
//            return "finally";
        }
//        return "tryTest";
    }

}
