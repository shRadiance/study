package com.radiance.gupao.p6.pattern.singleton.hungry;

/**
 * @author sunhao
 * @date 2020/11/3 11:57
 * @Description:
 */
public class HungryStaticSingleton {
    private static final HungryStaticSingleton hungrySingleton;
    static {
        hungrySingleton = new HungryStaticSingleton();
    }
    private HungryStaticSingleton() {}
    public static HungryStaticSingleton getInstance() {
        return hungrySingleton;
    }
}
