package com.bran.bridge.test;

/**
 * @author antiumbo
 * @date on 2018/5/24
 **/
public class ConcreteImpl implements Implementor {
    @Override
    public void someOperation() {
        System.out.println("ConcreteImpl Method");
    }
}
