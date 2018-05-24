package com.bran.adaptor.test;

/**
 * @author antiumbo
 * @date on 2018/5/24
 **/
public class TestAdapter {
    public static void main(String[] args) {
        Adapter adapter = new Adapter(new ChinesePlugin());
        AmericanStandard americanPlugin = new AmericanPlugin(adapter);
        americanPlugin.out110v();
    }
}
