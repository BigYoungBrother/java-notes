package com.young.design.pattern.creational.factory.elegoods.phone.impl;

import com.young.design.pattern.creational.factory.elegoods.phone.Phone;

/**
 * 小米手机
 *
 * @author Young
 * @Date 2021-03-27 22:09
 */
public class XiaoMiPhoneImpl implements Phone {
    @Override
    public String getName() {
        return "我是小米手机";
    }
}
