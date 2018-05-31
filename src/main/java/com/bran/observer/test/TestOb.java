package com.bran.observer.test;

/**
 * @author antiumbo
 * @date on 2018/5/31
 **/
public class TestOb {
    public static void main(String[] args) {
        MainClass mainClass = new MainClass();
        new ObserverOne(mainClass);
        new ObserverTwo(mainClass);
        mainClass.setProperty("shit");
    }
}
