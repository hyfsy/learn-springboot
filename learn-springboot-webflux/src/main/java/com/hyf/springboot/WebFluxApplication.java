package com.hyf.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebFluxApplication {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getContextClassLoader());
        SpringApplication.run(WebFluxApplication.class, args);
    }

}
