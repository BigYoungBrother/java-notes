package com.young.design.pattern.behavior.interpreter;

/**
 * expr1包含context或者expr2包含context则解释为true,否则解释为false
 *
 * @author Young
 * @Date 2021-06-20 20:21
 */
public class OrExpression implements Expression {
    private Expression expr1 = null;
    private Expression expr2 = null;

    public OrExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) || expr2.interpret(context);
    }
}
