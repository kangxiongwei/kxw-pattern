package com.kxw.pattern.bridge;

import org.junit.Test;

/**
 * @author kangxiongwei
 * @date 2019/6/21 8:36 AM
 */
public class BridgeTest {

    @Test
    public void test() {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }




}
