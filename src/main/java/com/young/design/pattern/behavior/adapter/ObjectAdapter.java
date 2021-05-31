package com.young.design.pattern.behavior.adapter;

/**
 * 对象适配器
 *
 * @author Young
 * @Date 2021-05-31 21:30
 */
public class ObjectAdapter implements Target{

    /**
     * 适配者是对象适配器的一个属性
     */
    private static final Adaptee ADAPTEE = new Adaptee();

    @Override
    public void request() {
        ADAPTEE.adapteeRequest();
    }
}
