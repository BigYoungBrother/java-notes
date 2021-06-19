package com.young.design.pattern.behavior.observer;

/**
 * 被观察者接口
 *
 * @author Young
 * @Date 2021-06-19 14:41
 */
public interface Subject {
    /**
     * 注册观察者
     *
     * @param o
     */
    public void registerObserver(Observer o);

    /**
     * 移除观察者
     *
     * @param o
     */
    public void removeObserver(Observer o);

    /**
     * 通知观察者
     *
     * @param message
     */
    public void notifyObserver(String message);
}
