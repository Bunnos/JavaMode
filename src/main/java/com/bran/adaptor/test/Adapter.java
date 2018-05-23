package com.bran.adaptor.test;

/**
 * @author antiumbo
 * @date on 2018/5/23
 **/
public class Adapter implements AmericaStandard { // 适配器首先要实现需要调用者的接口

    /**
     * 组合要适配的接口
     */
    private ChineseStandard chineseStandard;

    public Adapter(ChineseStandard chineseStandard) {
        // 实现要适配的接口
       this.chineseStandard = chineseStandard;
    }

    @Override
    public void print110V() {
        // 调用要适配的方法
        chineseStandard.print220V();
    }
}
