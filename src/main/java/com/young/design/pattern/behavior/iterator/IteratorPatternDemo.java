package com.young.design.pattern.behavior.iterator;

/**
 * 迭代器测试类
 *
 * @author Young
 * @Date 2021-06-19 20:34
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
