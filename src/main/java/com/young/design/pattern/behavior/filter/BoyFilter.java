package com.young.design.pattern.behavior.filter;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 男生过滤器
 *
 * @author Young
 * @Date 2021-06-02 21:24
 */
public class BoyFilter implements Filter{
    @Override
    public List<Person> filter(List<Person> persons) {
        return persons.stream().filter(person ->
                "男".equals(person.getGender())
        ).collect(Collectors.toList());
    }
}
