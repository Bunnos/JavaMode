package com.bran.bridge;

/**
 * @author antiumbo
 * @date on 2018/5/24
 **/
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
