package com.hyf.springboot;

import org.springframework.boot.diagnostics.AbstractFailureAnalyzer;
import org.springframework.boot.diagnostics.FailureAnalysis;

/**
 * @author baB_hyf
 * @date 2020/07/18
 */
public class MyFailAnalyzer extends AbstractFailureAnalyzer<NullPointerException>
{

    @Override
    protected FailureAnalysis analyze(Throwable rootFailure, NullPointerException cause) {
        rootFailure.printStackTrace();
        cause.printStackTrace();
        return new FailureAnalysis("you have invoke null object method", "check null obj", cause);
    }

}
