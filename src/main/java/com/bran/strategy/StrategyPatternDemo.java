package com.bran.strategy;

/**
 * @author antiumbo
 * @date on 2018/5/29
 **/
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new Add());
        int i = context.executeStrategy(1, 2);

        context = new Context(new Substract());
        int i1 = context.executeStrategy(3, 1);

        context = new Context(new Multiply());
        int i2 = context.executeStrategy(3, 2);

        System.out.println(i);
        System.out.println(i1);
        System.out.println(i2);
    }
}
