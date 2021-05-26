package br.com.digitalhouse.demo.controllers;

import br.com.digitalhouse.demo.services.NumerosRomanos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class FirstController {


    NumerosRomanos numerosRomanos;

   /* @GetMapping
    public String cumprimento(){
        return "Olá - Controller Funcionando";
    }
    */
    @GetMapping("/numeros/{number}")
    public String transformaNumero(@PathVariable int number ){
        return numerosRomanos.converterEmRomanos(number);
    }

    //@GetMapping("/codigoMorse/{}")





}
