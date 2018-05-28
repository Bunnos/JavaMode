package com.bran.responsibility.test;

/**
 * 责任链模式
 * 把自身传进去。
 *
 * @author antiumbo
 * @date on 2018/5/28
 **/
public abstract class FunctionHandler {
    protected FunctionHandler functionHandler;

    /**
     * @param clazz
     * @return
     */
    protected FunctionHandler setNext(Class<? extends FunctionHandler> clazz) {
        try {
            this.functionHandler = clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return functionHandler;
    }

    abstract public FunctionHandler doFunction(int i);
}
