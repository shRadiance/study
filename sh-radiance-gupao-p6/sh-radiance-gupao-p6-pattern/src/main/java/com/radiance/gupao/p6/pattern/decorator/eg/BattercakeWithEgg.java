package com.radiance.gupao.p6.pattern.decorator.eg;

/**
 * @author sunhao
 * @date 2020/11/17 14:37
 * @Description:
 */
public class BattercakeWithEgg extends Battercake {
    @Override
    protected String getMsg() {
        return super.getMsg() + "+1个鸡蛋";
    }
    // 加一个鸡蛋加1块钱
    @Override
    public int getPrice() {
        return super.getPrice() + 1;
    }
}
