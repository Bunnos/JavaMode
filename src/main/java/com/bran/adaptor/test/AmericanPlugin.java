package com.bran.adaptor.test;

/**
 * @author antiumbo
 * @date on 2018/5/24
 **/
public class AmericanPlugin implements AmericanStandard {
    private Adapter adapter;

    /**
     * 美国插座上插上适配器
     * @param adapter
     */
    public AmericanPlugin(Adapter adapter){
        this.adapter = adapter;
    }

    /**
     * 用适配器的方法输出
     */
    @Override
    public void out110v() {
        adapter.out110v();
//        System.out.println("110v");
    }
}
