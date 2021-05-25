package com.young.design.pattern.creational.singleton;

/**
 * 单例模式 -- 静态内部类
 *
 * @author Young
 * @Date 2021-05-25 20:48
 */
public class StaticInnerClassSingleton {

    private static class SingletonHolder{
        private static final StaticInnerClassSingleton STATIC_INNER_CLASS_SINGLETON = new StaticInnerClassSingleton();
    }

    private StaticInnerClassSingleton() {
    }

    public static StaticInnerClassSingleton getInstance(){
        return SingletonHolder.STATIC_INNER_CLASS_SINGLETON;
    }
}
