package br.com.digitalhouse.demo.controllers;

import br.com.digitalhouse.demo.services.CalcularIdadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")

public class CalcularIdadeControler {

    @Autowired
    CalcularIdadeService calcularIdadeService;

    @GetMapping("/calcularIdade")
    @ResponseBody
    public Integer calcularIdade(@RequestParam String dia, @RequestParam String mes, @RequestParam String ano){
        return calcularIdadeService.calcularIdade(dia,mes,ano);
    }
}
