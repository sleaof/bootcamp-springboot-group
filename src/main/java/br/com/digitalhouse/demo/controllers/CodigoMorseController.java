package br.com.digitalhouse.demo.controllers;


import br.com.digitalhouse.demo.services.CodigoMorseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CodigoMorseController {

    @Autowired
    private CodigoMorseService codigoMorseService;

    @GetMapping("/{code}")
    public String traduzirCodigo(@PathVariable String code){
        return this.codigoMorseService.traduzirCodigoMorse(code);
    }
}
