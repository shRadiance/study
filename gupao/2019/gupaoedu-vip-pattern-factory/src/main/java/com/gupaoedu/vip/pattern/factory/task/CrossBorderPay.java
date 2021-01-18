package com.gupaoedu.vip.pattern.factory.task;

/**
 * @author sunhao
 * @date Created in 2020-02-25 15:50
 * @description：
 */
public class CrossBorderPay implements Payment {
    public void pay() {
        System.out.println("跨境支付！");
    }
}
