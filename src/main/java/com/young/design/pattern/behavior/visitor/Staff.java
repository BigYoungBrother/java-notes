package com.young.design.pattern.behavior.visitor;

import java.util.Random;

/**
 * 员工基类  Staff 类定义了员工基本信息及一个 accept 方法，accept 方法表示接受访问者的访问，由子类具体实现。Visitor 是个接口，传入不同的实现类，可访问不同的数据。
 *
 * @author Young
 * @Date 2021-06-20 19:57
 */
public abstract class Staff {

    public String name;

    /**
     * 员工KPI
     */
    public int kpi;

    public Staff(String name) {
        this.name = name;
        kpi = new Random().nextInt(10);
    }

    /**
     * 核心方法，接受Visitor的访问
     *
     * @param visitor
     */
    public abstract void accept(Visitor visitor);

}
