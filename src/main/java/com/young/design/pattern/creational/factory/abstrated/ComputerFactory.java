package com.young.design.pattern.creational.factory.abstrated;

import com.young.design.pattern.creational.factory.elegoods.computer.Computer;
import com.young.design.pattern.creational.factory.elegoods.computer.impl.HuaWeiComputerImpl;
import com.young.design.pattern.creational.factory.elegoods.computer.impl.XiaoMiComputerImpl;
import com.young.design.pattern.creational.factory.elegoods.phone.Phone;

/**
 * 电脑工厂
 *
 * @author Young
 * @Date 2021-03-28 13:17
 */
public class ComputerFactory implements ElectronicGoodsFactory {
    @Override
    public Phone getPhone(String phoneName) {
        return null;
    }

    @Override
    public Computer getComputer(String computerName) {
        switch (computerName) {
            case "HuaWei":
                return new HuaWeiComputerImpl();
            case "XiaoMi":
                return new XiaoMiComputerImpl();
            default:
                return null;
        }
    }
}
