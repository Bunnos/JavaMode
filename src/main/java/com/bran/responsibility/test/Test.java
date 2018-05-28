package com.bran.responsibility.test;

/**
 * @author antiumbo
 * @date on 2018/5/28
 **/
public class Test {
    public static void main(String[] args) {
        HandlerBuilder.buildHandler().doFunction(1).doFunction(15).doFunction(32);
    }
}
