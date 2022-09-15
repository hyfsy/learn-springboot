package com.hyf.hello.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author baB_hyf
 * @date 2022/07/18
 */
@Component
public class LoopReference {

    @Autowired
    private LoopReference loopReference;

    public LoopReference getLoopReference() {
        return loopReference;
    }

    public void invoke() {
        System.out.println(this.getLoopReference().getClass());
    }
}
