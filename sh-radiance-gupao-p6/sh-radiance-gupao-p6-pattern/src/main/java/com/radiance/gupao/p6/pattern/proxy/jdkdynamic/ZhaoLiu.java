package com.radiance.gupao.p6.pattern.proxy.jdkdynamic;

import com.radiance.gupao.p6.pattern.proxy.staticproxy.IPerson;

/**
 * @author sunhao
 * @date 2020/11/11 18:09
 * @Description:
 */
public class ZhaoLiu implements IPerson {
    @Override
    public void findLove() {
        System.out.println("赵六要求：有车有房学历高");
    }
    public void buyInsrue() {

    }
}
