package com.bran.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author antiumbo
 * @date on 2018/5/30
 **/
public class Subject {
    /**
     * 观察者集合
     */
    private List<Observer> observers = new ArrayList<>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        // 设置值之后通知观察者
        notifyAllObservers();
    }

    /**
     * 通知观察者
     */
    public void notifyAllObservers(){
        for (Observer observer: observers){
            observer.update();
        }
    }

    /**
     * 增加观察者
     * @param observer
     */
    public void attach(Observer observer){
        observers.add(observer);
    }

}
