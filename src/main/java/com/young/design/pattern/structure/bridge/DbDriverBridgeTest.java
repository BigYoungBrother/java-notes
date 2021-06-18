package com.young.design.pattern.structure.bridge;

/**
 * 桥接模式测试类
 *
 * @author Young
 * @Date 2021-06-01 21:21
 */
public class DbDriverBridgeTest {

    public static void main(String[] args) {
        DbDriver oracleDriver = new OracleDbDriver();
        DbDriver mySqlDriver = new MySqlDbDriver();

        DbDriverBridge dbDriverBridge = new DbDriverBridge();
        dbDriverBridge.setDbDriver(mySqlDriver);
        dbDriverBridge.execute("MySQL");

        dbDriverBridge.setDbDriver(oracleDriver);
        dbDriverBridge.execute("Oracle");

    }

}
