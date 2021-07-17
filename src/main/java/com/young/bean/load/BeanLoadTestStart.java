package com.young.bean.load;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * spring bean生命周期测试启动类
 *
 * @author Young
 * @Date 2021-06-17 23:06
 */
public class BeanLoadTestStart {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean-Lifecycle.xml");
        System.out.println("bean已加载完成");

        Book book = (Book) context.getBean("book");
        System.out.println("Book name = " + book.getBookName());

        LoopClassA loopClassA = (LoopClassA) context.getBean("loopClassA");
        LoopClassB loopClassB = (LoopClassB) context.getBean("loopClassB");
        System.out.println(loopClassA.getLoopClassB() == loopClassB);
        System.out.println(loopClassB.getLoopTestA() == loopClassA);

        ((ClassPathXmlApplicationContext) context).close();

    }
}
