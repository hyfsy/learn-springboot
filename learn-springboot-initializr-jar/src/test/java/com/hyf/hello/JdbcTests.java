package com.hyf.hello;

import com.hyf.hello.config.TxService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(classes = LearnSpringbootHelloInitializrApplication.class)
class JdbcTests {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private TxService txService;

    @Test
    void contextLoads() {
        assertNotNull(dataSource);
    }

    @Test
    void testError() {
        txService.aaa();
    }

}
