package com.young.design.pattern.creational.factory.elegoods.phone.impl;

import com.young.design.pattern.creational.factory.elegoods.phone.Phone;

/**
 * Vivo手机
 *
 * @author Young
 * @Date 2021-03-27 22:11
 */
public class VivoPhoneImpl implements Phone {
    @Override
    public String getName() {
        return "我是VIVO手机";
    }
}
