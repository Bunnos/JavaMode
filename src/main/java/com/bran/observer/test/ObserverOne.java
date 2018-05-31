package com.bran.observer.test;

/**
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
