package com.young.design.pattern.behavior.interpreter;

/**
 * 解释器模式测试类
 *
 * @author Young
 * @Date 2021-06-20 20:23
 */
public class InterpreterPatternDemo {
    /**
     * 规则：Robert 和 John 是男性
     */
    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    /**
     * 规则：Julie 是一个已婚的女性
     */
    public static Expression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression maleExpression = getMaleExpression();
        Expression marriedWomanExpression = getMarriedWomanExpression();

        System.out.println("John is male? " + maleExpression.interpret("John"));
        System.out.println("Julie is a married women? "
                + marriedWomanExpression.interpret("Married Julie"));
    }
}
