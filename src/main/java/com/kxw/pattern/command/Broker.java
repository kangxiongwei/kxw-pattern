package com.kxw.pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kangxiongwei
 * @date 2019/6/21 8:11 AM
 */
public class Broker {

    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }

}
