package com.radiance.diveinspringboot.externalized.configuration.bootstrap;

import com.radiance.diveinspringboot.externalized.configuration.domain.User;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Locale;

/**
 * {@link ConfigurationProperties @ConfigurationProperties} 注解引导类
 * @author sunhao
 * @date 2020/8/5 16:04
 */
@EnableAutoConfiguration
@EnableConfigurationProperties
public class ConfigurationPropertiesBootstrap {

    @Bean
    @ConfigurationProperties(prefix = "user")
    //这样写是不行的，需要制定到当前最下层的properites的值属性，像下面三种
//    @ConditionalOnProperty("user.city")
//    @ConditionalOnProperty("user.city.post-code")
//    @ConditionalOnProperty(name = "user.city.post-code",matchIfMissing = false)
    @ConditionalOnProperty(prefix = "user",name = "city.post-code", matchIfMissing = false, havingValue = "0571")
    public User user() {
        return new User();
    }

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        ConfigurableApplicationContext context =
                new SpringApplicationBuilder(ConfigurationPropertiesBootstrap.class)
                        .web(WebApplicationType.NONE) // 非 Web 应用
                        .run(args);

//        User user = context.getBean("user", User.class);
        User user = context.getBean(User.class);

        System.err.println("用户对象 : " + user);

        // 关闭上下文
        context.close();
    }
}
