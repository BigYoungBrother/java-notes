package com.young.design.pattern.behavior.responsibility;

/**
 * Error级别的日志处理
 *
 * @author Young
 * @Date 2021-06-18 20:39
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error::Logger: " + message);
    }
}
