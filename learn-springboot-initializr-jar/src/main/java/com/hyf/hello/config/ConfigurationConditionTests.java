package com.hyf.hello.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author baB_hyf
 * @date 2022/10/01
 */
@Configuration
public class ConfigurationConditionTests {

    @Bean
    @ConditionalOnMissingBean(value = A.class, name = "axx")
    public A axx() {
        return new A();
    }

    public static class A {

    }
}
