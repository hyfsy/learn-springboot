package com.hyf.hello.config;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author baB_hyf
 * @date 2022/09/20
 */
@Service
public class TxTestServiceImpl implements TxTestService {
    // @Transactional
    @Override
    public void a() {
        System.out.println("a");
    }

    @Transactional
    public void b() {
        System.out.println("b");
    }
}
