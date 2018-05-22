package com.bran.singleton;

/**
 * @author antiumbo
 * @date on 2018/5/21
 **/
public class InnerStaticClassSingleton {

    private static class BuilderHolder {
        private static final InnerStaticClassSingleton INSTANCE = new InnerStaticClassSingleton();
    }

    private InnerStaticClassSingleton() {
    }

    public static InnerStaticClassSingleton getInstance() {
        return BuilderHolder.INSTANCE;
    }
}
