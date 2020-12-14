package com.radiance.gupao.p6.pattern.singleton.lazy;

/**
 * @author sunhao
 * @date 2020/11/3 13:33
 * @Description:
 */
public class ExectorThread implements Runnable {
    @Override
    public void run() {
        LazySimpleSingleton singleton = LazySimpleSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + singleton);
    }
}
