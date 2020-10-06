package desafio.strategy.controllers;

import desafio.strategy.service.CalculadoraImpostos;
import desafio.strategy.service.impl.COFINS;
import desafio.strategy.service.impl.INSS;
import desafio.strategy.service.impl.ISSQN;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class Imposto {

    @GetMapping(value = "/cofins/{valor}")
    public ResponseEntity getCofins(@PathVariable(value = "valor") final Double valor){

        CalculadoraImpostos calculadora = new CalculadoraImpostos();
        COFINS cofins = new COFINS(valor);

        return ResponseEntity.ok().body(calculadora.calcular(cofins));
    }

    @GetMapping(value = "/inss/{valor}")
    public ResponseEntity getInss(@PathVariable(value = "valor") final Double valor){

        CalculadoraImpostos calculadora = new CalculadoraImpostos();
        INSS inss = new INSS(valor);

        return ResponseEntity.ok().body(calculadora.calcular(inss));
    }

    @GetMapping(value = "/issqn/{valor}")
    public ResponseEntity getIssqn(@PathVariable(value = "valor") final Double valor){

        CalculadoraImpostos calculadora = new CalculadoraImpostos();
        ISSQN issqn = new ISSQN(valor);

        return ResponseEntity.ok().body(calculadora.calcular(issqn));
    }

}
