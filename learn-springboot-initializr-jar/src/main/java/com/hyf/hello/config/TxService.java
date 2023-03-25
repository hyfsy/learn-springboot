package com.hyf.hello.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.transaction.support.TransactionTemplate;

import java.util.UUID;

/**
 * @author baB_hyf
 * @date 2022/07/18
 */
@Component
public class TxService {

    @Autowired
    private JdbcTemplate        jdbcTemplate;
    @Autowired
    private TransactionTemplate transactionTemplate;

    @Autowired
    private TxService txService;

    @Transactional(rollbackFor = Exception.class)
    public void aaa() {

        jdbcTemplate.execute("insert t1 (name) values ('" + UUID.randomUUID().toString() + "')");

        try {
            txService.bbb();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        jdbcTemplate.execute("delete from t1 where id = 0");
    }

    @Transactional(rollbackFor = Exception.class, propagation = Propagation.NESTED)
    public void bbb() {
        jdbcTemplate.execute("insert t1 (id, name) values (0, '" + UUID.randomUUID().toString() + "')");
        throw new RuntimeException("bbb");
    }

    @Transactional(rollbackFor = Exception.class)
    public void ccc() {
        try {
            txService.ddd();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        jdbcTemplate.execute("insert t1 (name) values ('" + UUID.randomUUID().toString() + "')");
    }

    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRES_NEW)
    public void ddd() {
        jdbcTemplate.execute("insert t1 (id, name) values (9999, '" + UUID.randomUUID().toString() + "')");
        throw new RuntimeException("test exception");
    }
}
