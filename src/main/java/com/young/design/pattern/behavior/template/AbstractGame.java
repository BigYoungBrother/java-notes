package com.young.design.pattern.behavior.template;

/**
 * 游戏模板类
 *
 * @author Young
 * @Date 2021-06-19 14:19
 */
public abstract class AbstractGame {
    /**
     * 玩游戏的模板方法
     */
    public final void play(){
        //初始化游戏
        initialize();
        //开始游戏
        startPlay();
        //结束游戏
        endPlay();
    }

    /**
     * 初始化游戏
     */
    abstract void initialize();

    /**
     * 开始游戏
     */
    abstract void startPlay();

    /**
     * 结束游戏
     */
    abstract void endPlay();
}
