package com.gupaoedu.vip.pattern.factory.task;

/**
 * @author sunhao
 * @date Created in 2020-02-25 15:54
 * @description：
 */



public class PaymentTest {
    public static void main(String[] args) throws Exception {
        PaymentFactory factory = new AliPayFactory();
        Payment payment = factory.create();
        payment.pay();
        throw new Exception();
    }
}
