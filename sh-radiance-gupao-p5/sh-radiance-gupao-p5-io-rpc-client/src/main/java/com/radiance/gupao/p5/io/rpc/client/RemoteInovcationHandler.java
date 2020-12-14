package com.radiance.gupao.p5.io.rpc.client;

import com.radiance.gupao.p5.io.rpc.server.api.RpcRequest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.net.Socket;

/**
 * @author sunhao
 * @date 2020/9/29 0:31
 * @Description:
 */
public class RemoteInovcationHandler implements InvocationHandler {

    private String host;
    private int port;

    public RemoteInovcationHandler(String host, int port) {
        this.host = host;
        this.port = port;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("触发了调用的代码");
        RpcRequest request = new RpcRequest();
        request.setClassName(method.getDeclaringClass().getName());
        request.setMethodName(method.getName());
        request.setParameters(args);
        request.setTypes(method.getParameterTypes());
        RpcNetTransport rpcNetTransport = new RpcNetTransport(host, port);
        Object result = rpcNetTransport.sent(request);
        return result;
    }
}
