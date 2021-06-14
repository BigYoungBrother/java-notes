package com.young.design.pattern.behavior.composite;

/**
 * File抽象类
 *
 * @author Young
 * @Date 2021-06-14 10:28
 */
public abstract class File {

    String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 显示文件属性
     */
    public abstract void display();

}
