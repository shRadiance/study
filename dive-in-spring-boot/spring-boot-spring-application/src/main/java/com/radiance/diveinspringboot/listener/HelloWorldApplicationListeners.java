package com.radiance.diveinspringboot.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * HelloWorld {@link ApplicationListener} 监听 {@link ContextRefreshedEvent}
 *
 * @author sunhao
 * @date 2020/6/7 23:54
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
public class HelloWorldApplicationListeners implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("HelloWorld : " + event.getApplicationContext().getId()
                + " , timestamp : " + event.getTimestamp());
    }
}
