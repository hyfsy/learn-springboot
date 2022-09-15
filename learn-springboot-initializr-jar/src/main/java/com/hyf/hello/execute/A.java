package com.hyf.hello.execute;

import com.hyf.hotrefresh.common.util.ReflectionUtils;
import com.hyf.hotrefresh.core.util.Util;
import com.hyf.hotrefresh.plugin.execute.Executable;

/**
 * @author baB_hyf
 * @date 2022/07/21
 */
public class A implements Executable<String> {

    @Override
    public String execute() {
        // DataSource bean = ApplicationContextUtils.getBean(DataSource.class);

        // DynamicRoutingDataSource

        // return bean.toString();

        Class<?> clazz = ReflectionUtils.forName("io.jsonwebtoken.Claims", Util.getOriginContextClassLoader());

        return clazz.getProtectionDomain().getCodeSource().getLocation().toString();

    }
}
