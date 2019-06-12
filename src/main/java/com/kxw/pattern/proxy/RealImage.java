package com.kxw.pattern.proxy;

/**
 * @author kangxiongwei
 * @date 2019/6/12 11:12 PM
 */
public class RealImage implements Image {

    /**
     * 展示图片方法
     */
    @Override
    public void display() {
        System.out.println("display: real image!");
    }
}
