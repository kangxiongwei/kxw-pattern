package com.kxw.pattern.bridge;

/**
 * 桥接接口
 *
 * @author kangxiongwei
 */
public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}