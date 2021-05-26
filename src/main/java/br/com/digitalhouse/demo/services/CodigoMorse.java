package br.com.digitalhouse.demo.services;

import org.springframework.stereotype.Service;

import java.util.Arrays;


@Service
public class CodigoMorse {
    private static final String[] ALFABETO =
            {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", " "};
    private static final String[] MORSE =
            { ".-" , "-..." , "-.-." , "-.." , "." , "..-." , "--." , "...." , ".." , ".---" , "-.-" , ".-.." , "--" , "-." , "---" , ".--." , "--.-" ,  ".-." , "..." , "-" , "..-" , "...-" , ".--" , "-..-" , "-.--" , "--.." , "&" };

    public static String morseToPT(String palavra) {
        String[] letras = {};
        String resultado = "";
        letras = palavra.split(" ");
        System.out.println(letras.length);

        for (String letra : letras) {
            resultado += ALFABETO[Arrays.asList(MORSE).indexOf(letra)];
        }

        return resultado;
    }
}
