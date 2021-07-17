package com.young.bean.load;

/**
 * 循环依赖测试A
 *
 * @author Young
 * @Date 2021-06-29 23:00
 */
public class LoopClassA {
    private LoopClassB loopClassB;

    public LoopClassB getLoopClassB() {
        return loopClassB;
    }

    public void setLoopClassB(LoopClassB loopClassB) {
        this.loopClassB = loopClassB;
    }
}
