package br.com.digitalhouse.demo.controller;

import br.com.digitalhouse.demo.dto.HomeDTO;
import br.com.digitalhouse.demo.service.HomeForSaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeForSaleController {

    HomeForSaleService service;

    @PostMapping("/home/")
    public ResponseEntity<HomeDTO> getInfoHome(@RequestBody @Validated HomeDTO home){
        try {
            return new ResponseEntity<HomeDTO>(service.calculateMetro(home), HttpStatus.OK);
        } catch (RuntimeException exception){
            return new ResponseEntity<HomeDTO>(service.calculateMetro(home), HttpStatus.BAD_REQUEST);
        }
    }

}
