package com.radiance.gupap.p6.springcloud.feign;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author sunhao
 * @date 2020/11/18 15:59
 * @Description:
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(GpImportBeanDefinitionRegistrar.class)
public @interface EnableGpRegistrar {
}
