package com.young.design.pattern.behavior.state;

/**
 * η»ζηΆζ
 *
 * @author Young
 * @Date 2021-06-19 15:35
 */
public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString(){
        return "Stop State";
    }
}
