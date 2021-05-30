package br.com.digitalhouse.demo.Controller;

import br.com.digitalhouse.demo.DTOs.MesaDTO;
import br.com.digitalhouse.demo.Services.Resturante;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restaurante")
public class RestauranteController {
    private Resturante resturante;


    @PostMapping
    public MesaDTO restaurante(MesaDTO mesa){

        return mesa;
    }
}
