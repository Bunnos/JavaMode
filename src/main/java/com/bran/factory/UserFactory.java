package com.bran.factory;

/**
 * @author antiumbo
 * @date on 2018/5/20
 **/
public class UserFactory {

    public static User getUserInstance(){
        return new User();
    }
}
