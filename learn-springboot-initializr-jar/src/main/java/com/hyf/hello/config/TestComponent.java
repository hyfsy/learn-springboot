package com.hyf.hello.config;

import org.springframework.stereotype.Component;

/**
 * @author baB_hyf
 * @date 2022/07/18
 */
@Component("testComponent")
public class TestComponent {

    private String s = "xxx";

    public String getS() {
        return s;
    }
}
