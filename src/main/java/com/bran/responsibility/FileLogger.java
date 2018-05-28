package com.bran.responsibility;

/**
 * @author antiumbo
 * @date on 2018/5/28
 **/
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("file console::Logger:" + message);
    }
}
