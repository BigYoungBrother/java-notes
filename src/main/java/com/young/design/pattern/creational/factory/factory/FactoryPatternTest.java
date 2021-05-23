package com.young.design.pattern.creational.factory.factory;

import com.young.design.pattern.creational.factory.elegoods.phone.Phone;

/**
 * 工厂方法测试类
 *
 * @author Young
 * @Date 2021-03-27 22:40
 */
public class FactoryPatternTest {

    public static void main(String[] args) {
        // 从华为手机工厂中取华为手机
        PhoneFactory huaWeiPhoneFactory = new HuaWeiPhoneFactory();
        Phone huaWeiPhone = huaWeiPhoneFactory.getPhone();
        System.out.println(huaWeiPhone.getName());

        // 从小米手机工厂中取小米手机
        PhoneFactory xiaoMiPhoneFactory = new XiaoMiPhoneFactory();
        Phone xiaoMiPhone = xiaoMiPhoneFactory.getPhone();
        System.out.println(xiaoMiPhone.getName());

    }

}
