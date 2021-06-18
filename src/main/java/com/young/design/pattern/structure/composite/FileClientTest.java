package com.young.design.pattern.structure.composite;

/**
 * 组合模式测试类
 *
 * @author Young
 * @Date 2021-06-14 10:37
 */
public class FileClientTest {

    public static void main(String[] args) {
        //总文件夹
        Folder folder = new Folder("总文件夹");
        //向总文件夹中放入三个文件：a.txt、b.jpg、c文件夹
        TextFile aText = new TextFile("a.txt");
        ImageFile bImage = new ImageFile("b.jpg");
        Folder cFolder = new Folder("C文件夹");

        folder.add(aText);
        folder.add(bImage);
        folder.add(cFolder);

        //向C文件夹中添加文件：c_1.txt、c_1.rmvb、c_1.jpg
        TextFile cText = new TextFile("c_1.txt");
        ImageFile cImage = new ImageFile("c_1.jpg");
        VideoFile cVideo = new VideoFile("c_1.rmvb");

        cFolder.add(cText);
        cFolder.add(cImage);
        cFolder.add(cVideo);

        //遍历总文件夹
        folder.display();
        //将c_1.txt删除
        cFolder.remove(cText);
        System.out.println("-----------------------");
        // 再遍历总文件夹
        folder.display();
    }
}
