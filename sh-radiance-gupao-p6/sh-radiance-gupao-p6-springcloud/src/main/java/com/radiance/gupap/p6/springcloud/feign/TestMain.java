package com.radiance.gupap.p6.springcloud.feign;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

/**
 * @author sunhao
 * @date 2020/11/18 16:01
 * @Description:
 */
@Configuration
@EnableGpRegistrar
@EnableFeignClients
public class TestMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TestMain.class);
        System.out.println(applicationContext.getBean(HelloService.class));
    }
}
