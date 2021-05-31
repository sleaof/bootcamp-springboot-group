package br.com.digitalhouse.restauranteV2.Controller;

import br.com.digitalhouse.restauranteV2.DTOs.MesaDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restaurante")
public class RestauranteController {
    //private Resturante resturante;


    @PostMapping
    public MesaDTO restaurante(MesaDTO mesa){

        return mesa;
    }
}
