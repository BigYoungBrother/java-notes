package com.young.design.pattern.creational.singleton;

import java.util.Objects;

/**
 * 单例模式 -- 懒汉式
 *
 * @author Young
 * @Date 2021-05-24 21:15
 */
public class LazySingleton {

    private static LazySingleton LAZY_SINGLETON = null;

    private LazySingleton() {
    }

    /**
     * 线程不安全的实现方式
     *
     * @return
     */
    public static LazySingleton getLazySingletonUnsafe() {
        if (Objects.isNull(LAZY_SINGLETON)) {
            LAZY_SINGLETON = new LazySingleton();
        }
        return LAZY_SINGLETON;
    }

    /**
     * 线程安全的实现方式
     *
     * @return
     */
    public static synchronized LazySingleton getLazySingletonSafe() {
        if (Objects.isNull(LAZY_SINGLETON)) {
            LAZY_SINGLETON = new LazySingleton();
        }
        return LAZY_SINGLETON;
    }
}
