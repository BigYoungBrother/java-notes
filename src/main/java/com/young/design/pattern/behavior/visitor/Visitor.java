package com.young.design.pattern.behavior.visitor;

/**
 * 定义了一个 Visitor 接口，该接口有两个 visit 函数，参数分别是 Engineer、Manager，也就是说对于 Engineer、Manager 的访问会调用两个不同的方法，以此达成区别对待、差异化处理。
 *
 * @author Young
 * @Date 2021-06-20 20:04
 */
public interface Visitor {
    /**
     * 访问工程师类型
     *
     * @param engineer
     */
    void visit(Engineer engineer);

    /**
     * 访问经理类型
     *
     * @param manager
     */
    void visit(Manager manager);
}
