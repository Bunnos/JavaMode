package com.bran.singleton;

/**
 * @author antiumbo
 * @date on 2018/5/21
 **/
public enum EnumSingleton {
    INSTANCE;

    public void print(){
        System.out.println("anything");
    }

    public static void main(String[] args) {
        EnumSingleton.INSTANCE.print();
    }
}
