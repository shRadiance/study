package com.radiance.gupao.p6.pattern.decorator.simple;

/**
 * @author sunhao
 * @date 2020/11/17 15:05
 * @Description:
 */
public class BaseBattercake extends Battercake {
    @Override
    protected String getMsg() {
        return "煎饼";
    }
    @Override
    protected int getPrice() {
        return 5;
    }
}
