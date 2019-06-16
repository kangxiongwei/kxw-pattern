package com.kxw.pattern.decorator;

import org.junit.Test;

/**
 * @author kangxiongwei
 * @date 2019/6/16 8:29 AM
 */
public class ShapeDecoratorTest {

    @Test
    public void testRedCircle() {
        RedShapeDecorator shape = new RedShapeDecorator(new Circle());
        shape.draw();
    }

    @Test
    public void testRectangle() {
        RedShapeDecorator shape = new RedShapeDecorator(new Rectangle());
        shape.draw();
    }

}
