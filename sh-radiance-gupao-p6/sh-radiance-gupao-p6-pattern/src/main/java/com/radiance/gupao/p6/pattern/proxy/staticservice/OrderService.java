package com.radiance.gupao.p6.pattern.proxy.staticservice;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * @author sunhao
 * @date 2020/11/12 10:12
 * @Description:
 */
public class OrderService implements IOrderService {
    private OrderDao orderDao;

    public OrderService() {
        // 如果是使用Spring应该是自动注入的
//        this.orderDao = orderDao;
        // 为了使用方便，我们直接在构造方法中将 orderDao 直接初始化
        orderDao = new OrderDao();
    }

    @Override
    public int createOrder(Order order) {
        System.out.println("OrderService 调用 orderDao 创建订单");
        return orderDao.insert(order);
    }
}
