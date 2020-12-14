package com.radiance.gupao.p6.pattern.proxy.simple;

/**
 * @author sunhao
 * @date 2020/11/11 17:22
 * @Description:
 */
public class ProxyTest {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();
    }
}
