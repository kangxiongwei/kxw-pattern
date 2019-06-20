package com.kxw.pattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 记录过程和恢复过程
 */
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}