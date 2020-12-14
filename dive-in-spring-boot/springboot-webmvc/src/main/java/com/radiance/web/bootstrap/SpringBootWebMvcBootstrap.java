package com.radiance.web.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author sunhao
 * @date 2020/8/4 20:41
 */
@SpringBootApplication(scanBasePackages = "com.radiance.web")
public class SpringBootWebMvcBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebMvcBootstrap.class, args);
    }

}
