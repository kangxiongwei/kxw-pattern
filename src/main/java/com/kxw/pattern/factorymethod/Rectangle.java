package com.kxw.pattern.factorymethod;

/**
 * @author kangxiongwei
 * @date 2019/6/18 8:24 AM
 */
public class Rectangle implements Shape {

    /**
     * 画图
     */
    @Override
    public void draw() {
        System.out.println("[Rectangle] is drawing!");
    }

}
