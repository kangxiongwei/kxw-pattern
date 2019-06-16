package com.kxw.pattern.decorator;

/**
 * @author kangxiongwei
 * @date 2019/6/16 8:25 AM
 */
public class Rectangle implements Shape {
    /**
     * 画图
     */
    @Override
    public void draw() {
        System.out.println("[Rectangle] drawing!");
    }
}
