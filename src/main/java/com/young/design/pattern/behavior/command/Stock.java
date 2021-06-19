package com.young.design.pattern.behavior.command;

/**
 * Stock请求类
 *
 * @author Young
 * @Date 2021-06-19 14:05
 */
public class Stock {

    private String name = "ABC";

    private int quantity = 10;

    public void buy(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] bought");
    }
    public void sell(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] sold");
    }
}
