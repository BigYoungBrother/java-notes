package com.young.design.pattern.behavior.strategy;

/**
 * 策略模式接口
 *
 * @author Young
 * @Date 2021-06-19 14:28
 */
public interface Strategy {

    /**
     * 计算两个数字
     *
     * @param num1
     * @param num2
     * @return
     */
    int calc(int num1, int num2);

}
