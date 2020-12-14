package com.radiance.gupao.p6.pattern.proxy.staticproxy;

/**
 * @author sunhao
 * @date 2020/11/11 17:34
 * @Description:
 */
public class ZhangLaosanTest {
    public static void main(String[] args) {
        ZhangLaosan zhangLaosan = new ZhangLaosan(new ZhangSan());
        zhangLaosan.findLove();
    }
}
