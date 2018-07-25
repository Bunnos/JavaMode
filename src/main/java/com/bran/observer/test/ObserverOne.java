package com.bran.observer.test;

/**
 * 在构造观察者的时候，将观察者增加到被观察者列表里面
 * @author antiumbo
 * @date on 2018/5/31
 **/
public class ObserverOne extends MainObserver {
    public ObserverOne(MainClass mainClass) {
        super(mainClass);
        mainClass.add(this);
    }

    @Override
    public void update() {
        System.out.println("One:" + mainClass.getProperty());
    }
}
