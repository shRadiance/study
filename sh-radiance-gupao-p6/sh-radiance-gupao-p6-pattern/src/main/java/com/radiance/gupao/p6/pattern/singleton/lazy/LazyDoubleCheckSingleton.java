package com.radiance.gupao.p6.pattern.singleton.lazy;

import com.sun.org.apache.xpath.internal.objects.XNull;

/**
 * @author sunhao
 * @date 2020/11/3 14:51
 * @Description:
 */
public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton lazy = null;

    private LazyDoubleCheckSingleton() {}
    public static LazyDoubleCheckSingleton getInstance() {
        if (lazy == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazy == null) {
                    lazy = new LazyDoubleCheckSingleton();
                    // 1.分配内存给这个对象
                    // 2.初始化对象
                    // 3.设置lazy指向刚分配的内存地址
                }
            }
        }
        return lazy;
    }
}
