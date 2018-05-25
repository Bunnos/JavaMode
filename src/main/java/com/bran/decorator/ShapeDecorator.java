package com.bran.decorator;

/**
 * @author antiumbo
 * @date on 2018/5/25
 **/
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public abstract void draw();
}
