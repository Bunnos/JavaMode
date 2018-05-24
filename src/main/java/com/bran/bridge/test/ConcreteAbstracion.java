package com.bran.bridge.test;

import com.bran.builder.ConcreteBuilder;

/**
 * @author antiumbo
 * @date on 2018/5/24
 **/
public class ConcreteAbstracion extends Abstracion {
    public ConcreteAbstracion(Implementor implementor){
        super.implementor = implementor;
    }
    @Override
    void operation() {
        System.out.println("Abstraction Method");
        implementor.someOperation();
    }
}
