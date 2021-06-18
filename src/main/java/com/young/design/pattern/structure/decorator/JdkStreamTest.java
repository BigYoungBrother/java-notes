package com.young.design.pattern.structure.decorator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Jdk中装饰器测试类
 *
 * @author Young
 * @Date 2021-06-14 11:25
 */
public class JdkStreamTest {

    public static void main(String[] args) throws IOException {
        File file = new File("test1.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        //只能读取一个character
        System.out.println(fileReader.read());
        //只能读取一个character
        System.out.println(bufferedReader.read());
        //可以读取一行
        System.out.println(bufferedReader.readLine());
    }
}
