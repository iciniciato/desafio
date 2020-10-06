package desafio.strategy.service.impl;

import desafio.strategy.service.Imposto;

public class COFINS implements Imposto {
    private double valor;

    public COFINS (double valor) {
        this.valor = valor;
    }

    @Override
    public double calcular() {
        return this.valor * 0.142;
    }
}
