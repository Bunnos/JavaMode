package com.bran.singleton;

/**
 * @author antiumbo
 * @date on 2018/5/20
 **/
public class HungrySingleton {

    private static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
