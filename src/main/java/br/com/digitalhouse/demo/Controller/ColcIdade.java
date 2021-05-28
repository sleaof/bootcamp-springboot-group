package br.com.digitalhouse.demo.Controller;

import br.com.digitalhouse.demo.Services.CalculadoraIdade;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class ColcIdade {

    private CalculadoraIdade calculadoraIdade;

    @GetMapping("/data")
    @ResponseBody
    public Integer traduzir(@RequestParam String dia, @RequestParam String mes, @RequestParam String ano){
        return CalculadoraIdade.idade(dia,mes,ano);
    }

}
