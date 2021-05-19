package com.young.design.pattern.creational.factory.elegoods.phone.impl;

import com.young.design.pattern.creational.factory.elegoods.phone.Phone;

/**
 * OPPO手机
 *
 * @author Young
 * @Date 2021-03-27 22:23
 */
public class OppoPhoneImpl implements Phone {
    @Override
    public String getName() {
        return "我是OPPO手机";
    }
}
