package desafio.strategy.service.impl;

import desafio.strategy.service.Imposto;

public class INSS implements Imposto {
    private double valor;

    public INSS (double valor) {
        this.valor = valor;
    }

    @Override
    public double calcular() {
        return this.valor * 0.04;
    }
}
