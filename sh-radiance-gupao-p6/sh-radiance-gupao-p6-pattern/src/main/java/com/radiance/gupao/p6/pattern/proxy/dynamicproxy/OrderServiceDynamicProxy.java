package com.radiance.gupao.p6.pattern.proxy.dynamicproxy;

import com.radiance.gupao.p6.pattern.proxy.staticservice.DynamicDataSourceEntry;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author sunhao
 * @date 2020/11/12 11:28
 * @Description:
 */
public class OrderServiceDynamicProxy implements InvocationHandler {
    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
    private Object target;

    public Object getInstance(Object target) {
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object object = method.invoke(target, args);
        after();
        return object;
    }

    private void before() {
        try {
            System.out.println("Proxy before method.");
            Long time = (Long) target.getClass().getMethod("getCerateTime").invoke(target);
            Integer dbRouter = Integer.valueOf(yearFormat.format(new Date(time)));
            System.out.println("静态代理类自动分配到【DB_" + dbRouter + "】数据源处理数据");
            DynamicDataSourceEntry.set(dbRouter);
        } catch (Exception e) {

        }
    }

    private void after() {
        System.out.println("Proxy after method.");
    }
}
