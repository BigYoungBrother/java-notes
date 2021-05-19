package com.young.design.pattern.creational.factory.factory;

import com.young.design.pattern.creational.factory.elegoods.phone.impl.HuaWeiPhoneImpl;
import com.young.design.pattern.creational.factory.elegoods.phone.Phone;

/**
 * 华为手机工厂
 * @author Young
 * @Date 2021-03-27 22:34
 */
public class HuaWeiPhoneFactory implements PhoneFactory{

    @Override
    public Phone getPhone(){
        return new HuaWeiPhoneImpl();
    }

}
