package com.radiance.gupao.p5.io.rpc.server.provider;

import com.radiance.gupao.p5.io.rpc.server.api.IHelloService;

/**
 * @author sunhao
 * @date 2020/9/28 23:52
 * @Description:
 */
public class HelloServiceImpl implements IHelloService {
    @Override
    public String sayHello(String content) {
        return "Hello content:" + content;
    }
}
