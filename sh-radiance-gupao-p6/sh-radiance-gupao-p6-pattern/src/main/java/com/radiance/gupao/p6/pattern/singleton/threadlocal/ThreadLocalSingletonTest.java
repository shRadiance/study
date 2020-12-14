package com.radiance.gupao.p6.pattern.singleton.threadlocal;

import com.radiance.gupao.p6.pattern.singleton.lazy.ExectorThread;

/**
 * @author sunhao
 * @date 2020/11/3 20:48
 * @Description:
 */
public class ThreadLocalSingletonTest {
    public static void main(String[] args) {
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
        System.out.println("End");
    }
}
