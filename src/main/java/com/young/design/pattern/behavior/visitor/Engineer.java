package com.young.design.pattern.behavior.visitor;

import java.util.Random;

/**
 * 工程师
 *
 * @author Young
 * @Date 2021-06-20 19:59
 */
public class Engineer extends Staff {
    public Engineer(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    /**
     * 工程师一年的代码数量
     *
     * @return
     */
    public int getCodeLines() {
        return new Random().nextInt(10 * 10000);
    }
}
