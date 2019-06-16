package com.kxw.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kangxiongwei
 * @date 2019/6/16 8:45 AM
 */
public class Subject {

    private List<Observer> observerList = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        this.notifyAllObservers();
    }

    public void attach(Observer observer){
        observerList.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observerList) {
            observer.update();
        }
    }

}
