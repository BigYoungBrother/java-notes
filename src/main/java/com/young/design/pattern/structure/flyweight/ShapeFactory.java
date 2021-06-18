package com.young.design.pattern.structure.flyweight;

import java.util.HashMap;

/**
 * 图形工厂
 *
 * @author Young
 * @Date 2021-06-14 17:52
 */
public class ShapeFactory {

    private static final HashMap<String, Shape> CIRCLE_MAP = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) CIRCLE_MAP.get(color);
        if(circle == null) {
            circle = new Circle(color);
            CIRCLE_MAP.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
