package com.radiance.gupao.p6.elastic.job;

import java.io.File;

/**
 * @author sunhao
 * @date 2020/12/23 17:17
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        int a = 6;
        int b = 8;
        System.out.println(a);
        System.out.println(b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a);
        System.out.println(b);

        System.out.println(File.separator);

        System.out.println(String.format("a b c %s", "a"));
        System.out.println(String.format("%s 1 %s %s %d","a","b",2,3));

    }



}
