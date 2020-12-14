package com.radiance.gupao.p6.pattern.singleton.hungry;

/**
 * @author sunhao
 * @date 2020/11/3 11:52
 * @Description:
 */
public class HungrySingleton {
    // 先静态、后动态
    // 先属性、后方法
    // 先下后上
    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {}

    private static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
