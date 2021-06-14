package com.young.design.pattern.behavior.composite;

/**
 * 文本文件
 *
 * @author Young
 * @Date 2021-06-14 10:32
 */
public class TextFile extends File{

    public TextFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("这是文本文件，文件名：" + super.getName());
    }
}
