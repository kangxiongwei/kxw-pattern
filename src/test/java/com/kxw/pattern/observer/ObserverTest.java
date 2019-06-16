package com.kxw.pattern.observer;

import org.junit.Test;

/**
 * @author kangxiongwei
 * @date 2019/6/16 8:50 AM
 */
public class ObserverTest {

    @Test
    public void test() {
        Subject subject = new Subject();
        new BinaryObserver(subject);
        new OctalObserver(subject);

        subject.setState(1);
    }



}
