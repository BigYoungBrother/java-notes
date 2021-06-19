package com.young.design.pattern.behavior.command;

/**
 * 命令模式测试类
 *
 * @author Young
 * @Date 2021-06-19 14:11
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        // 接受命令
        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        //执行命令
        broker.executeOrder();
    }
}
