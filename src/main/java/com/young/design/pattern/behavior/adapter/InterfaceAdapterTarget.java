package com.young.design.pattern.behavior.adapter;

/**
 * 接口适配器的目标接口
 *
 * @author Young
 * @Date 2021-05-31 21:38
 */
public interface InterfaceAdapterTarget {

    /**
     * 请求接口
     */
    void request();

    /**
     * 不希望实现的类
     */
    void uselessMethod();

}
