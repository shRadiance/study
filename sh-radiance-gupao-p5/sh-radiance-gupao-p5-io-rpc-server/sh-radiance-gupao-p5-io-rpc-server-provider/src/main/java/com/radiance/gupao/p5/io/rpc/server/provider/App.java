package com.radiance.gupao.p5.io.rpc.server.provider;

import com.radiance.gupao.p5.io.rpc.server.api.IHelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author sunhao
 * @date 2020/9/28 23:56
 * @Description:
 */
//@SpringBootApplication
public class App {

    public static void main(String[] args) {
//        SpringApplication.run(App.class, args);
        IHelloService service = new HelloServiceImpl();
        RpcProxyServer proxyServer = new RpcProxyServer();
        proxyServer.publisher(service, 8888);
        System.out.println("Hello World!");
    }

}
