package com.radiance.gupap.p6.springcloud.feign;

/**
 * @author sunhao
 * @date 2020/11/19 10:52
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        String a = "abc" + "bcd";
        String b = "aaa" + new String("bbb");
        String c = "a" + "b" + "c" + new String("c");
        String d = new StringBuilder("aa").append("bb").append("cc").toString();
        String e = "a";
        for (int i = 0; i < 10; i++) {
            e = e + i;
        }
    }
}
