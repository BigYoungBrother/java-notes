package com.young.design.pattern.structure.adapter;

/**
 * 抽象适配器的适配器类
 *
 * @author Young
 * @Date 2021-05-31 21:40
 */
public class InterfaceAdapter extends AbstractInterfaceAdapter{
    @Override
    public void request() {
        System.out.println("InterfaceAdapter");
    }
}
