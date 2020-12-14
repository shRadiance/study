package com.radiance.gupao.p6.pattern.singleton.lazy;

/**
 * @author sunhao
 * @date 2020/11/3 13:34
 * @Description:
 */
public class LazySimpleSingletonTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
        System.out.println("End");
    }
}
