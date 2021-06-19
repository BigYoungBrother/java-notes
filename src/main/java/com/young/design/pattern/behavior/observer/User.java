package com.young.design.pattern.behavior.observer;

/**
 * 具体的观察者
 *
 * @author Young
 * @Date 2021-06-19 14:45
 */
public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        read(message);
    }

    public void read(String message) {
        System.out.println(name + " 收到推送消息： " + message);
    }
}
