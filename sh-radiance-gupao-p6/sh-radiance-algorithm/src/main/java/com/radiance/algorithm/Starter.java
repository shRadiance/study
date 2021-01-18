package com.radiance.algorithm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sunhao
 * @date 2021/1/5 14:11
 * @Description:
 */
@SpringBootApplication
public class Starter {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =  SpringApplication.run(Starter.class, args);
//        ConfigurableApplicationContext context =  new SpringApplicationBuilder(Starter.class)
//                .web(WebApplicationType.NONE)
//                .run(args);
//        System.out.println(context.getBean("sun"));
//        context.close();

//        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
//        System.out.println(context.getBean("sun"));

    }

}
