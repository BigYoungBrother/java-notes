package com.young.design.pattern.behavior.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 备忘录列表
 *
 * @author Young
 * @Date 2021-06-20 20:15
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
