package com.kxw.pattern.chainofresponsibility;

/**
 * @author kangxiongwei
 * @date 2019/6/13 10:07 PM
 */
public class ErrorLogger extends AbstractLogger {
    /**
     * 打印日志
     *
     * @param message
     */
    @Override
    void doLogMessage(String message) {
        System.out.println("[Error] " + message);
    }
}
