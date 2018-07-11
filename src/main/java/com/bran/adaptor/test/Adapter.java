package com.bran.adaptor.test;

/**
 * 适配器模式
 * 需求：将110v的电压适配成220v的电压
 *
 * @author antiumbo
 * @date on 2018/5/24
 **/
public class Adapter implements AmericanStandard {//实现被适配的接口（适配器可以插入110v的插座）
    /**
     适配器内部需要引入需要适配的类（220v）
      */
    private ChineseStandard chineseStandard;

    /**
     * 创建适配器时，引入适配的类（220v）
     * @param chineseStandard
     */
    public Adapter(ChineseStandard chineseStandard) {
        this.chineseStandard = chineseStandard;
    }

    /**
     * 重写被适配的类的方法，用适配类替代
     */
    @Override
    public void out110v() {
        chineseStandard.out220v();
    }
}
