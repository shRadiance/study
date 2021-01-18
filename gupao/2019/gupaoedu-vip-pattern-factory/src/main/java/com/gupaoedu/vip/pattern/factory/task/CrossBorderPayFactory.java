package com.gupaoedu.vip.pattern.factory.task;

/**
 * @author sunhao
 * @date Created in 2020-02-25 15:47
 * @description：
 */
public class CrossBorderPayFactory implements PaymentFactory {
    public Payment create() {
        return new CrossBorderPay();
    }
}
