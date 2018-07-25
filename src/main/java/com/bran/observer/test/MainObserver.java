package com.bran.observer.test;

/**
 * 观察者类（抽象类）
 * 在构建观察者对象的时候需要把被观察者对象传进来
 * 观察者相应的方法
 * @author antiumbo
 * @date on 2018/5/31
 **/
public abstract class MainObserver {
    protected MainClass mainClass;

    public MainObserver(MainClass mainClass) {
        this.mainClass = mainClass;
    }

    /**
     * 触发方法
     */
    abstract void update();
}
