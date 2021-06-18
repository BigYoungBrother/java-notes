package com.young.design.pattern.structure.decorator;

/**
 * Apple装饰器
 *
 * @author Young
 * @Date 2021-06-14 11:20
 */
public class AppleDecorator implements Apple{

    private Apple apple;

    public AppleDecorator(Apple apple) {
        super();
        this.apple = apple;
    }

    @Override
    public void description() {
        apple.description();
    }
}
