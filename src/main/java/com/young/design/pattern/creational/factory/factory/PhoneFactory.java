package com.young.design.pattern.creational.factory.factory;

import com.young.design.pattern.creational.factory.elegoods.phone.Phone;

/**
 * 手机工厂接口
 *
 * @author Young
 * @Date 2021-03-27 22:35
 */
public interface PhoneFactory {
    /**
     * 返回手机对象
     *
     * @return
     */
    Phone getPhone();
}
