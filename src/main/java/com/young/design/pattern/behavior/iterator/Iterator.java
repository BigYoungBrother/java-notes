package com.young.design.pattern.behavior.iterator;

/**
 * 迭代器类
 *
 * @author Young
 * @Date 2021-06-19 20:27
 */
public interface Iterator {
    /**
     * 是否有下一个
     *
     * @return
     */
    public boolean hasNext();

    /**
     * 下一个
     *
     * @return
     */
    public Object next();
}
