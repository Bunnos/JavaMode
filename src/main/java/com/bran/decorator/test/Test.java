package com.bran.decorator.test;

/**
 * @author antiumbo
 * @date on 2018/5/25
 **/
public class Test {

    public static void main(String[] args) {
        AddRedFunction addRedFunction = new AddRedFunction(new ConcreteFunction());
        AddBlueFunction addBlueFunction = new AddBlueFunction(new ConcreteFunction());
        AddBlueFunction addBlueFunctionOne = new AddBlueFunction(addRedFunction);

        addRedFunction.doFunction();
        System.out.println("---------");
        addBlueFunction.doFunction();
        System.out.println("---------");
        addBlueFunctionOne.doFunction();
    }
}
