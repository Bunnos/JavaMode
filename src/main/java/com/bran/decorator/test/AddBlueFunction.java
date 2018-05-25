package com.bran.decorator.test;

/**
 * @author antiumbo
 * @date on 2018/5/25
 **/
public class AddBlueFunction extends AddFunction {
    protected AddBlueFunction(IFunction iFunction) {
        super(iFunction);
    }

    @Override
    public void doFunction() {
        iFunction.doFunction();
        System.out.println("add Blue Function");
    }
}
