package br.com.digitalhouse.starwars.Services;

import br.com.digitalhouse.starwars.DTOs.StarWarsDTO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class StarWarsService {

    public List<StarWarsDTO> findAllByNameContains(String name) {

        List<StarWarsDTO> StarDTOS = null;
        StarDTOS = loadDataBase();

          return StarDTOS.stream()
                    .filter(starWarsDTO -> matchWith(name, starWarsDTO))
                    .collect(Collectors.toList());

    }

    private boolean matchWith(String name, StarWarsDTO starWarsDTO) {
        return starWarsDTO.getName().toUpperCase().contains(name.toUpperCase());
    }


    private List<StarWarsDTO> loadDataBase() {
        File file = null;
        try {
            file = ResourceUtils.getFile("classpath:starwars.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<StarWarsDTO>> typeRef = new TypeReference<List<StarWarsDTO>>() {
        };
        List<StarWarsDTO> StarDTOS = null;
        try {
            StarDTOS = objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return StarDTOS;
    }

}
