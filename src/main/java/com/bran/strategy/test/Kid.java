package com.bran.strategy.test;

/**
 * @author antiumbo
 * @date on 2018/5/29
 **/
public class Kid implements IStrategy{
    @Override
    public void move() {
        System.out.println("kids move");
    }
}
