package com.young.design.pattern.creational.singleton;

import java.util.Objects;

/**
 * 单例模式 -- 双重校验锁
 *
 * @author Young
 * @Date 2021-05-24 22:02
 */
public class DoubleCheckSingleton {

    private volatile static DoubleCheckSingleton DOUBLE_CHECK_SINGLETON = null;

    private DoubleCheckSingleton() {
    }

    /**
     * 线程安全的实现方式（仍然线程不安全）
     *
     * @return
     */
    public static DoubleCheckSingleton getDoubleCheckSingletonSafe() {
        if (Objects.isNull(DOUBLE_CHECK_SINGLETON == null)) {
            // 第一步， 当 LAZY_SINGLETON为null时才对实例化对象的部分进行加锁
            synchronized (DoubleCheckSingleton.class) {
                // 第二步， 一个时刻只有一个线程能到达这里
                if (Objects.isNull(DOUBLE_CHECK_SINGLETON)) {
                    // 第三步，这里还需要进一步判断， 如果线程1和线程2都执行到第一步，然后抢占锁，假设线程1抢到锁，成功进入synchronized代码块并实例化对象。然后实例2进入synchronized代码块中，这时LAZY_SINGLETON已经不是null，如果不进行判断，则对象又会被实例化一次，所以在synchronized代码块中必须进行第二次的实例对象是否为空的判断
                    DOUBLE_CHECK_SINGLETON = new DoubleCheckSingleton();
                }
            }
        }
        return DOUBLE_CHECK_SINGLETON;
    }
}
