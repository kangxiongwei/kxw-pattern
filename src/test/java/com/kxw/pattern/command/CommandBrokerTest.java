package com.kxw.pattern.command;

import org.junit.Test;

/**
 * @author kangxiongwei
 * @date 2019/6/21 8:12 AM
 */
public class CommandBrokerTest {

    @Test
    public void test() {
        Stock stock = new Stock();
        BuyStock buyStock = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);


        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);

        broker.placeOrders();
    }



}
