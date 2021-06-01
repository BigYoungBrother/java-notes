package com.young.design.pattern.behavior.bridge;

/**
 * 数据库驱动桥接的桥
 *
 * @author Young
 * @Date 2021-06-01 21:20
 */
public class DbDriverBridge {

    private DbDriver dbDriver;

    public void setDbDriver(DbDriver dbDriver) {
        this.dbDriver = dbDriver;
    }

    /**
     * 执行SQL
     *
     * @param sqlStr
     */
    public void execute(String sqlStr) {
        dbDriver.execute(sqlStr);
    }

}
