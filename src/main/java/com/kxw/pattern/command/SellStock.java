package com.kxw.pattern.command;

/**
 * @author kangxiongwei
 * @date 2019/6/21 8:10 AM
 */
public class SellStock implements Order {

    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        this.stock.sell();
    }
}
