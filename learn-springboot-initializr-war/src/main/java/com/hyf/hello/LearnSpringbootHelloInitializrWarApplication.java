package com.hyf.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@SpringBootApplication
public class LearnSpringbootHelloInitializrWarApplication
{

    public static void main(String[] args) {
        SpringApplication.run(LearnSpringbootHelloInitializrWarApplication.class, args);
    }

    @RequestMapping("/hello")
    public String hello() {
        System.out.println("hello world");
        return "hello World!!!";
    }

    @RequestMapping("/remote")
    public String helloSuccess() {
        return "success";
    }
}
