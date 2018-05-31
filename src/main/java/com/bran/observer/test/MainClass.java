package com.bran.observer.test;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者对象
 * 1 需要观察者list
 * 2 增加观察者(list.add())
 * 2 在哪个属性被设置时需要触发观察者相应的事件
 * @author antiumbo
 * @date on 2018/5/31
 **/
public class MainClass {
    private String property;

    public List<MainObserver> observerList = new ArrayList();
    /**
     * 新增观察者
     * @param observer
     */
    public void add(MainObserver observer) {
        observerList.add(observer);
    }

    /**
     * 当set值的时候，触发观察者对应的方法
     * @param property
     */
    public void setProperty(String property) {
        this.property = property;
        // 触发观察者方法
        notifyAllObservers();
    }

    public String getProperty() {
        return property;
    }

    /**
     * 循环通知观察者
     */
    private void notifyAllObservers() {
        for (MainObserver o : observerList) {
            o.update();
        }
    }
}
