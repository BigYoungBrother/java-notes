package com.young.design.pattern.creational.factory.elegoods.phone.impl;

import com.young.design.pattern.creational.factory.elegoods.phone.Phone;

/**
 * 华为手机
 *
 * @author Young
 * @Date 2021-03-27 22:13
 */
public class HuaWeiPhoneImpl implements Phone {
    @Override
    public String getName() {
        return "我是华为手机";
    }
}
