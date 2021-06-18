package com.young.design.pattern.structure.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 *
 * @author Young
 * @Date 2021-06-14 18:54
 */
public class DynamicProxy implements InvocationHandler {
    Object obj = null;

    public Object newProxyInstance(Object realObj) {
        this.obj = realObj;
        Class<?> classType = realObj.getClass();
        return Proxy.newProxyInstance(classType.getClassLoader(), classType.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.print("I'm Proxy, I'm invoking...");
        method.invoke(obj, args);
        System.out.println("invoke end!");
        return null;
    }
}
