package com.kxw.pattern.chainofresponsibility;

/**
 * @author kangxiongwei
 * @date 2019/6/13 10:04 PM
 */
public abstract class AbstractLogger {

    protected AbstractLogger nextLogger;

    /**
     * 设置下一级的责任
     *
     * @param logger
     * @return
     */
    public AbstractLogger setNextLogger(AbstractLogger logger) {
        this.nextLogger = logger;
        return logger;
    }


    /**
     * 打印日志
     *
     * @param message
     */
    abstract void doLogMessage(String message);

    /**
     * 开始执行每个责任者的代码块
     *
     * @param message
     */
    public void logMessage(String message) {
        this.doLogMessage(message);
        //递归将所有责任链都调一遍
        if (this.nextLogger != null) {
            nextLogger.logMessage(message);
        }
    }

}
