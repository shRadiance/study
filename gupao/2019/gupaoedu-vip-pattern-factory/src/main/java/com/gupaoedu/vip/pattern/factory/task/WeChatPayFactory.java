package com.gupaoedu.vip.pattern.factory.task;

/**
 * @author sunhao
 * @date Created in 2020-02-25 15:45
 * @description：
 */
public class WeChatPayFactory implements PaymentFactory {
    public Payment create() {
        return new WechatPay();
    }
}
