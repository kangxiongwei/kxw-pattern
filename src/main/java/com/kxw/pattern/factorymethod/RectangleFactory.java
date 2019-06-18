package com.kxw.pattern.factorymethod;

/**
 * @author kangxiongwei
 * @date 2019/6/18 8:26 AM
 */
public class RectangleFactory implements ShapeFactory {

    @Override
    public Shape getShape() {
        return new Rectangle();
    }

}
