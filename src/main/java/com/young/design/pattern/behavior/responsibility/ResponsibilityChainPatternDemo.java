package com.young.design.pattern.behavior.responsibility;

/**
 * 责任链模式测试类
 *
 * @author Young
 * @Date 2021-06-18 20:39
 */
public class ResponsibilityChainPatternDemo {

    /**
     * 定义责任链
     */
    private static AbstractLogger getChainOfLoggers() {

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger debugLogger = new DebugLogger(AbstractLogger.DEBUG);
        AbstractLogger infoLogger = new InfoLogger(AbstractLogger.INFO);
        // 定义的责任链为  errorLogger --> debugLogger -->infoLogger
        errorLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(infoLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
        System.out.println();
        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is a debug level information.");
        System.out.println();
        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");
    }
}
