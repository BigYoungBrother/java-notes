package com.young.design.pattern.behavior.proxy;

/**
 * RealSubject
 *
 * @author Young
 * @Date 2021-06-14 18:37
 */
public class RealSubject implements Subject{
    @Override
    public void operate() {
        System.out.println("RealSubject");
    }
}
