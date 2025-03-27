package com.theodorol.gof.Singleton;

/**
 * Singleton apressado
 * @author Theodorol
 * */
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){

    }
    public static SingletonEager getInstance(){

        return instancia;
    }
}
