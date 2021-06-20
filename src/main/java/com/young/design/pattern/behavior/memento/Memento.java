package com.young.design.pattern.behavior.memento;

/**
 * 备忘录
 *
 * @author Young
 * @Date 2021-06-20 20:14
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
