package com.bran.decorator.test;

/**
 * @author antiumbo
 * @date on 2018/5/25
 **/
public class AddRedFunction extends AddFunction {
    
    protected AddRedFunction(IFunction iFunction) {
        super(iFunction);
    }

    @Override
    public void doFunction() {
        iFunction.doFunction();
        System.out.println("add red function");
    }
}
