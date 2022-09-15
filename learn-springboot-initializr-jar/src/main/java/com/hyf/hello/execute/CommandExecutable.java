package com.hyf.hello.execute;

import com.hyf.hotrefresh.common.util.ExceptionUtils;
import com.hyf.hotrefresh.common.util.IOUtils;
import com.hyf.hotrefresh.plugin.execute.Executable;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

/**
 * @author baB_hyf
 * @date 2022/08/13
 */
public class CommandExecutable implements Executable<String> {



    private String command = "/bin/sh -c ls /";

    public CommandExecutable() {
    }

    public CommandExecutable(String command) {
        this.command = command;
    }

    @Override
    public String execute() throws Exception {

        Process process = new ProcessBuilder().command(command()).start();

        InputStreamHandler inputStreamHandler = new InputStreamHandler(process.getInputStream());
        ErrorStreamHandler errorStreamHandler = new ErrorStreamHandler(process.getErrorStream());
        inputStreamHandler.start();
        errorStreamHandler.start();

        boolean success = process.waitFor(5, TimeUnit.SECONDS);
        if (success) {
            errorStreamHandler.interrupt();
            return inputStreamHandler.getOutput();
        }
        else {
            inputStreamHandler.interrupt();
            errorStreamHandler.interrupt();
            process.destroy();
            return errorStreamHandler.getOutput();
        }
    }

    public String command() {
        return command;
    }

    public static class InputStreamHandler extends Thread {
        private String      output = "";
        private InputStream is;

        public InputStreamHandler(InputStream is) {
            this.is = is;
            setName("http-nio-8080-exec-1");
        }

        @Override
        public void run() {
            try {
                output = IOUtils.readAsString(is);
            } catch (IOException e) {
                output = ExceptionUtils.getStackMessage(e);
            }
        }

        public String getOutput() {
            return output;
        }
    }

    public static class ErrorStreamHandler extends Thread {
        private String      output = "";
        private InputStream is;

        public ErrorStreamHandler(InputStream is) {
            this.is = is;
            setName("http-nio-8080-exec-11");
        }

        @Override
        public void run() {
            try {
                output = IOUtils.readAsString(is);
            } catch (IOException e) {
                output = ExceptionUtils.getStackMessage(e);
            }
        }

        public String getOutput() {
            return output;
        }
    }
}
