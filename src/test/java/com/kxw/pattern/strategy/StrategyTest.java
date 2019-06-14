package com.kxw.pattern.strategy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author kangxiongwei
 * @date 2019/6/14 9:02 AM
 */
public class StrategyTest {

    @Test
    public void testPlusStrategy() {
        StrategyContext context = new StrategyContext(new PlusStrategy());
        int add = context.doOperation(1, 2);
        assertEquals(3, add);
    }

    @Test
    public void testSubtractStrategy() {
        StrategyContext context = new StrategyContext(new SubtractStrategy());
        int subtract = context.doOperation(2, 1);
        assertEquals(1, subtract);
    }

}
