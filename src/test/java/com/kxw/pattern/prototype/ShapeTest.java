package com.kxw.pattern.prototype;

import org.junit.Test;

/**
 * @author kangxiongwei
 * @date 2019/6/20 8:43 AM
 */
public class ShapeTest {

    @Test
    public void test() {
        ShapeCache.loadCache();

        AbstractShape originShape = ShapeCache.getShape("1");
        AbstractShape cloneShape = ShapeCache.getCloneShape("1");

        System.out.println(originShape + "," + originShape.hashCode());
        System.out.println(cloneShape + "," + cloneShape.hashCode());

        cloneShape.setType("cloneType");
        originShape.setType("originType");

        System.out.println(originShape + "," + originShape.hashCode());
        System.out.println(cloneShape + "," + cloneShape.hashCode());
    }



}
