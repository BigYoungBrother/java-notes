package com.young.design.pattern.behavior.command;

/**
 * 卖股票的命令类
 *
 * @author Young
 * @Date 2021-06-19 14:09
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
