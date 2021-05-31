package br.com.digitalhouse.dataIdade.Controller;

import br.com.digitalhouse.dataIdade.Services.CalculadoraIdade;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/data")
public class ColcIdade {

    private CalculadoraIdade calculadoraIdade;

    @GetMapping("/{dia}/{mes}/{ano}")
    @ResponseBody
    public Integer traduzir(@PathVariable String dia, @PathVariable String mes, @PathVariable String ano){
        return CalculadoraIdade.idade(dia,mes,ano);
    }

}
