package com.bran.responsibility.test;

/**
 * 责任链模式
 * 每个责任链都持有下一个责任链
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
