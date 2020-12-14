package com.radiance.gupao.p6.pattern.facade.service;

/**
 * @author sunhao
 * @date 2020/11/17 13:54
 * @Description:
 */
public class PaymentService {
    public boolean pay(GiftInfo pointsGift) {
        // 扣减积分
        System.out.println("支付" + pointsGift.getName() + "积分成功");
        return true;
    }
}
