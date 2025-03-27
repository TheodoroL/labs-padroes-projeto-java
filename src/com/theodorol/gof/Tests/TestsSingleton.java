package com.theodorol.gof.Tests;

import com.theodorol.gof.Singleton.SingletonEager;
import com.theodorol.gof.Singleton.SingletonLazy;
import com.theodorol.gof.Singleton.SingletonLazyHolder;

public class TestsSingleton {
    public static void main(String[] args) {
        SingletonLazy lazy =  SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager =  SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);
    }
}
