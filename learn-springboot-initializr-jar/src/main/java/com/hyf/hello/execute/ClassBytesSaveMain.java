package com.hyf.hello.execute;

import com.hyf.hotrefresh.common.util.ByteUtils;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author baB_hyf
 * @date 2022/08/13
 */
public class ClassBytesSaveMain {

    public static void main(String[] args) throws IOException {
        String s = "[-54, -2, -73, 1, 40, 1, 54, 1, 55]";


        try (FileOutputStream fos = new FileOutputStream("E:\\a.class")) {
            fos.write(ByteUtils.parse(s));
        }
    }
}
