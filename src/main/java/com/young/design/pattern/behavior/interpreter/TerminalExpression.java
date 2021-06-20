package com.young.design.pattern.behavior.interpreter;

/**
 * 表达式接口实现类， 如果要解释的表达式context中包含data则解释为true，否则解释为false
 *
 * @author Young
 * @Date 2021-06-20 20:20
 */
public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)) {
            return true;
        }
        return false;
    }
}
