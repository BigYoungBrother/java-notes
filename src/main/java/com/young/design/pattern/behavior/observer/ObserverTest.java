package com.young.design.pattern.behavior.observer;

/**
 * 观察者模式测试
 *
 * @author Young
 * @Date 2021-06-19 14:47
 */
public class ObserverTest {

    public static void main(String[] args) {
        //被观察者
        Subject server = new WechatServerSubject();

        //定义三个观察者
        Observer userZhang = new User("ZhangSan");
        Observer userLi = new User("LiSi");
        Observer userWang = new User("WangWu");
        //观察者注册到 被观察者
        server.registerObserver(userZhang);
        server.registerObserver(userLi);
        server.registerObserver(userWang);
        server.notifyObserver("PHP是世界上最好用的语言！");

        System.out.println("----------------------------------------------");
        //被观察者状态改变， 依次通知观察者
        server.notifyObserver("JAVA是世界上最好用的语言！");
    }

}
