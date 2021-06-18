package com.young.design.pattern.structure.adapter;

/**
 * 测试类
 *
 * @author Young
 * @Date 2021-05-31 21:28
 */
public class AdapterTest {

    public static void main(String[] args) {
        Target adapterTarget = new ClassAdapter();
        adapterTarget.request();

        Target objectAdapter = new ObjectAdapter();
        objectAdapter.request();

        InterfaceAdapterTarget interfaceAdapterTarget = new InterfaceAdapter();
        interfaceAdapterTarget.request();
    }
}
