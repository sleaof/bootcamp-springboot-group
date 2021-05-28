package br.com.digitalhouse.demo.controller;

import br.com.digitalhouse.demo.service.CalculaIdadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.Date;

@RestController
public class CalculoIdadeController {

    CalculaIdadeService service;

    @GetMapping("/idade/{dia}/{mes}/{ano}")
    public int getCode(@PathVariable Integer dia, @PathVariable Integer mes, @PathVariable Integer ano) throws ParseException {
        return service.calculaIdade(dia, mes, ano);
    }

    @GetMapping("/idade/date/{dataAniversario}")
    public int getCode(@PathVariable Date dataAniversario) throws ParseException {
        return service.calculaIdadeStringUnica(dataAniversario);
    }

}
