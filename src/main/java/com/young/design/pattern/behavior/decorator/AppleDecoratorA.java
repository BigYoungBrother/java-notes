package com.young.design.pattern.behavior.decorator;

/**
 * Apple装饰器 A
 *
 * @author Young
 * @Date 2021-06-14 11:24
 */
public class AppleDecoratorA extends AppleDecorator{

    public AppleDecoratorA(Apple apple) {
        super(apple);
    }

    @Override
    public void description() {
        System.out.println("红色苹果A");
        super.description();
    }
}
