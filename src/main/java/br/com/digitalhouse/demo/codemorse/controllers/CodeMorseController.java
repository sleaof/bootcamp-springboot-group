package br.com.digitalhouse.demo.codemorse.controllers;

import br.com.digitalhouse.demo.codemorse.service.CodeMorseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/morse/")
public class CodeMorseController {

    @Autowired
    CodeMorseService service;

    @RequestMapping("/{code}")
    public String getCode(@PathVariable String code){
        return service.traducirMorse(code);
    }
}
