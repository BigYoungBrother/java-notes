package com.young.design.pattern.creational.singleton;

/**
 * 单例模式 -- 枚举类
 *
 * @author Young
 * @Date 2021-05-25 20:53
 */
public enum SingletonEnum {

    SINGLETON_ENUM("SINGLETON_ENUM", "枚举单例测试")
    ;

    SingletonEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    private String code;

    private String desc;

    /**
     * 实例执行方法
     */
    public void doSomething() {
        System.out.println(String.format("我是枚举单例...., code: %s, desc: %s", code, desc));
    }

}
