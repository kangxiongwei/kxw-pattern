package com.kxw.pattern.facade;

import com.kxw.pattern.factorymethod.Circle;
import com.kxw.pattern.factorymethod.Rectangle;

/**
 * @author kangxiongwei
 * @date 2019/6/20 8:59 AM
 */
public class ShapeFacade {

    private Circle circle;
    private Rectangle rectangle;

    public ShapeFacade() {
        circle = new Circle();
        rectangle = new Rectangle();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

}
