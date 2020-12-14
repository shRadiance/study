package com.radiance.diveinspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

/**
 * {@link SpringApplication} 引导类
 *
 * @author sunhao
 * @date 2020/6/7 19:26
 */
public class SpringApplicationBootstrap {

    public static void main(String[] args) {
//        SpringApplication.run(ApplicationConfiguration.class, args);
        Set<String> sources = new HashSet<>();
        //配置 Class 名称
        sources.add(ApplicationConfiguration.class.getName());
        SpringApplication springApplication = new SpringApplication();
        springApplication.setSources(sources);
        springApplication.run(args);
    }

    @SpringBootApplication
    public static class ApplicationConfiguration {

    }

}
