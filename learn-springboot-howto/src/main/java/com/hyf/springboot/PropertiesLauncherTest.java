package com.hyf.springboot;

import org.springframework.boot.loader.PropertiesLauncher;

/**
 * @author baB_hyf
 * @date 2020/07/21
 */
public class PropertiesLauncherTest {

    public static void main(String[] args) throws Exception {
//        System.setProperty("loader.home", "true");
//        System.setProperty("loader.location", "true");
//        System.setProperty("loader.path", "true");
        System.setProperty("loader.debug", "true");
//        System.out.println(System.getProperty("user.dir"));
                PropertiesLauncher.main(args);
    }
}
