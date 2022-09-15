package com.hyf.bbb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author baB_hyf
 * @date 2022/03/23
 */
@Configuration
public class TestConfiguration {

    @Bean
    public String s1() {
        System.out.println("s1");
        return "s1";
    }

    @Bean
    public String s2() {
        System.out.println("s2");
        return s1() + "-2";
    }

    @Bean
    public String s3() {
        System.out.println("s3");
        return s1() + "-3";
    }
}
