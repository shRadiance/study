package com.radiance.gupao.p6.pattern.singleton.lazy;

/**
 * @author sunhao
 * @date 2020/11/3 17:02
 * @Description:
 */
// 自认为史上最牛逼的单例模式的实现方式
public class LazyInnerClassSingleton2 {
    // 使用 LazyInnerClassGeneral 的时候，默认会先初始化内部类
    // 如果没使用，则内部类是不加载的
    private LazyInnerClassSingleton2() {
        if (LazyHolder.LAZY != null) {
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    // 每一个关键字都不是多余的，static是为了使单例的空间共享，保证这个方法不会被重写、重载
    public static final LazyInnerClassSingleton2 getInstance() {
        // 在返回结果以前，一定会先加载内部类
        return LazyHolder.LAZY;
    }

    //默认不加载
    private static class LazyHolder {
        private static final LazyInnerClassSingleton2 LAZY = new LazyInnerClassSingleton2();
    }
}
