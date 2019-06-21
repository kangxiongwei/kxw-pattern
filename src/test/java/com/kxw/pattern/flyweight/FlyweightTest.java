package com.kxw.pattern.flyweight;

import org.junit.Test;

/**
 * @author kangxiongwei
 * @date 2019/6/21 7:59 AM
 */
public class FlyweightTest {

    private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };

    @Test
    public void test() {
        for (int i = 0; i<20; i++) {
            Circle circle = FlyweightCircleFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }

    }

    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }


}
