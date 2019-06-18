package com.kxw.pattern.abstractfactory;

import com.kxw.pattern.factorymethod.Shape;

/**
 * @author kangxiongwei
 * @date 2019/6/18 8:50 AM
 */
public abstract class AbstractFactory {

    /**
     * 生产形状
     *
     * @return
     */
    abstract Shape getShape(String shape);

    /**
     * 生产颜色
     *
     * @return
     */
    abstract Color getColor(String color);
}
