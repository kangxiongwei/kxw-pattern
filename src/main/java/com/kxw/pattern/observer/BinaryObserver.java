package com.kxw.pattern.observer;

/**
 * @author kangxiongwei
 * @date 2019/6/16 8:47 AM
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    /**
     * 通知
     */
    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}
