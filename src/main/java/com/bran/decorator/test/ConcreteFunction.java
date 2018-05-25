package com.bran.decorator.test;

/**
 * @author antiumbo
 * @date on 2018/5/25
 **/
public class ConcreteFunction implements IFunction {
    @Override
    public void doFunction() {
        System.out.println("do function");
    }
}
