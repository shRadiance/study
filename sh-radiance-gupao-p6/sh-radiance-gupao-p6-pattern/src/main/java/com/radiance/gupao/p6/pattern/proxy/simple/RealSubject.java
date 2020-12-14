package com.radiance.gupao.p6.pattern.proxy.simple;

/**
 * @author sunhao
 * @date 2020/11/7 19:17
 * @Description:
 */
public class RealSubject implements ISubject {
    @Override
    public void request() {
        System.out.println("real service is called");
    }
}
