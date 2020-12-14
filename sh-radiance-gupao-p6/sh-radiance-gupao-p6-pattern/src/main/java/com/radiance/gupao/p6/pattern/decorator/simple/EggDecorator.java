package com.radiance.gupao.p6.pattern.decorator.simple;

/**
 * @author sunhao
 * @date 2020/11/17 15:14
 * @Description:
 */
public class EggDecorator extends BattercakeDecotator {
    public EggDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "+1个鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 1;
    }
}
