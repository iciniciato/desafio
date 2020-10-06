import desafio.strategy.service.CalculadoraImpostos;
import desafio.strategy.service.impl.COFINS;
import desafio.strategy.service.impl.INSS;
import desafio.strategy.service.impl.ISSQN;

public class TesteCalculadora {

    public static void main(String[] args) {
        CalculadoraImpostos calculadora = new CalculadoraImpostos();
        COFINS cofins = new COFINS(1000.0);
        INSS inss = new INSS(1000.0);
        ISSQN issqn = new ISSQN(1000.0);
        System.out.println(calculadora.calcular(cofins));
        System.out.println(calculadora.calcular(inss));
        System.out.println(calculadora.calcular(issqn));
    }
}
