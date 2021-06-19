package com.young.design.pattern.behavior.iterator;

/**
 * 容器类接口
 *
 * @author Young
 * @Date 2021-06-19 20:28
 */
public interface Container {

    /**
     * 返回迭代器
     *
     * @return
     */
    Iterator getIterator();

}
