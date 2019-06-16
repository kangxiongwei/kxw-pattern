package com.kxw.pattern.decorator;

/**
 * @author kangxiongwei
 * @date 2019/6/16 8:24 AM
 */
public class Circle implements Shape {
    /**
     * 画图
     */
    @Override
    public void draw() {
        System.out.println("[Circle] drawing!");
    }
}
