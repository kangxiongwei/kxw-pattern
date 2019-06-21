package com.kxw.pattern.command;

/**
 * @author kangxiongwei
 * @date 2019/6/21 8:09 AM
 */
public class BuyStock implements Order {

    private Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        this.stock.buy();
    }
}
