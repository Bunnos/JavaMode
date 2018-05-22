package com.bran.builder;

/**
 * @author antiumbo
 * @date on 2018/5/21
 **/
public class Director {

    public static Bottle constructBottle(Builder builder) {
        builder.giveName();
        builder.giveHigh();
        builder.giveWeight();
        return builder.builder();
    }

    public static void main(String[] args) {
        Bottle bottle = Director.constructBottle(new ConcreteBuilder());
    }
}
