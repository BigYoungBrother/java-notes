package com.young.design.pattern.creational.factory.abstrated;

import com.young.design.pattern.creational.factory.elegoods.computer.Computer;
import com.young.design.pattern.creational.factory.elegoods.phone.Phone;

/**
 * 电子产品工厂(超级工厂)
 *
 * @author Young
 * @Date 2021-03-28 13:12
 */
public interface ElectronicGoodsFactory {

    /**
     * 制造手机
     *
     * @param phoneName
     * @return
     */
    Phone getPhone(String phoneName);

    /**
     * 制造电脑
     *
     * @param computerName
     * @return
     */
    Computer getComputer(String computerName);

}
