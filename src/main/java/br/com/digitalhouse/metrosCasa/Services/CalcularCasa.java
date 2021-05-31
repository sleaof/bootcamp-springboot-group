package br.com.digitalhouse.metrosCasa.Services;

import br.com.digitalhouse.metrosCasa.DTOs.CasaDTO;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CalcularCasa {


    public static HashMap<String, Double> maiorComodo(CasaDTO casa) {
        List<HashMap<String, Double>> c = new ArrayList<>();
        for (int i = 0; i < casa.getComodos().size(); i++) {

            String cAux2 = "";
            HashMap<String, Double> x = new HashMap<>();
            cAux2 = casa.getComodos().get(i).getNome();
            Double aux2 = casa.getComodos().get(i).getLargura() * casa.getComodos().get(i).getComprimento();
            x.put(cAux2, aux2);
            c.add(x);
        }

        return c.stream().max(Comparator.
                comparing(String::valueOf)).get();
    }

    public static Double calcularMetrosQ(CasaDTO casa) {

        Double cAux1 = 0.0;
        //metros quadrados da casa
        for (int i = 0; i < casa.getComodos().size(); i++) {
            cAux1 += casa.getComodos().get(i).getLargura() * casa.getComodos().get(i).getComprimento();

        }
        return cAux1;
    }

    public static Double calcValorT(CasaDTO casa) {

        Double cAux1 = 0.0;

        //metros quadrados da casa
        for (int i = 0; i < casa.getComodos().size(); i++) {
            cAux1 += casa.getComodos().get(i).getLargura() * casa.getComodos().get(i).getComprimento();
        }

        Double y = cAux1*800.0;
        return y;
    }

    public static List<HashMap<String, Double>> metrosQuadradoPComodo(CasaDTO casa) {
        String cAux2 = "";
        List<HashMap<String, Double>> c = new ArrayList<>();
        for (int i = 0; i < casa.getComodos().size(); i++) {
            HashMap<String, Double> x = new HashMap<>();
            cAux2 = casa.getComodos().get(i).getNome();
            Double aux2 = casa.getComodos().get(i).getLargura() * casa.getComodos().get(i).getComprimento();
            x.put(cAux2, aux2);
            c.add(x);
        }
        return c;
    }


}
