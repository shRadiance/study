package com.radiance.gupao.p6.pattern.proxy.staticproxy;

/**
 * @author sunhao
 * @date 2020/11/11 17:32
 * @Description:
 */
public class ZhangLaosan implements IPerson {
    private ZhangSan zhangsan;

    public ZhangLaosan(ZhangSan zhangsan) {
        this.zhangsan = zhangsan;
    }

    @Override
    public void findLove() {
        System.out.println("张老三开始物色");
        zhangsan.findLove();
        System.out.println("开始交往");
    }
}
