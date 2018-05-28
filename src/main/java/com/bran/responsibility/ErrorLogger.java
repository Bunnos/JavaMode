package com.bran.responsibility;

/**
 * @author antiumbo
 * @date on 2018/5/28
 **/
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error console::Logger:" + message);
    }
}
