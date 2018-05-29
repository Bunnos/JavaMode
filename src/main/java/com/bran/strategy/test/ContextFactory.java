package com.bran.strategy.test;

/**
 * @author antiumbo
 * @date on 2018/5/29
 **/
public class ContextFactory {

    private ContextFactory() {
    }

    public static Context newInstance(Class<? extends IStrategy> clazz) throws Exception {
        return new Context(clazz.newInstance());
    }
}
