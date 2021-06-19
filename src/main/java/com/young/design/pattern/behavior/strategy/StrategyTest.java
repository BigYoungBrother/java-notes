package com.young.design.pattern.behavior.strategy;

/**
 * 策略模式测试类
 *
 * @author Young
 * @Date 2021-06-19 14:35
 */
public class StrategyTest {
    public static void main(String[] args) {
        StrategyFactory strategyFactory = new StrategyFactory();
        Strategy strategy = strategyFactory.getStrategy("+");
        System.out.println("1 + 3 = " + strategy.calc(1, 3));
    }
}
