package com.young.design.pattern.creational.factory.factory;

import com.young.design.pattern.creational.factory.elegoods.phone.impl.OppoPhoneImpl;
import com.young.design.pattern.creational.factory.elegoods.phone.Phone;

/**
 * OPPO手机工厂
 *
 * @author Young
 * @Date 2021-03-27 22:38
 */
public class OppoPhoneFactory implements PhoneFactory {
    @Override
    public Phone getPhone() {
        return new OppoPhoneImpl();
    }
}
