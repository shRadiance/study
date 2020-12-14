package com.radiance.web.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot Rest 引导类
 * @author sunhao
 * @date 2020/9/2 14:13
 * @Description:
 */
@SpringBootApplication(scanBasePackages = {"com.radiance.web.controller"})
public class SpringBootRestBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRestBootstrap.class, args);
    }

}
