package com.young.design.pattern.structure.adapter;

/**
 * 抽象适配器类
 *
 * @author Young
 * @Date 2021-05-31 21:39
 */
public abstract class AbstractInterfaceAdapter implements InterfaceAdapterTarget {

    @Override
    public void uselessMethod() {
        System.out.println("uselessMethod");
    }
}
