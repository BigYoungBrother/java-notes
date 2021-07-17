package com.young.bean.load;

/**
 * 循环依赖测试B
 *
 * @author Young
 * @Date 2021-06-29 23:00
 */
public class LoopClassB {
    private LoopClassA loopClassA;

    public LoopClassA getLoopTestA() {
        return loopClassA;
    }

    public void setLoopTestA(LoopClassA loopClassA) {
        this.loopClassA = loopClassA;
    }
}
