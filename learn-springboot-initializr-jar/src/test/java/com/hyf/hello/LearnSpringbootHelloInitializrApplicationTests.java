package com.hyf.hello;

import com.hyf.hello.config.LoopReference;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(classes = LearnSpringbootHelloInitializrApplication.class)
class LearnSpringbootHelloInitializrApplicationTests
{

    @Value("#{testComponent.s}")
    private String string;

    @Autowired
    private Environment environment;

    @Autowired
    private ApplicationContext ctx;

    @Autowired
    private LoopReference loopReference;

    @Test
    void contextLoads() {
        assertNotNull(ctx);
    }

    @Test
    void spelGetBeanField() {
        assertNotNull(string);
        assertEquals(string, "xxx");
    }

    @Test
    void getEnv() {
        assertNotNull(environment);
        System.out.println(environment);
    }

    @Test
    void getLoopReference() {
        assertEquals(loopReference, loopReference.getLoopReference());
        System.out.println(loopReference.getLoopReference());
        loopReference.invoke();
    }
}
