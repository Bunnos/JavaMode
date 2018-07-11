package com.bran.adaptor.test;

/**
 * @author antiumbo
 * @date on 2018/5/24
 **/
public class TestAdapter {
    public static void main(String[] args) {
        //创建新的适配器
        Adapter adapter = new Adapter(new ChinesePlugin());
        // 把适配器插入到美国电源
        AmericanStandard americanPlugin = new AmericanPlugin(adapter);
        // 美国电源输出电压变成了220v
        americanPlugin.out110v();
    }
}
