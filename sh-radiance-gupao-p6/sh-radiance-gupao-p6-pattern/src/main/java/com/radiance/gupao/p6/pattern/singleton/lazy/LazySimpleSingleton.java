package com.radiance.gupao.p6.pattern.singleton.lazy;

/**
 * @author sunhao
 * @date 2020/11/3 13:27
 * @Description:
 */
// 懒汉式单例模式在外部需要使用的时候才进行实例化
public class LazySimpleSingleton {
    private LazySimpleSingleton() {}
    // 静态块，公共内存区域
    private static LazySimpleSingleton lazy = null;
    public static synchronized LazySimpleSingleton getInstance() {
        if (lazy == null) {
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }
}
