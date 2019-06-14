package com.kxw.pattern.strategy;

/**
 * @author kangxiongwei
 * @date 2019/6/14 9:00 AM
 */
public class StrategyContext implements Strategy {

    private Strategy strategy;

    public StrategyContext(Strategy strategy) {
        this.strategy = strategy;
    }


    /**
     * 操作
     *
     * @param num1
     * @param num2
     * @return
     */
    @Override
    public int doOperation(int num1, int num2) {
        return this.strategy.doOperation(num1, num2);
    }
}
