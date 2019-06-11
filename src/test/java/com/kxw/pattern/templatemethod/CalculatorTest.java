package com.kxw.pattern.templatemethod;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author kangxiongwei
 * @date 2019/6/12 1:28 AM
 */
public class CalculatorTest {

    @Test
    public void testPlus() {
        AbstractCalculator calculator = new PlusCalculator();
        int calculate = calculator.calculate("8 + 9", "\\+");
        assertEquals(17, calculate);
    }

    @Test
    public void testMinus() {
        AbstractCalculator calculator = new MinusCalculator();
        int calculate = calculator.calculate("8 - 7", "\\-");
        assertEquals(1, calculate);
    }

}
