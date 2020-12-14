package com.radiance.gupao.p6.pattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author sunhao
 * @date 2020/11/17 11:06
 * @Description:
 */
public class CglibMeipo implements MethodInterceptor {

    public Object getInstance(Class<?> clazz) throws Exception {
        Enhancer enhancer = new Enhancer();
        // 要把那个设置为即将生成的新类的父类
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        // 业务的增强
        before();
        Object obj = methodProxy.invokeSuper(o, objects);
        after();
        return null;
    }

    private void before() {
        System.out.println("我是媒婆：我要给你找对象，现在应确认你的需求");
        System.out.println("开始物色");
    }

    private void after() {
        System.out.println("如果合适的话，就准备办事");
    }
}
