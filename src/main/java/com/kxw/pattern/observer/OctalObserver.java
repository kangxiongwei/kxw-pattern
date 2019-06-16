package com.kxw.pattern.observer;

/**
 * @author kangxiongwei
 * @date 2019/6/16 8:49 AM
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    /**
     * 通知
     */
    @Override
    public void update() {
        System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
    }
}
