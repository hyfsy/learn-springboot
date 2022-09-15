package com.hyf.hello.controller;

import com.hyf.hotrefresh.adapter.spring.ApplicationContextUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author baB_hyf
 * @date 2022/08/13
 */
@RestController
public class TTT {

    @RequestMapping("destroy")
    public void destroy() {
        ApplicationContextUtils.getApplicationContext()
                .getAutowireCapableBeanFactory()
                .destroyBean(
                        ApplicationContextUtils.getBean(
                                TestController.class));
    }
}
