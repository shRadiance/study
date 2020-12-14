package com.radiance.gupao.p6.pattern.facade.service;

/**
 * @author sunhao
 * @date 2020/11/17 13:53
 * @Description:
 */
public class QualifyService {
    public boolean isAvailable(GiftInfo giftInfo) {
        System.out.println("校验" + giftInfo.getName() + "积分资格通过，库存通过");
        return true;
    }
}
