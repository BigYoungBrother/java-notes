package com.young.design.pattern.structure.proxy;

/**
 * 动态代理测试类
 *
 * @author Young
 * @Date 2021-06-14 18:56
 */
public class DynamicProxyTest {

    public static void main(String[] args) {
        Subject subject = (Subject) new DynamicProxy().newProxyInstance(new RealSubject());
        subject.operate();
    }

}
