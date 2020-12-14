package com.radiance.gupao.p6.pattern.singleton.lazy;

/**
 * @author sunhao
 * @date 2020/11/3 16:32
 * @Description:
 */
// 这种形式兼顾饿汉式单例模式的内存浪费问题和 synchronized 的性能问题
// 完美地屏蔽了这两个缺点
public class LazyInnerClassSingleton {
    // 使用 LazyInnerClassGeneral 的时候，默认会先初始化内部类
    // 如果没使用，则内部类是不加载的
    private LazyInnerClassSingleton() {}

    // 每一个关键字都不是多余的，static是为了使单例模式的空间共享，保证这个方法不会被重写、重载
    public static final LazyInnerClassSingleton getInstance() {
        // 在返回结果以前，一定会先加载内部类
        return LazyHolder.LAZY;
    }

    // 默认不加载
    private static class LazyHolder {
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}
