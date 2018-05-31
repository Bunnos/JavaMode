package com.bran.observer;

/**
 * 观察者
 * @author antiumbo
 * @date on 2018/5/30
 **/
public abstract class Observer {
    /**
     * 需要观察的对象
     */
    protected Subject subject;

    /**
     * 创建观察者时，由外部传进来
     * @param subject
     */
    public Observer(Subject subject){
        this.subject = subject;
    }

    /**
     * 所有观察者子类要实现的方法
     */
    public abstract void update();
}
