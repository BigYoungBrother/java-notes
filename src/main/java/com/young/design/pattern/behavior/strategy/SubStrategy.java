package com.young.design.pattern.behavior.strategy;

/**
 * 减法策略
 *
 * @author Young
 * @Date 2021-06-19 14:32
 */
public class SubStrategy implements Strategy {

    @Override
    public int calc(int num1, int num2) {
        return num1 - num2;
    }

}
