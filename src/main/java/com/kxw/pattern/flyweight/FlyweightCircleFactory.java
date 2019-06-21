package com.kxw.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kangxiongwei
 * @date 2019/6/21 7:56 AM
 */
public class FlyweightCircleFactory {

    private static Map<String, Circle> circleMap = new HashMap<>();

    /**
     * 享元模式
     *
     * @param color
     * @return
     */
    public static Circle getCircle(String color) {
        Circle circle = circleMap.get(color);
        if (circle == null) {
            circle = new Circle();
            circle.setColor(color);
            System.out.println("Creating color " + color + " circle!");
            circleMap.put(color, circle);
        }

        return circle;
    }


}
