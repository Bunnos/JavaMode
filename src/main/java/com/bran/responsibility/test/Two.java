package com.bran.responsibility.test;

/**
 * @author antiumbo
 * @date on 2018/5/28
 **/
public class Two extends FunctionHandler {
    public static final int TWO = 20;

    @Override
    public FunctionHandler doFunction(int i) {
        if (i < TWO) {
            System.out.println("two");
        } else if (functionHandler!=null){
            functionHandler.doFunction(i);
        }else {
            System.out.println("wrong two");
        }
        return this;
    }
}
