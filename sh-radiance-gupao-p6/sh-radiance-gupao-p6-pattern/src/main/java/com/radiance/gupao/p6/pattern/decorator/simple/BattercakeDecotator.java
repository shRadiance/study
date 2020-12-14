package com.radiance.gupao.p6.pattern.decorator.simple;

/**
 * @author sunhao
 * @date 2020/11/17 15:08
 * @Description:
 */
public abstract class BattercakeDecotator extends Battercake {
    // 静态代理，委派
    private Battercake battercake;

    public BattercakeDecotator(Battercake battercake) {
        this.battercake = battercake;
    }
    protected abstract void doSomething();

    @Override
    protected String getMsg() {
        return this.battercake.getMsg();
    }

    @Override
    protected int getPrice() {
        return this.battercake.getPrice();
    }
}
