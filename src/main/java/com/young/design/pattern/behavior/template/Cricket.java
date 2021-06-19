package com.young.design.pattern.behavior.template;

/**
 * 实现类1
 *
 * @author Young
 * @Date 2021-06-19 14:21
 */
public class Cricket extends AbstractGame {
    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }
}
