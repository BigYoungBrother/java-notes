package com.young.design.pattern.behavior.visitor;

/**
 * CTO访问者
 *
 * @author Young
 * @Date 2021-06-20 20:06
 */
public class CTOVisitor implements Visitor {

    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师: " + engineer.name + ", 代码行数: " + engineer.getCodeLines());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("经理: " + manager.name + ", 产品数量: " + manager.getProducts());
    }
}
