package com.kxw.pattern.factorymethod;

/**
 * @author kangxiongwei
 * @date 2019/6/18 8:23 AM
 */
public class Circle implements Shape {

    /**
     * 画图
     */
    @Override
    public void draw() {
        System.out.println("[Circle] is drawing!");
    }

}
