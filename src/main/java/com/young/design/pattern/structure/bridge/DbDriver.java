package com.young.design.pattern.structure.bridge;

/**
 * 数据库驱动接口
 *
 * @author Young
 * @Date 2021-06-01 21:16
 */
public interface DbDriver {

    /**
     * 执行SQL
     * @param sqlStr
     */
    void execute(String sqlStr);

}
