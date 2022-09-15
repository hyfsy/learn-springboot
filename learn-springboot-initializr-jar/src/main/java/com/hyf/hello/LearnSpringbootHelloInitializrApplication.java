package com.hyf.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * -javaagent:E:\study\env\component\cloud-resources\apache-skywalking-apm-8.5.0\agent\skywalking-agent.jar -Dskywalking.agent.service_name=hyf-test
 */
@SpringBootApplication
public class LearnSpringbootHelloInitializrApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnSpringbootHelloInitializrApplication.class, args);
    }

}
