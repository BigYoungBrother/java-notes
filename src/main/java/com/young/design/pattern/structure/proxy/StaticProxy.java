package com.young.design.pattern.structure.proxy;

/**
 * 静态代理类
 *
 * @author Young
 * @Date 2021-06-14 18:38
 */
public class StaticProxy implements Subject {
    private Subject subject = null;

    @Override
    public void operate() {
        if (subject == null) {
            subject = new RealSubject();
        }
        System.out.print("I'm Proxy, I'm invoking...");
        this.subject.operate();
    }
}
