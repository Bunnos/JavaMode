package com.bran.observer;

/**
 * @author antiumbo
 * @date on 2018/5/30
 **/
public class HexaObserver extends Observer {
    public HexaObserver(Subject subject) {
        super(subject);
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: "
                + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
