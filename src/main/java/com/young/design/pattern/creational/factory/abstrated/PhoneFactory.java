package com.young.design.pattern.creational.factory.abstrated;

import com.young.design.pattern.creational.factory.elegoods.computer.Computer;
import com.young.design.pattern.creational.factory.elegoods.phone.impl.HuaWeiPhoneImpl;
import com.young.design.pattern.creational.factory.elegoods.phone.impl.OppoPhoneImpl;
import com.young.design.pattern.creational.factory.elegoods.phone.Phone;
import com.young.design.pattern.creational.factory.elegoods.phone.impl.VivoPhoneImpl;
import com.young.design.pattern.creational.factory.elegoods.phone.impl.XiaoMiPhoneImpl;

/**
 * 手机工厂
 *
 * @author Young
 * @Date 2021-03-28 13:15
 */
public class PhoneFactory implements ElectronicGoodsFactory {
    @Override
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

    @Override
    public Computer getComputer(String computerName) {
        return null;
    }
}
