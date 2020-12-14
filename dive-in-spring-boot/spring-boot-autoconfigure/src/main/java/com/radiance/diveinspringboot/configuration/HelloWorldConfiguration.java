package com.radiance.diveinspringboot.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * HelloWorld 配置
 *
 * @author sunhao
 * @date 2020/5/31 19:24
 * @Description:
 */
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String helloWorld() { // 方法名即 Bean 名称
        return "Hello World";
    }

}
