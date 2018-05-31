package com.bran.observer.test;

/**
 * @author antiumbo
 * @date on 2018/5/31
 **/
public class ObserverTwo extends MainObserver {
    public ObserverTwo(MainClass mainClass) {
        super(mainClass);
        mainClass.add(this);
    }

    @Override
    public void update() {
        System.out.println("Two:" + mainClass.getProperty());
    }
}
