package com.young.design.pattern.behavior.visitor;

import java.util.Random;

/**
 * 经理
 *
 * @author Young
 * @Date 2021-06-20 20:00
 */
public class Manager extends Staff {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    /**
     * 一年做的产品数量
     */
    public int getProducts() {
        return new Random().nextInt(10);
    }
}
