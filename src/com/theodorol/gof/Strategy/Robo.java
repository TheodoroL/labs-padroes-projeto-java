package com.theodorol.gof.Strategy;

public class Robo {
    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }
    public void mover(){
        if(this.comportamento == null){
            System.out.println("Você não definiu o comportamento do robo...");
            return;
        }
        this.comportamento.mover();
    }
}
