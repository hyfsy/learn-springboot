package com.hyf.hello;

import com.hyf.bbb.TestConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author baB_hyf
 * @date 2022/03/23
 */
@Configuration
@Import(TestConfiguration.class)
public class ImportConfiguration {
}
