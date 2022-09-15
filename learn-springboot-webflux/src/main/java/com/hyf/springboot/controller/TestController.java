package com.hyf.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author baB_hyf
 * @date 2021/11/05
 */
@RestController
public class TestController {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/test")
    String test() {
        return "test";
    }
}
