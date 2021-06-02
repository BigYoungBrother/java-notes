package com.young.design.pattern.behavior.filter;

import java.util.List;

/**
 * 过滤器接口
 *
 * @author Young
 * @Date 2021-06-02 21:21
 */
public interface Filter {
    /**
     * 过滤方法
     *
     * @param persons
     * @return
     */
    List<Person> filter(List<Person> persons);
}
