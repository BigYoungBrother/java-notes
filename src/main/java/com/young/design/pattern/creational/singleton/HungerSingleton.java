package com.young.design.pattern.creational.singleton;

/**
 * 单例模式 -- 饿汉式
 *
 * @author Young
 * @Date 2021-05-24 20:53
 */
public class HungerSingleton {

    private static final HungerSingleton HUNGER_SINGLETON = new HungerSingleton();

    private HungerSingleton() {
    }

    public static HungerSingleton getHungerSingleton() {
        return HUNGER_SINGLETON;
    }
}
