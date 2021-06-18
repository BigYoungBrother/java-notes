package com.young.design.pattern.behavior.responsibility;

/**
 * Debug级别的日志处理
 *
 * @author Young
 * @Date 2021-06-18 20:38
 */
public class DebugLogger extends AbstractLogger {

    public DebugLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Debug::Logger: " + message);
    }
}
