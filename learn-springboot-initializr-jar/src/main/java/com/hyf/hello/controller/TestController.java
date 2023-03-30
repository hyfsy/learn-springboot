package com.hyf.hello.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * @author baB_hyf
 * @date 2022/05/21
 */
// @Slf4j
@RestController
@RequestMapping("test")
public class TestController {

    @Value("${server.port}")
    private Integer            port;
    @Autowired
    private ApplicationContext context;

    // @RequestMapping("999")
    // public int _999() {
    //     return 10000;
    // }

    @RequestMapping("1")
    public boolean _1() {
        try {
            TestController.class.getDeclaredField("log");
            return true;
        } catch (NoSuchFieldException e) {
            return false;
        }
    }

    @RequestMapping("2")
    public boolean _2() {
        TestController bean = context.getBean(TestController.class);
        System.out.println(bean);
        System.out.println(context);
        return false;
    }

    // @RequestMapping("3")
    // public int _3(String s) {
    //     return 999;
    // }

    @RequestMapping("5")
    public void _5(HttpServletResponse response) {
        Cookie cookie = new Cookie("hyf", "test");
        cookie.setDomain("www.baidu.com");
        cookie.setPath("/");
        cookie.setSecure(false);
        cookie.setHttpOnly(false);
        cookie.setMaxAge(3600);
        response.addCookie(cookie);
    }
}
