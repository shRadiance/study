package com.radiance.seata.b;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author sunhao
 * @date 2021/1/19 10:31
 * @Description:
 */
@MapperScan(basePackages = "com.radiance.seata.b.mapper")
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class BStarter {

    public static void main(String[] args) {
        SpringApplication.run(BStarter.class, args);
    }

}
