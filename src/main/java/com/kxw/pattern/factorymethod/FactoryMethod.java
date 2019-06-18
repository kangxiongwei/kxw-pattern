package com.kxw.pattern.factorymethod;

/**
 * 好处：任何新产品到来，只需要实现Shape和ShapeFactory接口，而不需要修改其他代码
 *
 * @author kangxiongwei
 * @date 2019/6/18 8:27 AM
 */
public class FactoryMethod {

    private static final String CIRCLE = "circle";
    private static final String RECTANGLE = "rectangle";

    /**
     * 生产对应的品类
     *
     * @param type
     * @return
     */
    public Shape getShape(String type) {
        if (CIRCLE.equalsIgnoreCase(type)) {
            return new CircleFactory().getShape();
        } else if (RECTANGLE.equalsIgnoreCase(type)) {
            return new RectangleFactory().getShape();
        } else {
            throw new RuntimeException("只支持[Circle, Rectangle]两种类型!");
        }
    }

}
