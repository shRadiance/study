package com.gupaoedu.vip.pattern.factory.task;

/**
 * @author sunhao
 * @date Created in 2020-02-25 15:48
 * @description：
 */
public class AliPay implements Payment {
    public void pay() {
        System.out.println("支付宝支付！");
    }
}
