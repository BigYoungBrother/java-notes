package com.young.design.pattern.behavior.facade;

/**
 * 外观模式测试类
 *
 * @author Young
 * @Date 2021-06-14 16:33
 */
public class FacadeTest {

    public static void main(String[] args) {
        //上班的行为
        Sign sign = new Sign();
        sign.signIn();
        Browser browser = new Browser();
        browser.open();
        Idea idea = new Idea();
        idea.open();

        //使用外观模式
        Facade facade = new Facade();
        facade.work();
    }

}
