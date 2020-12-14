package com.radiance.gupao.p6.pattern.proxy.staticservice;

/**
 * @author sunhao
 * @date 2020/11/12 10:07
 * @Description:
 */
public class OrderDao {
    public int insert(Order order) {
        System.out.println("OrderDao 创建 Order 成功！");
        return 1;
    }
}
