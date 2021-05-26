package br.com.digitalhouse.demo.class01.tm.controllers;

import br.com.digitalhouse.demo.class01.tm.services.RomanNumbers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RomanController {

    RomanNumbers service;

    public RomanController(RomanNumbers service) {
        this.service = service;
    }

    @GetMapping("/{number}")
    public String transformNumbersIntoRomanNumbers(@PathVariable int number){
        return service.toRoman(number);
    }
}
