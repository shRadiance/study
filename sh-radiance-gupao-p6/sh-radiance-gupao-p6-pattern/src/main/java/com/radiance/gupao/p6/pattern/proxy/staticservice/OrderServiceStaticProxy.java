package com.radiance.gupao.p6.pattern.proxy.staticservice;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author sunhao
 * @date 2020/11/12 11:02
 * @Description:
 */
public class OrderServiceStaticProxy implements IOrderService {

    private SimpleDateFormat year = new SimpleDateFormat("yyyy");

    private IOrderService orderService;
    public OrderServiceStaticProxy(IOrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public int createOrder(Order order) {
        before();
        Long time = order.getCreateTime();
        Integer dbRouter = Integer.valueOf(year.format(new Date(time)));
        System.out.println("静态代理类自动分配到【DB_" + dbRouter + "】");
        DynamicDataSourceEntry.set(dbRouter);
        orderService.createOrder(order);
        after();
        return 0;
    }

    private void before() {
        System.out.println("Proxy before method.");
    }

    private void after() {
        System.out.println("Proxy after method.");
    }
}