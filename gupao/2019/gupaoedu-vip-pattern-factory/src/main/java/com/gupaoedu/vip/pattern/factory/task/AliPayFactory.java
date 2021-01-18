package com.gupaoedu.vip.pattern.factory.task;

/**
 * @author sunhao
 * @date Created in 2020-02-25 15:46
 * @description：
 */
public class AliPayFactory implements PaymentFactory {
    public Payment create() {
        return new AliPay();
    }
}
