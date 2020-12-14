package com.radiance.gupao.p6.pattern.decorator.simple;

/**
 * @author sunhao
 * @date 2020/11/17 15:19
 * @Description:
 */
public class SausageDecorator extends BattercakeDecotator {
    public SausageDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "+1根香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }
}