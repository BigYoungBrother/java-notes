package com.young.design.pattern.behavior.decorator;

/**
 * 装饰器测试类
 *
 * @author Young
 * @Date 2021-06-14 11:33
 */
public class DecoratorTest {

    public static void main(String[] args) {
        ConcreteApple concreteApple = new ConcreteApple();
        concreteApple.description();
        System.out.println("#####");
        AppleDecoratorA appleDecoratorA = new AppleDecoratorA(concreteApple);
        appleDecoratorA.description();
        System.out.println("#####");
        AppleDecoratorB appleDecoratorB = new AppleDecoratorB(concreteApple);
        appleDecoratorB.description();
    }
}
