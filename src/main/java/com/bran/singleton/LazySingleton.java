package com.bran.singleton;

/**
 * @author antiumbo
 * @date on 2018/5/20
 **/
public class LazySingleton {

    private static LazySingleton singleton;

    private LazySingleton() {
    }

    public static synchronized LazySingleton getInstance() {
        if (singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;

    }
}
