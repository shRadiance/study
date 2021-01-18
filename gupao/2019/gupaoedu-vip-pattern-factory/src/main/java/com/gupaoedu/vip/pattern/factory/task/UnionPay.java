package com.gupaoedu.vip.pattern.factory.task;

/**
 * @author sunhao
 * @date Created in 2020-02-25 15:49
 * @description：
 */
public class UnionPay implements Payment {
    public void pay() {
        System.out.println("银联支付！");
    }
}
