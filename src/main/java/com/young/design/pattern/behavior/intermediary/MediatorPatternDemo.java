package com.young.design.pattern.behavior.intermediary;

/**
 * 中介者模式测试类
 *
 * @author Young
 * @Date 2021-06-19 20:23
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
