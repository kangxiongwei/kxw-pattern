package com.kxw.pattern.decorator;

/**
 * @author kangxiongwei
 * @date 2019/6/16 8:25 AM
 */
public class ShapeDecorator implements Shape {

    protected Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    /**
     * 画图
     */
    @Override
    public void draw() {
        this.shape.draw();
    }
}
