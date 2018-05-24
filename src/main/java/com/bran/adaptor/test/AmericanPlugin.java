package com.bran.adaptor.test;

/**
 * @author antiumbo
 * @date on 2018/5/24
 **/
public class AmericanPlugin implements AmericanStandard {
    private Adapter adapter;

    public AmericanPlugin(Adapter adapter){
        this.adapter = adapter;
    }
    @Override
    public void out110v() {
        adapter.out110v();
//        System.out.println("110v");
    }
}
