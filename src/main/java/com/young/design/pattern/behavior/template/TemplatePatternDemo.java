package com.young.design.pattern.behavior.template;

/**
 * 模板方法测试类
 *
 * @author Young
 * @Date 2021-06-19 14:23
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        AbstractGame game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
