package com.theodorol.gof.Strategy;

public class ComportamentoDefensivo implements Comportamento {
    @Override
    public void mover() {
        System.out.println("Movendo de forma defensiva");
    }
}
