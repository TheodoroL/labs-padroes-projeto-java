package com.theodorol.gof;

/**
 * Singleton Lazy Holder
 * @author Theodorol
 * */
public class SingletonLazyHolder {

    private static  class Holder{
        private static SingletonLazyHolder instancia = new SingletonLazyHolder();

    }

    private SingletonLazyHolder(){

    }
    public static SingletonLazyHolder getInstance(){

        return Holder.instancia;
    }
}
