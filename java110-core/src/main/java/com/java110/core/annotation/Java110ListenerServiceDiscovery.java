package com.java110.core.annotation;

import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 侦听注入
 * Created by wuxw on 2018/7/2.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(Java110ListenerServiceDiscoveryRegistrar.class)
public @interface Java110ListenerServiceDiscovery {

    String[] basePackages() default {};

    String[] value() default {};

    Class<?> listenerPublishClass();
}
