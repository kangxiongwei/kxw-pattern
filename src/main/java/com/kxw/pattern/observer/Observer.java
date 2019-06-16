package com.kxw.pattern.observer;


/**
 * @author kangxiongwei
 * @date 2019/6/16 8:44 AM
 */
public abstract class Observer {

    /**
     * 被观察的对象
     */
    protected Subject subject;

    /**
     * 通知
     */
    public abstract void update();

}
