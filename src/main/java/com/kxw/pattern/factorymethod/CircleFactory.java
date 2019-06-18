package com.kxw.pattern.factorymethod;

/**
 * @author kangxiongwei
 * @date 2019/6/18 8:25 AM
 */
public class CircleFactory implements ShapeFactory {


    @Override
    public Shape getShape() {
        return new Circle();
    }

}
