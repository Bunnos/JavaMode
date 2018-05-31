package com.bran.observer;

/**
 * @author antiumbo
 * @date on 2018/5/30
 **/
public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject){
        super(subject);
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}
