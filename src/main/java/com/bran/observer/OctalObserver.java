package com.bran.observer;

/**
 * @author antiumbo
 * @date on 2018/5/30
 **/
public class OctalObserver extends Observer {
    public OctalObserver(Subject subject) {
        super(subject);
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: "
                + Integer.toOctalString(subject.getState()));
    }
}
