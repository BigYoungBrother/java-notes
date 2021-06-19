package com.young.design.pattern.behavior.state;

/**
 * 状态接口
 *
 * @author Young
 * @Date 2021-06-19 15:34
 */
public interface State {
    /**
     * 根据状态而采取的动作
     *
     * @param context
     */
    void doAction(Context context);
}
