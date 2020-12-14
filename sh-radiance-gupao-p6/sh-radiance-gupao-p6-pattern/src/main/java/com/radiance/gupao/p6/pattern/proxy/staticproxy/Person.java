package com.radiance.gupao.p6.pattern.proxy.staticproxy;

/**
 * @author sunhao
 * @date 2020/11/12 11:58
 * @Description:
 */
public class Person implements IPerson {
    @Override
    public void findLove() {
        System.out.println("Person findlove method");
    }
}
