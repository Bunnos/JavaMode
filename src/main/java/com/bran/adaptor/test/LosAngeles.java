package com.bran.adaptor.test;

/**
 * @author antiumbo
 * @date on 2018/5/23
 **/
public class LosAngeles implements AmericaStandard {
    Adapter adapter;
    @Override
    public void print110V() {
        adapter = new Adapter(new Shanghai());
        adapter.print110V();
        System.out.println("正常");
    }
}
