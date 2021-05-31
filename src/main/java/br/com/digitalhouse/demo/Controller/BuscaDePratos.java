package br.com.digitalhouse.demo.Controller;

import br.com.digitalhouse.demo.DTOs.Ingredientes;
import br.com.digitalhouse.demo.DTOs.PratoDTO;
import br.com.digitalhouse.demo.Services.CalculateCalories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pratos")
public class BuscaDePratos {

    private CalculateCalories calculateCalories;

    @GetMapping("/{name}")
    public String findPratosByName(@PathVariable String name){
        CalculateCalories c1 = new CalculateCalories();
        return c1.findCaloriesByName(name);
    }

}
