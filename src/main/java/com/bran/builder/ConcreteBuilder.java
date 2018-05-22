package com.bran.builder;

/**
 * @author antiumbo
 * @date on 2018/5/21
 **/
public class ConcreteBuilder implements Builder {

    private Bottle bottle;

    public ConcreteBuilder() {
        bottle = new Bottle();
    }

    public void giveName() {
        bottle.setName("CocaCola");
    }

    public void giveHigh() {
        bottle.setHigh(300);
    }

    public void giveWeight() {
        bottle.setWeight(600);
    }

    public Bottle builder() {
        return bottle;
    }
}
