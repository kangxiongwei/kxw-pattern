package com.kxw.pattern.templatemethod;

/**
 * @author kangxiongwei
 * @date 2019/6/12 1:24 AM
 */
public class PlusCalculator extends AbstractCalculator {
    /**
     * 抽象计算方法
     *
     * @param num1
     * @param num2
     * @return
     */
    @Override
    int calculate(int num1, int num2) {
        return num1 + num2;
    }
}
