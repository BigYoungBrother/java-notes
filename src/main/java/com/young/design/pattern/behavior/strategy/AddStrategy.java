package com.young.design.pattern.behavior.strategy;

/**
 * 加法策略
 *
 * @author Young
 * @Date 2021-06-19 14:29
 */
public class AddStrategy implements Strategy{
    @Override
    public int calc(int num1, int num2) {
        return num1 + num2;
    }
}
