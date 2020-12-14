package com.radiance.gupao.p5.io.rpc.client;

import java.lang.reflect.Proxy;

/**
 * @author sunhao
 * @date 2020/9/29 0:26
 * @Description:
 */
public class RpcProxyClient {

    public <T> T clientProxy(final Class<T> interfaceCls, final String host, final int port) {
        return (T) Proxy.newProxyInstance(interfaceCls.getClassLoader(),
                new Class<?>[]{interfaceCls}, new RemoteInovcationHandler(host, port));
    }

}
