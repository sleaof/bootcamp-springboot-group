package br.com.digitalhouse.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeForSaleController {

    @Autowired
    HomeForSaleService service;

    @PostMapping
    public void getInfoHome(){

    }

}
