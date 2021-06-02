package com.young.design.pattern.behavior.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤器测试
 *
 * @author Young
 * @Date 2021-06-02 21:25
 */
public class FilterTest {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>(15);
        for (int i = 0; i < 10 ; i++) {
            if (i<5) {
                persons.add(new Person(String.valueOf(i), "男"));
            }else {
                persons.add(new Person(String.valueOf(i), "女"));
            }
        }
        Filter boyFilter = new BoyFilter();
        //筛选出男同胞们
        persons = boyFilter.filter(persons);
        persons.forEach(person->System.out.println(person.toString()));
    }
}
