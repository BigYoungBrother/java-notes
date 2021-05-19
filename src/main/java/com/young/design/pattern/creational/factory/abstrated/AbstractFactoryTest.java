package com.young.design.pattern.creational.factory.abstrated;

import com.young.design.pattern.creational.factory.elegoods.computer.Computer;
import com.young.design.pattern.creational.factory.elegoods.phone.Phone;

/**
 * 抽象工厂测试类
 * @author Young
 * @Date 2021-03-28 13:22
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        // 制造华为电脑
        ElectronicGoodsFactory computerFactory = new ComputerFactory();
        Computer huaWeiComputer = computerFactory.getComputer("HuaWei");
        System.out.println(huaWeiComputer.getName());

        // 制造华为手机
        ElectronicGoodsFactory phoneFactory = new PhoneFactory();
        Phone huaWeiPhone = phoneFactory.getPhone("HuaWei");
        System.out.println(huaWeiPhone.getName());
    }
}
