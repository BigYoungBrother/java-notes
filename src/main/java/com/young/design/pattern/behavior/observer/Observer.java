package com.young.design.pattern.behavior.observer;

/**
 * 观察者接口
 *
 * @author Young
 * @Date 2021-06-19 14:40
 */
public interface Observer {
    /**
     * 更新消息
     *
     * @param message
     */
    void update(String message);
}
