package com.radiance.gupao.p6.pattern.singleton.threadlocal;

/**
 * @author sunhao
 * @date 2020/11/3 20:45
 * @Description:
 */
public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
            new ThreadLocal<ThreadLocalSingleton>() {
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };
    private ThreadLocalSingleton() {}

    public static ThreadLocalSingleton getInstance() {
        return threadLocalInstance.get();
    }
}
