package com.radiance.gupao.p6.pattern.decorator.eg;

/**
 * @author sunhao
 * @date 2020/11/17 14:43
 * @Description:
 */
public class BattercakeWithEggAndSausage extends BattercakeWithEgg {
    @Override
    protected String getMsg() {
        return super.getMsg() + "+1香肠";
    }
    // 加一个香肠加2块钱
    @Override
    public int getPrice() {
        return super.getPrice() + 2;
    }
}
