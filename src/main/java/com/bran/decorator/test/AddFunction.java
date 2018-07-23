package com.bran.decorator.test;

/**
 * 装饰者类，代替单纯的继承
 * 首先装饰者类是抽象者类，方便子类继承扩展
 * 其次要实现要扩展功能的接口
 * 最后在创建装饰者类的时候要把被装饰对象传入
 * @author antiumbo
 * @date on 2018/5/25
 **/
public abstract class AddFunction implements IFunction{
    protected IFunction iFunction;

    protected AddFunction(IFunction iFunction) {
        this.iFunction = iFunction;
    }
}