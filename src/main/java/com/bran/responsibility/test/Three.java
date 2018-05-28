package com.bran.responsibility.test;

/**
 * @author antiumbo
 * @date on 2018/5/28
 **/
public class Three extends FunctionHandler {
    public static final int THREE = 30;

    @Override
    public FunctionHandler doFunction(int i) {
        if (i < THREE) {
            System.out.println("three");
        } else if (functionHandler!=null){
            functionHandler.doFunction(i);
        }else {
            System.out.println("wrong three");
        }
        return this;
    }
}
