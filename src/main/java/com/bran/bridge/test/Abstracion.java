package com.bran.bridge.test;

import org.omg.CORBA.ORB;

/**
 * @author antiumbo
 * @date on 2018/5/24
 **/
public abstract class Abstracion {
    protected Implementor implementor;

    abstract void operation();
}
