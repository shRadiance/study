package com.radiance.gupao.p6.pattern.proxy.staticproxy;

/**
 * @author sunhao
 * @date 2020/11/11 17:30
 * @Description:
 */
public class ZhangSan implements IPerson {
    @Override
    public void findLove() {
        System.out.println("张三要求：肤白貌美大长腿");
    }
}
