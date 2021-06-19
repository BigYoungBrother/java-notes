package com.young.design.pattern.behavior.state;

/**
 * 开始状态
 *
 * @author Young
 * @Date 2021-06-19 15:35
 */
public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    @Override
    public String toString(){
        return "Start State";
    }
}
