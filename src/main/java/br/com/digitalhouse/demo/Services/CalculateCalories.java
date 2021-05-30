package br.com.digitalhouse.demo.Services;

import br.com.digitalhouse.demo.Controller.BuscaDePratos;
import br.com.digitalhouse.demo.DTOs.Ingredientes;
import br.com.digitalhouse.demo.DTOs.PratoDTO;
import br.com.digitalhouse.demo.DTOs.PriceDTO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
@Repository
public class CalculateCalories {

    public Ingredientes findCaloriesByName(String name) {
        List<Ingredientes> IngredientesDTOS = null;
        IngredientesDTOS = loadDataBase();
        Ingredientes result = null;
        if (IngredientesDTOS!= null){
            Optional<Ingredientes> item = IngredientesDTOS.stream()
                    .filter(ingredientes -> ingredientes.getName().equals(name))
                    .findFirst();
            if (item.isPresent())
                result = item.get();
        }
        return result;
    }

    private List<Ingredientes> loadDataBase() {
        File file = null;
        try {
            file = ResourceUtils.getFile("classpath:food.json");
            System.out.println(file);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<Ingredientes>> typeRef = new TypeReference<List<Ingredientes>>() {};
        List<Ingredientes> IngredientesDTOS = null;
        try {
            IngredientesDTOS = objectMapper.readValue(file, typeRef);
        }catch (IOException e){
            e.printStackTrace();
        }
        return IngredientesDTOS;
    }

}
