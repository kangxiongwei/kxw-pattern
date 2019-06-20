package com.kxw.pattern.prototype;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author kangxiongwei
 * @date 2019/6/20 8:40 AM
 */
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class CircleShape extends AbstractShape {

    @Override
    void draw() {
        System.out.println("Circle drawing!");
    }
}
