package com.radiance.gupao.p6.pattern.facade.service;

/**
 * @author sunhao
 * @date 2020/11/17 13:59
 * @Description:
 */
public class ShippingService {
    // 发货
    public String delivery(GiftInfo giftInfo) {
        // 物流系统的对接逻辑
        System.out.println(giftInfo.getName() + "进入物流系统");
        String shippingOrderNo = "666";
        return shippingOrderNo;
    }
}
