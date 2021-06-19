package com.young.design.pattern.behavior.state;

/**
 * 状态模式测试类
 *
 * @author Young
 * @Date 2021-06-19 15:36
 */
public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
