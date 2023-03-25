package com.hyf.hello.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author baB_hyf
 * @date 2022/09/20
 */
@Component
public class Initializer implements CommandLineRunner {

    @Resource
    private TxTestService txTestService;

    @Resource
    private ApplicationContext context;

    @Override
    public void run(String... args) throws Exception {
        txTestService.a();
        // txTestService.b();
    }
}
