package com.bran.responsibility.test;

/**
 * @author antiumbo
 * @date on 2018/5/28
 **/
public class One extends FunctionHandler {
    public static final int ONE = 10;
    @Override
    public FunctionHandler doFunction(int i) {
        if (i < ONE) {
            System.out.println("one");
        }else if(functionHandler!=null){
            functionHandler.doFunction(i);
        }else {
            System.out.println("wrong one");
        }
        return this;
    }
}
