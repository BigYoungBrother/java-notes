package com.young.design.pattern.creational.factory.factory;

import com.young.design.pattern.creational.factory.elegoods.phone.Phone;
import com.young.design.pattern.creational.factory.elegoods.phone.impl.VivoPhoneImpl;

/**
 * VIVO手机工厂
 *
 * @author Young
 * @Date 2021-03-27 22:40
 */
public class VivoPhoneFactory implements PhoneFactory {
    @Override
    public Phone getPhone() {
        return new VivoPhoneImpl();
    }
}
