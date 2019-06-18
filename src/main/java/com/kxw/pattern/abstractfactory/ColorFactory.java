package com.kxw.pattern.abstractfactory;

import com.kxw.pattern.factorymethod.Shape;

/**
 * @author kangxiongwei
 * @date 2019/6/18 8:54 AM
 */
public class ColorFactory extends AbstractFactory {

    private static final String RED = "red";
    private static final String GREEN = "green";

    /**
     * 生产形状
     *
     * @param shape
     * @return
     */
    @Override
    Shape getShape(String shape) {
        return null;
    }

    /**
     * 生产颜色
     *
     * @param color
     * @return
     */
    @Override
    Color getColor(String color) {
        if (RED.equalsIgnoreCase(color)) {
            return new RedColor();
        } else if (GREEN.equalsIgnoreCase(color)) {
            return new GreenColor();
        } else {
            throw new RuntimeException("只支持[Red, Green]两种颜色");
        }
    }
}
