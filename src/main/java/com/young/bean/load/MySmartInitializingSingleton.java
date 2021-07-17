package com.young.bean.load;

import org.springframework.beans.factory.SmartInitializingSingleton;

/**
 * SmartInitializingSingleton
 *
 * @author Young
 * @Date 2021-07-17 16:44
 */
public class MySmartInitializingSingleton implements SmartInitializingSingleton {
    @Override
    public void afterSingletonsInstantiated() {
        System.out.println("SmartInitializingSingleton#afterSingletonsInstantiated()");
    }
}
