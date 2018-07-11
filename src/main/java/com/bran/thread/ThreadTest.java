package com.bran.thread;

class Music implements Runnable{
    @Override
    public void run() {
        for (int i = 0;i < 50;i ++) {
            System.out.println("音乐" + i);
        }
    }
}
/**
 * @author antiumbo
 * @date on 2018/6/12
 **/
public class ThreadTest {

    public static void main(String[] args) {
        for (int i = 0;i < 50;i ++) {
            System.out.println("游戏" + i);
            if ( i == 10) {
                Thread thread = new Thread(new Music());
                thread.start();
            }
        }
    }
}
