package com.kxw.pattern.flyweight;

import com.kxw.pattern.factorymethod.Shape;
import lombok.Data;
import lombok.ToString;

/**
 * @author kangxiongwei
 * @date 2019/6/21 7:54 AM
 */
@Data
@ToString
public class Circle implements Shape {

    private String color;
    private int x;
    private int y;
    private int radius;

    /**
     * 画图
     */
    @Override
    public void draw() {
        System.out.println(this.toString());
    }
}
