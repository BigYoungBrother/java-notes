package com.young.design.pattern.behavior.command;

/**
 * 买股票的命令实现
 *
 * @author Young
 * @Date 2021-06-19 14:07
 */
public class BuyStock implements Order {

    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
