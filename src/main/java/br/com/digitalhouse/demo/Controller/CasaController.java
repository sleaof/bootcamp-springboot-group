package br.com.digitalhouse.demo.Controller;

import br.com.digitalhouse.demo.DTOs.CasaDTO;
import br.com.digitalhouse.demo.Services.CalcularCasa;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/casa")
public class CasaController {

   // private static CasaDTO casa;
    private CalcularCasa calcularCasa;

    @PostMapping()
    public static CasaDTO resultar(@RequestBody CasaDTO casa){

        return casa;
    }
    @PostMapping("/metros")
    public static Double metrosQuadradoDaCasa(@RequestBody CasaDTO casa){
        return CalcularCasa.calcularMetrosQ(casa);
    }
    @PostMapping("/comodo")
    public static HashMap<String, Double> maiorComodo(@RequestBody CasaDTO casa){
        return CalcularCasa.maiorComodo(casa);
    }
    @PostMapping("/valor")
    public static Double valorCasa(@RequestBody CasaDTO casa){
        return CalcularCasa.calcValorT(casa);
    }
    @PostMapping("/comodos")
    public static List<HashMap<String, Double>> metrosPorComodo(@RequestBody CasaDTO casa){
        return CalcularCasa.metrosQuadradoPComodo(casa);
    }



}
