package com.bran.thread;

/**
 * @author antiumbo
 * @date on 2018/6/12
 **/
public class ThreadOne implements Runnable {
    @Override
    public void run() {
        User user = new User();
        try {
            user.wait();
            System.out.println("wait");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
