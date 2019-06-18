package com.kxw.pattern.factorymethod;

import org.junit.Test;

/**
 * @author kangxiongwei
 * @date 2019/6/18 8:35 AM
 */
public class FactoryMethodTest {

    @Test
    public void testCircle() {
        FactoryMethod factoryMethod = new FactoryMethod();
        Shape shape = factoryMethod.getShape("circle");
        shape.draw();
    }

    @Test
    public void testSquare() {
        FactoryMethod factoryMethod = new FactoryMethod();
        Shape shape = factoryMethod.getShape("square");
        shape.draw();
    }

}
