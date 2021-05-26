package br.com.digitalhouse.demo.controllers;

import br.com.digitalhouse.demo.services.RomanNumbers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RomanController {

    @Autowired
    RomanNumbers service;

    @GetMapping("/{number}")
    public String transformNumbersIntoRomanNumbers(@PathVariable int number){
        return service.toRoman(number);
    }
}
