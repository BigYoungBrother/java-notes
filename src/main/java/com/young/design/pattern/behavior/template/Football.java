package com.young.design.pattern.behavior.template;

/**
 * 实现类2
 *
 * @author Young
 * @Date 2021-06-19 14:21
 */
public class Football extends AbstractGame{
    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
}
