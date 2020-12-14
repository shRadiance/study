package com.radiance.gupao.p6.pattern.decorator.eg;

/**
 * @author sunhao
 * @date 2020/11/17 14:47
 * @Description:
 */
public class BattercakeTest {
    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getMsg() + "，总价格：" + battercake.getPrice());
        Battercake battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getMsg() + "，总价格：" + battercakeWithEgg.getPrice());
        Battercake battercakeWithEggAndSausage = new BattercakeWithEggAndSausage();
        System.out.println(battercakeWithEggAndSausage.getMsg() + "，总价格：" + battercakeWithEggAndSausage.getPrice());
    }
}
