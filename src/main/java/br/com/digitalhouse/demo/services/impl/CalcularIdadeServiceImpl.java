package br.com.digitalhouse.demo.services.impl;

import br.com.digitalhouse.demo.services.CalcularIdadeService;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


@Component
public class CalcularIdadeServiceImpl implements CalcularIdadeService {

    @Override
    public Integer calcularIdade(String dia, String mes, String ano) {
        String data = dia + "/" + mes + "/" + ano;
        DateTimeFormatter formt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d = LocalDate.parse(data, formt);

        LocalDate data1 = LocalDate.of(d.getYear(), d.getMonth(), d.getDayOfMonth());
        LocalDate data2 = LocalDate.now();

        Period period = Period.between(data1,data2);
        return period.getYears();
    }
}
