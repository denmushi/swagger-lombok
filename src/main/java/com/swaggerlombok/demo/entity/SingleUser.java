package com.swaggerlombok.demo.entity;

/**
 * @Author wukq
 * @Time 2019-08-19  16:54
 */
public class SingleUser {

    private static SingleUser singleUser = null;

    private SingleUser(){

    }

    public SingleUser getSingleUser() {
        if (singleUser == null) {
            singleUser = new SingleUser();
        }

        return singleUser;
    }
}
