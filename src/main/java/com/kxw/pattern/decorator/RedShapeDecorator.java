package com.kxw.pattern.decorator;

/**
 * @author kangxiongwei
 * @date 2019/6/16 8:27 AM
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    /**
     * 画图
     */
    @Override
    public void draw() {
        shape.draw();
        System.out.println("[Red " + shape.getClass().getSimpleName() + "] drawing!");
    }
}
