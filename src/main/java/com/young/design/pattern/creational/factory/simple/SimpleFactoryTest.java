package com.young.design.pattern.creational.factory.simple;

import com.young.design.pattern.creational.factory.elegoods.phone.Phone;

import java.util.Objects;

/**
 * 简单工厂测试
 *
 * @author Young
 * @Date 2021-03-27 22:30
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        PhoneSimpleFactory phoneSimpleFactory = new PhoneSimpleFactory();
        Phone phone = phoneSimpleFactory.getPhone("HuaWei");
        if (Objects.nonNull(phone)) {
            System.out.println("PhoneName: " + phone.getName());
        }
    }

}
