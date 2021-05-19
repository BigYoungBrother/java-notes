package com.young.design.pattern.creational.factory.simple;

import com.young.design.pattern.creational.factory.elegoods.phone.Phone;
import com.young.design.pattern.creational.factory.elegoods.phone.impl.HuaWeiPhoneImpl;
import com.young.design.pattern.creational.factory.elegoods.phone.impl.OppoPhoneImpl;
import com.young.design.pattern.creational.factory.elegoods.phone.impl.VivoPhoneImpl;
import com.young.design.pattern.creational.factory.elegoods.phone.impl.XiaoMiPhoneImpl;

/**
 * 手机工厂--简单工厂
 *
 * @author Young
 * @Date 2021-03-27 22:25
 */
public class PhoneSimpleFactory {

    public Phone getPhone(String phoneName) {
        switch (phoneName) {
            case "VIVO":
                return new VivoPhoneImpl();
            case "XiaoMi":
                return new XiaoMiPhoneImpl();
            case "HuaWei":
                return new HuaWeiPhoneImpl();
            case "OPPO":
                return new OppoPhoneImpl();
            default:
                return null;
        }
    }

}
