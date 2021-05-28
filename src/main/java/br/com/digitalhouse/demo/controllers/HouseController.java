package br.com.digitalhouse.demo.controllers;

import br.com.digitalhouse.demo.dtos.HouseDTO;
import br.com.digitalhouse.demo.dtos.ResponseHouseDTO;
import br.com.digitalhouse.demo.services.HouseJavaService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class HouseController {

    @Autowired
    public HouseJavaService houseService;

    @PostMapping("/data")
        public ResponseEntity<ResponseHouseDTO> houseParams(@RequestBody HouseDTO houseDTO){
            return new ResponseEntity<>(houseService.calculateHouseData(houseDTO), HttpStatus.OK);
        }
    }

