package com.kxw.pattern.chainofresponsibility;

import org.junit.Test;

/**
 * @author kangxiongwei
 * @date 2019/6/13 10:18 PM
 */
public class LoggerTest {

    @Test
    public void test() {
        AbstractLogger logger = LoggerFactory.buildLoggerChain();
        logger.logMessage("hello logger");
    }


}
