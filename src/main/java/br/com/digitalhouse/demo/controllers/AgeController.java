package br.com.digitalhouse.demo.controllers;

import br.com.digitalhouse.demo.services.Age;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/age")
public class AgeController {

    private Age service;

    public AgeController(Age service) {
        this.service = service;
    }

    @GetMapping("/{day}/{month}/{year}")
    public long getAge(@PathVariable Integer day, @PathVariable Integer month, @PathVariable Integer year) {
        return service.getAge(day, month, year);
    }
}
