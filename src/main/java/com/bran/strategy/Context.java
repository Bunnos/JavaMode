package com.bran.strategy;

/**
 * @author antiumbo
 * @date on 2018/5/29
 **/
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int a, int b) {
        return strategy.doOperation(a, b);
    }
}
