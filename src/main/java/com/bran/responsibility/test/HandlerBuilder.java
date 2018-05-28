package com.bran.responsibility.test;

/**
 * @author antiumbo
 * @date on 2018/5/28
 **/
public class HandlerBuilder {
    public static FunctionHandler buildHandler() {
        FunctionHandler initialHandler = new One();
        initialHandler
                .setNext(Two.class)
                .setNext(Three.class);
        return initialHandler;
    }
}
