package com.radiance.gupao.p6.pattern.proxy.dynamicproxy;

import com.radiance.gupao.p6.pattern.proxy.staticservice.IOrderService;
import com.radiance.gupao.p6.pattern.proxy.staticservice.Order;
import com.radiance.gupao.p6.pattern.proxy.staticservice.OrderService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author sunhao
 * @date 2020/11/12 11:39
 * @Description:
 */
public class OrderServiceDynamicProxyTest {
    public static void main(String[] args) {
        try {
            Order order = new Order();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date date = sdf.parse("2018/02/01");
            order.setCreateTime(date.getTime());

            IOrderService orderService = (IOrderService) new OrderServiceDynamicProxy().getInstance(new OrderService());
            orderService.createOrder(order);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
