package br.com.digitalhouse.demo.Controller;

import br.com.digitalhouse.demo.Services.ConversorMorse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CodMorseController {

    private ConversorMorse conversorMorse;

    @GetMapping("/morse/{cod}")
    public String traduzir(@PathVariable String cod){
        return ConversorMorse.traducirMorse(cod);
    }
}
