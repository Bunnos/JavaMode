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

    @Override
    public void giveName() {
        bottle.setName("CocaCola");
    }

    @Override
    public void giveHigh() {
        bottle.setHigh(300);
    }

    @Override
    public void giveWeight() {
        bottle.setWeight(600);
    }

    @Override
    public Bottle builder() {
        return bottle;
    }
}
