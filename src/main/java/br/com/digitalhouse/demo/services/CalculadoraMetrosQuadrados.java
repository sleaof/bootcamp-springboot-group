package br.com.digitalhouse.demo.services;

import br.com.digitalhouse.demo.DTOs.CasaDTO;
import br.com.digitalhouse.demo.DTOs.ResponseCasaDTO;
import br.com.digitalhouse.demo.models.Comodo;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CalculadoraMetrosQuadrados {
    public ResponseCasaDTO calcMetrosQuadrados(CasaDTO casaDTO) {
        ResponseCasaDTO responseCasaDTO = new ResponseCasaDTO();
        List<HashMap<String, Double>> teste = new ArrayList<>();
        HashMap<String, Double> comodos = new HashMap<>();
        Double totalMetrosQuadrados = 0.0;
        String maiorComodo = new String();

        casaDTO.getComodos().size();

        for(Comodo comodo : casaDTO.getComodos()) {
            comodos.put(comodo.getNome(), (double)(comodo.getComprimento()) * (double)(comodo.getLargura()));
            totalMetrosQuadrados += (double)(comodo.getComprimento()) * (double)(comodo.getLargura());
        }

        teste.add(comodos);
        teste.stream().max(Comparator.comparing(String::valueOf)).get();

        responseCasaDTO.setTotalMetrosQuadrados(totalMetrosQuadrados);
        responseCasaDTO.setValorDaCasa(totalMetrosQuadrados * 800);
        responseCasaDTO.setComodos(comodos);
        maiorComodo = getMaiorComodo(casaDTO);
        //maiorComodo = responseCasaDTO.getComodos().keySet().stream().sorted(Comparator.reverseOrder()).findFirst().get().getValue().toString();
        responseCasaDTO.setMaiorComodo(maiorComodo);
        // comodos.entrySet().stream().sorted(Comparator.reverseOrder()).findFirst();

        return responseCasaDTO;
    }

    public String getMaiorComodo(CasaDTO casaDTO) {
        String comodo = "";
        Double tamanho = 0.0;
        for (Comodo c : casaDTO.getComodos()) {
            if (tamanho < (double)(c.getComprimento()) * (double)(c.getLargura())) {
                tamanho = (double)(c.getComprimento()) * (double)(c.getLargura());
                comodo = c.getNome();
            }
        }

        return comodo;
    }
}
