package br.com.digitalhouse.demo.controllers;

import br.com.digitalhouse.demo.services.MorseCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/morse")
public class MorseController {

    private MorseCode service;

    public MorseController(MorseCode service) {
        this.service = service;
    }

    @GetMapping("/{word}")
    public String transformWordsToMorse(@PathVariable String word){
        return service.stringToEnglish(word);
    }
}

