package com.young.design.pattern.behavior.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建命令类
 *
 * @author Young
 * @Date 2021-06-19 14:09
 */
public class Broker {

    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void executeOrder() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
