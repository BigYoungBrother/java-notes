package com.young.design.pattern.behavior.decorator;

/**
 * 普通苹果实现
 *
 * @author Young
 * @Date 2021-06-14 11:19
 */
public class ConcreteApple implements Apple{
    @Override
    public void description() {
        System.out.println("普通的苹果");
    }
}
