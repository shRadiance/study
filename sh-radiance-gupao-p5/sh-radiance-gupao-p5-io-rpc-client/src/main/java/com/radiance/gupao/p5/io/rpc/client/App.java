package com.radiance.gupao.p5.io.rpc.client;

import com.radiance.gupao.p5.io.rpc.server.api.IHelloService;
import org.springframework.context.annotation.Conditional;

/**
 * @author sunhao
 * @date 2020/9/28 23:57
 * @Description:
 */
public class App {

    public static void main(String[] args) {
        RpcProxyClient client = new RpcProxyClient();

        IHelloService iHelloService = client.clientProxy(IHelloService.class, "localhost", 8888);
        String content = iHelloService.sayHello("Sunhao"); //类似调用本地方法
        System.out.println(content);
        System.out.println("client 动态代理端");
    }

}
