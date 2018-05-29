package com.bran.strategy.test;

/**
 * @author antiumbo
 * @date on 2018/5/29
 **/
public class Context {
    private IStrategy strategy;

    public Context(IStrategy iStrategy) {
        this.strategy = iStrategy;
    }

    public void execute() {
        strategy.move();
    }

    public static void main(String[] args) {

        try {
            Context context = ContextFactory.newInstance(Kid.class);
            context.execute();
            context = ContextFactory.newInstance(Mom.class);
            context.execute();
            context = ContextFactory.newInstance(Dad.class);
            context.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
