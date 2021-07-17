package com.young.bean.load;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * BeanPostProcessor
 *
 * @author Young
 * @Date 2021-07-17 16:00
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor#postProcessBeforeInitialization(Object bean, String beanName)\nbean实例化和初始化之后，初始化方法执行之前，可以修改bean，比如返回一个包装类，如果不需要修改bean则返回原bean实例");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor#postProcessAfterInitialization(Object bean, String beanName)\nbean的初始化方法执行之后，可以修改bean，比如返回一个包装类，如果不需要修改bean则返回原bean实例");
        return bean;
    }
}
