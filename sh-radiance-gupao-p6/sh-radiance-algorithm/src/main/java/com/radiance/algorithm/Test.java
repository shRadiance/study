package com.radiance.algorithm;

/**
 * @author sunhao
 * @date 2020/12/12 15:41
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Worker work = new Worker();
        System.out.println(work);
        Worker.printf(work);
        System.out.println(work.hashCode());
        System.out.println("test");
    }
}
