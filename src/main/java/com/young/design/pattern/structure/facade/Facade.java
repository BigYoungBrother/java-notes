package com.young.design.pattern.structure.facade;

/**
 * 外观模式封装上班
 *
 * @author Young
 * @Date 2021-06-14 16:32
 */
public class Facade {
    Sign sign = new Sign();
    Browser browser = new Browser();
    Idea idea = new Idea();

    public void work() {
        sign.signIn();
        browser.open();
        idea.open();
    }

    public void goHome() {
        sign.signOut();
        browser.close();
        idea.close();
    }
}
