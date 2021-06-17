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
        // 为面试而准备的Bean生命周期加载过程
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean-Lifecycle.xml");
        Book book = (Book) context.getBean("book");
        System.out.println("Book name = " + book.getBookName());
        ((ClassPathXmlApplicationContext) context).destroy();
    }
}
