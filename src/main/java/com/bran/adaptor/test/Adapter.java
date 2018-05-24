package com.bran.adaptor.test;

/**
 * @author antiumbo
 * @date on 2018/5/24
 **/
public class Adapter implements AmericanStandard {
    private ChineseStandard chineseStandard;

    public Adapter(ChineseStandard chineseStandard) {
        this.chineseStandard = chineseStandard;
    }

    @Override
    public void out110v() {
        chineseStandard.out220v();
    }
}
