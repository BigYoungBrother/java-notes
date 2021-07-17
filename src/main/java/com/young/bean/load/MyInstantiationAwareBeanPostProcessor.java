package com.young.bean.load;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

import java.beans.PropertyDescriptor;

/**
 * InstantiationAwareBeanPostProcessor
 *
 * @author Young
 * @Date 2021-07-17 16:01
 */
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        System.out.println("InstantiationAwareBeanPostProcessor#postProcessBeforeInstantiation(Class<?> beanClass, String beanName)\n可以使用返回值替换bean, 即返回的bean就是IOC容器中缓存的bean，返回值不为null, 不会执行下面流程中的方法了");
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        System.out.println("InstantiationAwareBeanPostProcessor#postProcessAfterInstantiation(Object bean, String beanName)\nbean实例化之后, 返回true即需要设置properties，否则不会设置properties, 包括自动注入的属性");
        return true;
    }

    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        System.out.println("InstantiationAwareBeanPostProcessor#postProcessProperties(PropertyValues pvs, Object bean, String beanName)\n可以修改属性值，如果不需要修改就返回null, 否则实际返回的就是修改后的属性值");
        return null;
    }

    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
        System.out.println("InstantiationAwareBeanPostProcessor#postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName)\nspring5.1之后即废弃该方法, 而在postProcessProperties中返回属性值");
        return pvs;
    }
}
