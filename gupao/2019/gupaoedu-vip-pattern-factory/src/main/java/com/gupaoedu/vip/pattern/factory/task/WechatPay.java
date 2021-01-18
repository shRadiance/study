package com.gupaoedu.vip.pattern.factory.task;

/**
 * @author sunhao
 * @date Created in 2020-02-25 15:47
 * @description：
 */
public class WechatPay implements Payment {
    public void pay() {
        System.out.println("微信支付！");
    }
}
