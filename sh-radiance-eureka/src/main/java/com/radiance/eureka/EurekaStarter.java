package com.radiance.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author sunhao
 * @date 2020/12/14 15:47
 * @Description:
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaStarter {

    public static void main(String[] args) {
        SpringApplication.run(EurekaStarter.class, args);
    }

}
