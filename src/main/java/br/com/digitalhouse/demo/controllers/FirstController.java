package br.com.digitalhouse.demo.controllers;

import br.com.digitalhouse.demo.services.NumerosRomanos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class FirstController {

    @Autowired
    NumerosRomanos service;

    @GetMapping
    public String cumprimento() {
        return "Ola Mundo";
    }

    //@GetMapping("/{nome}")
    //public String cumprimento(@PathVariable String nome) {
    //    return "Ola " + nome + "!";
    //}

    @GetMapping("/{numero}")
    public String numRomanos(@PathVariable Integer numero) {
        return service.intToRoman(numero);
    }
}
