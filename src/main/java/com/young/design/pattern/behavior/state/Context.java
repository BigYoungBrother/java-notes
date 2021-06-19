package com.young.design.pattern.behavior.state;

/**
 * Context
 *
 * @author Young
 * @Date 2021-06-19 15:34
 */
public class Context {

    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }

}
