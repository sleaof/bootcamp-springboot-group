package br.com.digitalhouse.demo.numbersroman.services;

import org.springframework.stereotype.Service;
import static java.util.Collections.nCopies;
import static java.lang.String.join;

@Service
public class RomanNumbersService {

    private static final int[] DECIMAIS =
            {1100, 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] ROMANOS =
            {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public static String converterEmRomanos(int decimal) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < DECIMAIS.length; i++) {
            int parteInteira = decimal / DECIMAIS[i];
            decimal -= DECIMAIS[i] * parteInteira;
            resultado.append(join("", nCopies(parteInteira, ROMANOS[i])));
        }
        return resultado.toString();
    }


}
