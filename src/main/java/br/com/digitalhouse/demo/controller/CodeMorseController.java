package br.com.digitalhouse.demo.controller;

import br.com.digitalhouse.demo.service.CodeMorseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodeMorseController {

    CodeMorseService service;

    @RequestMapping("/morse/{code}")
    public String getCode(@PathVariable String code){
        return service.translateMorse(code);
    }
}
