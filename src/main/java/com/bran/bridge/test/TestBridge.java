package com.bran.bridge.test;

/**
 * @author antiumbo
 * @date on 2018/5/24
 **/
public class TestBridge {
    public static void main(String[] args) {
        // 实质是在抽象类中增加接口的类
        Abstracion abstracion = new ConcreteAbstracion(new ConcreteImpl());
        abstracion.operation();
    }
}
