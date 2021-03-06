package com.young.design.pattern.structure.filter;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 女生过滤器
 *
 * @author Young
 * @Date 2021-06-02 21:23
 */
public class GirlFilter implements Filter {
    @Override
    public List<Person> filter(List<Person> persons) {
        return persons.stream().filter(person ->
                "女".equals(person.getGender())
        ).collect(Collectors.toList());
    }
}
