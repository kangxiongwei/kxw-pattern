package com.kxw.pattern.abstractfactory;

import com.kxw.pattern.factorymethod.Shape;
import org.junit.Test;

/**
 * @author kangxiongwei
 * @date 2019/6/18 8:58 AM
 */
public class FactoryProducerTest {

    @Test
    public void test() {
        FactoryProducer producer = new FactoryProducer();
        AbstractFactory shapeFactory = producer.getFactory("shape");
        Shape shape = shapeFactory.getShape("circle");
        shape.draw();

        AbstractFactory colorFactory = producer.getFactory("color");
        Color color = colorFactory.getColor("red");
        color.fill();
    }



}
