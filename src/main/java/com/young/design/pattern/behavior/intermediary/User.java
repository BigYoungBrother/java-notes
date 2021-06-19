package com.young.design.pattern.behavior.intermediary;

/**
 * 用户类
 *
 * @author Young
 * @Date 2021-06-19 20:23
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }
}
