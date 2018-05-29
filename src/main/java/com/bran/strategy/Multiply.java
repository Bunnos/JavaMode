package com.bran.strategy;

/**
 * @author antiumbo
 * @date on 2018/5/29
 **/
public class Multiply implements Strategy {
    @Override
    public int doOperation(int a, int b) {
        return a * b;
    }
}
