package com.young.design.pattern.behavior.bridge;

/**
 * MySQL驱动
 *
 * @author Young
 * @Date 2021-06-01 21:17
 */
public class MySqlDbDriver implements DbDriver {
    @Override
    public void execute(String sqlStr) {
        System.out.println(String.format("I am MySQL: %s", sqlStr));
    }
}
