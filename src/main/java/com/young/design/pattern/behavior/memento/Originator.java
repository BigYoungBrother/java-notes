package com.young.design.pattern.behavior.memento;

/**
 * 备忘录中要记录的对象
 *
 * @author Young
 * @Date 2021-06-20 20:16
 */
public class Originator {
    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento Memento){
        state = Memento.getState();
    }
}
