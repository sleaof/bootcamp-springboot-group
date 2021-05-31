package br.com.digitalhouse.dataIdade.Services;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

@Service
public class CalculadoraIdade {

    public static Integer idade(String dia, String mes, String ano) {
        String data = dia + "/" + mes + "/" + ano;
        DateTimeFormatter formt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d = LocalDate.parse(data, formt);

        LocalDate data1 = LocalDate.of(d.getYear(), d.getMonth(), d.getDayOfMonth());
        LocalDate data2 = LocalDate.now();

        Period period = Period.between(data1, data2);
        return period.getYears();
    }


}
