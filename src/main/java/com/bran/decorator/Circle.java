package com.bran.decorator;

/**
 * @author antiumbo
 * @date on 2018/5/25
 **/
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape:Circle");
    }
}
