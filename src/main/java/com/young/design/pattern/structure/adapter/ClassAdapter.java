package com.young.design.pattern.structure.adapter;

/**
 * 类适配器
 *
 * @author Young
 * @Date 2021-05-31 21:27
 */
public class ClassAdapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.adapteeRequest();
    }
}
