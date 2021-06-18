package com.young.design.pattern.structure.proxy;

/**
 * 静态代理测试类
 *
 * @author Young
 * @Date 2021-06-14 18:48
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        Subject subject = new StaticProxy();
        subject.operate();
    }
}
