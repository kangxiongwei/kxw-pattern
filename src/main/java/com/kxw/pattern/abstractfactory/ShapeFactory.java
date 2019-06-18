package com.kxw.pattern.abstractfactory;

import com.kxw.pattern.factorymethod.Circle;
import com.kxw.pattern.factorymethod.Rectangle;
import com.kxw.pattern.factorymethod.Shape;

/**
 * @author kangxiongwei
 * @date 2019/6/18 8:52 AM
 */
public class ShapeFactory extends AbstractFactory {

    private static final String CIRCLE = "circle";
    private static final String RECTANGLE = "rectangle";

    /**
     * 生产形状
     *
     * @return
     */
    @Override
    Shape getShape(String shape) {
        if (CIRCLE.equalsIgnoreCase(shape)) {
            return new Circle();
        } else if (RECTANGLE.equalsIgnoreCase(shape)) {
            return new Rectangle();
        } else {
            throw new RuntimeException("只支持[Circle, Rectangle]两种类型!");
        }
    }

    /**
     * 生产颜色
     *
     * @return
     */
    @Override
    Color getColor(String color) {
        return null;
    }
}
