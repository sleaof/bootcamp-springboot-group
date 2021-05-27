package br.com.digitalhouse.demo.services;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;

@Service
public class CalculadoraIdade {

    public static String calcularIdade(Integer dia, Integer mes, Integer ano) {
        Period period = Period.between(LocalDate.now(), LocalDate.of(ano, mes, dia));
        String resultado = -period.getYears() + " anos";
        return resultado;
    }
}
