package com.hyf.hello.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author baB_hyf
 * @date 2022/10/01
 */
@Configuration
public class AonfigurationConditionTests {

    @Bean
    public ConfigurationConditionTests.A axx2() {
        return new ConfigurationConditionTests.A();
    }
}
