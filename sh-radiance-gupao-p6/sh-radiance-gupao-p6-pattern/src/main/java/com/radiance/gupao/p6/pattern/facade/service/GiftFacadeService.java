package com.radiance.gupao.p6.pattern.facade.service;

/**
 * @author sunhao
 * @date 2020/11/17 14:02
 * @Description:
 */
public class GiftFacadeService {
    private QualifyService qualifyService = new QualifyService();
    private PaymentService pointPaymentService = new PaymentService();
    private ShippingService shippingService = new ShippingService();

    // 兑换
    public void exchange(GiftInfo giftInfo) {
        if (qualifyService.isAvailable(giftInfo)) {
            // 资格校验通过
            if (pointPaymentService.pay(giftInfo)) {
                // 如果支付成功
                String shippingOrderNo = shippingService.delivery(giftInfo);
                System.out.println("物流系统下单成功，订单号是：" + shippingOrderNo);
            }
        }
    }

    public static void main(String[] args) {
        GiftInfo giftInfo = new GiftInfo("《Spring 5核心原理》");
        GiftFacadeService giftFacadeService = new GiftFacadeService();
        giftFacadeService.exchange(giftInfo);
    }
}
