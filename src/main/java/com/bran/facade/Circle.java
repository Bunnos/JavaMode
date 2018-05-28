package com.bran.facade;

/**
 * @author antiumbo
 * @date on 2018/5/28
 **/
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("circle::draw()");
    }
}
