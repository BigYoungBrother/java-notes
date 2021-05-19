package com.young.design.pattern.creational.factory.elegoods.computer.impl;

import com.young.design.pattern.creational.factory.elegoods.computer.Computer;

/**
 * 华为电脑
 * @author Young
 * @Date 2021-03-28 13:18
 */
public class HuaWeiComputerImpl implements Computer {
    @Override
    public String getName() {
        return "我是华为笔记本电脑";
    }
}
