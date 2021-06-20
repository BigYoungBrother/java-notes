package com.young.design.pattern.behavior.interpreter;

/**
 * 表达式接口
 *
 * @author Young
 * @Date 2021-06-20 20:20
 */
public interface Expression {
    /**
     * 解释表达式
     *
     * @param context
     * @return
     */
    boolean interpret(String context);
}
