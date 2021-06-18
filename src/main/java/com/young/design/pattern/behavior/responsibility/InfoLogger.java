package com.young.design.pattern.behavior.responsibility;

/**
 * Info级别的日志处理器
 *
 * @author Young
 * @Date 2021-06-18 20:36
 */

public class InfoLogger extends AbstractLogger {

    public InfoLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Info::Logger: " + message);
    }
}
