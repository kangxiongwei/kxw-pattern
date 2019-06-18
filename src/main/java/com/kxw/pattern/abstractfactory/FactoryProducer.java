package com.kxw.pattern.abstractfactory;

/**
 * @author kangxiongwei
 * @date 2019/6/18 8:56 AM
 */
public class FactoryProducer {

    private static final String SHAPE = "shape";
    private static final String COLOR = "color";

    public AbstractFactory getFactory(String factory) {
        if (SHAPE.equalsIgnoreCase(factory)) {
            return new ShapeFactory();
        } else {
            return new ColorFactory();
        }
    }

}
