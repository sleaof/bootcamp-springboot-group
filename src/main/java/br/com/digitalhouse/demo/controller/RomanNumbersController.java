package br.com.digitalhouse.demo.controller;

import br.com.digitalhouse.demo.service.RomanNumbersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RomanNumbersController {

    RomanNumbersService service;

    @GetMapping("/roman/")
    public String getIndex(){
        return "Api Roman Numbers!";
    }

    @GetMapping("/roman/{number}")
    public String getRomanNumbers(@PathVariable int number){
        return service.converterEmRomanos(number);
    }

}
