package com.hyf.springboot;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class HowToApplication implements ApplicationRunner
{

    public static void main(String[] args) {
        SpringApplication.run(HowToApplication.class, args);
    }

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/test")
    String test() {
        return "test";
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // 测试自定义FailureAnalyzer
        String a = null;
//        a.length();
    }

}
