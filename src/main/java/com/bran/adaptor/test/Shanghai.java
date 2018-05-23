package com.bran.adaptor.test;

/**
 * @author antiumbo
 * @date on 2018/5/23
 **/
public class Shanghai implements ChineseStandard {

    @Override
    public void print220V() {
        System.out.println("选择");
    }

    public static void main(String[] args) {
        LosAngeles shanghai = new LosAngeles();
        shanghai.print110V();
    }
}
