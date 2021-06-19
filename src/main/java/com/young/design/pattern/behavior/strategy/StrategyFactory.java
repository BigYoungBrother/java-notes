package com.young.design.pattern.behavior.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * 策略工厂
 *
 * @author Young
 * @Date 2021-06-19 14:33
 */
public class StrategyFactory {

    private static Map<String, Strategy> STRATEGY_MAP;

    static {
        STRATEGY_MAP = new HashMap<>(4);
        STRATEGY_MAP.put("+", new AddStrategy());
        STRATEGY_MAP.put("-", new SubStrategy());
    }

    public Strategy getStrategy(String key) {
        return STRATEGY_MAP.get(key);
    }

}
