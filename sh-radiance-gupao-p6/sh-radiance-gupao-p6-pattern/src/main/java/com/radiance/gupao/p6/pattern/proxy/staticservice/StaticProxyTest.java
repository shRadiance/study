package com.radiance.gupao.p6.pattern.proxy.staticservice;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author sunhao
 * @date 2020/11/12 11:13
 * @Description:
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        try {
            Order order = new Order();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date date = sdf.parse("2017/02/01");
            order.setCreateTime(date.getTime());

            IOrderService orderService = new OrderServiceStaticProxy(new OrderService());
            orderService.createOrder(order);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
