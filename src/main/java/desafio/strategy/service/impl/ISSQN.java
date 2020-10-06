package desafio.strategy.service.impl;

import desafio.strategy.service.Imposto;

public class ISSQN implements Imposto {
    private double valor;

    public ISSQN (double valor) {
        this.valor = valor;
    }

    @Override
    public double calcular() {
        return this.valor * 0.02;
    }
}
