package com.bran.singleton;

/**
 * @author antiumbo
 * @date on 2018/5/21
 **/
public class DoubleLockSingleton {
    private static volatile DoubleLockSingleton singleton;

    private DoubleLockSingleton() {

    }

    public static DoubleLockSingleton getInstance() {
        if (singleton == null) {
            synchronized (DoubleLockSingleton.class) {
                if (singleton == null) {
                    singleton = new DoubleLockSingleton();
                }
            }
        }
        return singleton;
    }


}
