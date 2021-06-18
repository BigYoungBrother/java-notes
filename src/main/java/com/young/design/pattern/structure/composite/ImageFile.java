package com.young.design.pattern.structure.composite;

/**
 * 图像文件
 *
 * @author Young
 * @Date 2021-06-14 10:35
 */
public class ImageFile extends File{

    public ImageFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("这是图像文件，文件名：" + super.getName());
    }
}
