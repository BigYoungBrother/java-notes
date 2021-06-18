package com.young.design.pattern.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 该类包含对文件的增加、删除和浏览三个方法
 *
 * @author Young
 * @Date 2021-06-14 10:29
 */
public class Folder extends File {

    private List<File> files;

    public Folder(String name) {
        super(name);
        files = new ArrayList<File>();
    }

    /**
     * 浏览文件夹中的文件
     */
    @Override
    public void display() {
        for (File file : files) {
            file.display();
        }
    }

    /**
     * 向文件夹中添加文件
     *
     * @param file
     * @return void
     */
    public void add(File file) {
        files.add(file);
    }

    /**
     * 从文件夹中删除文件
     *
     * @param file
     * @return void
     */
    public void remove(File file) {
        files.remove(file);
    }

}
