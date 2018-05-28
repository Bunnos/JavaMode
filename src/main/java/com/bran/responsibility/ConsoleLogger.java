package com.bran.responsibility;

/**
 * @author antiumbo
 * @date on 2018/5/28
 **/
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("standard console::Logger:" + message);
    }
}
