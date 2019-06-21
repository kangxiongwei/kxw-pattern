package com.kxw.pattern.mediator;

import org.junit.Test;

/**
 * @author kangxiongwei
 * @date 2019/6/21 8:42 AM
 */
public class MediatorTest {

    @Test
    public void test() {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }


}
