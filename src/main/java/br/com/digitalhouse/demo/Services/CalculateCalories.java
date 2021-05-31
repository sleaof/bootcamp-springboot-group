package br.com.digitalhouse.demo.Services;

import br.com.digitalhouse.demo.DTOs.Ingredientes;
import br.com.digitalhouse.demo.DTOs.PratoDTO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

@Service
@Repository
public class CalculateCalories {

    public String findCaloriesByName(String name) {
        List<PratoDTO> PratoDTOS = null;
        PratoDTOS = loadDataBase();
        System.out.println(PratoDTOS);
        String result = null;
        if (PratoDTOS != null) {
            Optional<PratoDTO> item = PratoDTOS.stream()
                    .filter(pratoDTO -> pratoDTO.getName().equals(name))
                    .findFirst();
            int item1 = PratoDTOS.stream().max(Comparator.
                    comparing(String::valueOf)).get().getIngredientes().stream().mapToInt(Ingredientes::getCalories).sum();

            OptionalInt item2 = PratoDTOS.stream().max(Comparator.
                    comparing(String::valueOf)).get().getIngredientes().stream().mapToInt(Ingredientes::getCalories).max();

            int maior = item2.getAsInt();

            if (item.isPresent())
                result = item.get() + " \n Soma das calorias: " + item1 + " \n maior caloria: " + maior;
        }
        return result;
    }

    private List<PratoDTO> loadDataBase() {
        File file = null;
        try {
            file = ResourceUtils.getFile("classpath:food.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<PratoDTO>> typeRef = new TypeReference<List<PratoDTO>>() {
        };
        List<PratoDTO> PratoDTOS = null;
        try {
            PratoDTOS = objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return PratoDTOS;
    }

}
