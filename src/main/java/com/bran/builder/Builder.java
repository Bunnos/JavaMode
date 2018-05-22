package com.bran.builder;

/**
 * @author antiumbo
 * @date on 2018/5/21
 **/
public interface Builder {
    void giveName();

    void giveHigh();

    void giveWeight();

    Bottle builder();
}
