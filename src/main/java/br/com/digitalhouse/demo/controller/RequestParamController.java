package br.com.digitalhouse.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
class RequestParamController {

    @GetMapping("/")
    public String getIndex(){
        return "Say your name in URI separeted with /";
    }

    @GetMapping("/{name}")
    public String getParam(@PathVariable(value = "name") String name){
        return "Welcome " + name;
    }

}
