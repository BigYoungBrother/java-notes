package com.young.design.pattern.structure.composite;

/**
 * 视频文件
 *
 * @author Young
 * @Date 2021-06-14 10:36
 */
public class VideoFile extends File {

    public VideoFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("这是影像文件，文件名：" + super.getName());
    }

}
