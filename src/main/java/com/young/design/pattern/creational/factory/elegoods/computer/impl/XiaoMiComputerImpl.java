package com.young.design.pattern.creational.factory.elegoods.computer.impl;

import com.young.design.pattern.creational.factory.elegoods.computer.Computer;

/**
 * 小米笔记本
 *
 * @author Young
 * @Date 2021-03-28 13:19
 */
public class XiaoMiComputerImpl implements Computer {
    @Override
    public String getName() {
        return "我是小米笔记本";
    }
}
