package com.kxw.pattern.chainofresponsibility;

/**
 * 构建责任链的工厂方法
 *
 * @author kangxiongwei
 * @date 2019/6/13 10:07 PM
 */
public class LoggerFactory {

    /**
     * 构建责任链的顺序
     *
     * @return
     */
    public static AbstractLogger buildLoggerChain() {
        AbstractLogger debugLogger = new DebugLogger();
        AbstractLogger infoLogger = new InfoLogger();
        AbstractLogger errorLogger = new ErrorLogger();

        debugLogger.setNextLogger(infoLogger);
        infoLogger.setNextLogger(errorLogger);

        return debugLogger;
    }


}
