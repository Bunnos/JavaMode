package com.bran.thread.test1;

/**
 * @author antiumbo
 * @date on 2018/8/7
 **/
public abstract class IntGenerator {
    private volatile boolean canceled = false;

    public abstract int next();

    public void cancel() {
        canceled = true;
    }

    public boolean isCanceled() {
        return canceled;
    }
}
