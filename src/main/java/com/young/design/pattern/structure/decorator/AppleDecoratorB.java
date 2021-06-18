package com.young.design.pattern.structure.decorator;

/**
 * Apple装饰器 B
 *
 * @author Young
 * @Date 2021-06-14 11:25
 */
public class AppleDecoratorB extends AppleDecorator{

    public AppleDecoratorB(Apple apple) {
        super(apple);
    }

    @Override
    public void description() {
        System.out.println("绿色苹果B");
        super.description();
    }
}
