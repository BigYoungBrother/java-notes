package com.young.design.pattern.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 微信服务器被观察者
 *
 * @author Young
 * @Date 2021-06-19 14:42
 */
public class WechatServerSubject implements Subject {
    private List<Observer> list;

    public WechatServerSubject() {
        list = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (!list.isEmpty()) {
            list.remove(o);
        }
    }

    @Override
    public void notifyObserver(String message) {
        System.out.println("微信服务更新消息： " + message);
        for (Observer o : list) {
            o.update(message);
        }
    }
}
