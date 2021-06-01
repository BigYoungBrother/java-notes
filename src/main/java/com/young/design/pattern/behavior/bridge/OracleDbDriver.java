package com.young.design.pattern.behavior.bridge;

/**
 * Oracle
 *
 * @author Young
 * @Date 2021-06-01 21:19
 */
public class OracleDbDriver implements DbDriver{
    @Override
    public void execute(String sqlStr) {
        System.out.println(String.format("I am Oracle: %s", sqlStr));
    }
}
