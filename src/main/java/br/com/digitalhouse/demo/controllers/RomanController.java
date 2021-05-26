package br.com.digitalhouse.demo.controllers;

import br.com.digitalhouse.demo.services.RomanNumbers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/roman")
public class RomanController {

    private RomanNumbers service;

    public RomanController(RomanNumbers service) {
        this.service = service;
    }

    @GetMapping("/{number}")
    public String transformNumbersIntoRomanNumbers(@PathVariable int number){
        return service.toRoman(number);
    }
}
