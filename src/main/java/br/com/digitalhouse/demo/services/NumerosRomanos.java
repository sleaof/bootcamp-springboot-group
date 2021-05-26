package br.com.digitalhouse.demo.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import static java.util.Collections.nCopies;
import static java.lang.String.join;

@Component
@Service
public class NumerosRomanos {

    private static final int[] decimais = {1000, 900, 500, 100, 90, 50, 40, 9, 5, 4, 1};
    private static final String[] romanos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    private static final int[] DECIMAIS =
            {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
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
