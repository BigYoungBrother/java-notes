package com.young.design.pattern.creational.factory.factory;

import com.young.design.pattern.creational.factory.elegoods.phone.Phone;
import com.young.design.pattern.creational.factory.elegoods.phone.impl.XiaoMiPhoneImpl;

/**
 * 小米手机工厂
 *
 * @author Young
 * @Date 2021-03-27 22:35
 */
public class XiaoMiPhoneFactory implements PhoneFactory {


    @Override
    public Phone getPhone() {
        return new XiaoMiPhoneImpl();
    }
}
