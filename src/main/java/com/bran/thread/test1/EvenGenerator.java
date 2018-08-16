package com.bran.thread.test1;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author antiumbo
 * @date on 2018/8/7
 **/
public class EvenGenerator extends IntGenerator {
    private AtomicInteger currentEvenValue = new AtomicInteger(0);

    @Override
    public synchronized int next() {
        return currentEvenValue.addAndGet(2);
    }

    public static void main(String[] args) {
//        EvenChecker.test(new EvenGenerator());
        EvenChecker.test(new EvenGenerator());
    }
}
