package com.bran.bridge;

/**
 * @author antiumbo
 * @date on 2018/5/24
 **/
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("RedCircle radius = [" + radius + "], x = [" + x + "], y = [" + y + "]");
    }
}
