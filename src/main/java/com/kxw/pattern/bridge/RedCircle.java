package com.kxw.pattern.bridge;

/**
 * @author kangxiongwei
 * @date 2019/6/21 8:34 AM
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius + ", x: " + x + ", " + y + "]");
    }
}
