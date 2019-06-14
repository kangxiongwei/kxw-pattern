package com.kxw.pattern.strategy;

/**
 * @author kangxiongwei
 * @date 2019/6/14 8:59 AM
 */
public class SubtractStrategy implements Strategy {
    /**
     * 操作
     *
     * @param num1
     * @param num2
     * @return
     */
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
