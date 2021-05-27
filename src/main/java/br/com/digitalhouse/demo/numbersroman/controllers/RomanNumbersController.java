package br.com.digitalhouse.demo.numbersroman.controllers;

import br.com.digitalhouse.demo.numbersroman.services.RomanNumbersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RomanNumbersController {

    @Autowired
    RomanNumbersService service;

    @GetMapping("/")
    public String getIndex(){
        return "Api Roman Numbers!";
    }

    @GetMapping("/{number}")
    public String getRomanNumbers(@PathVariable int number){
        return service.converterEmRomanos(number);
    }

}
