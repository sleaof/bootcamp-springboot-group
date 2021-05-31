package br.com.digitalhouse.demo.Controller;

import br.com.digitalhouse.demo.DTOs.StarWarsDTO;
import br.com.digitalhouse.demo.Services.StarWarsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/starwars")
public class StarWarsController {

        private StarWarsService starWarsService;

    @GetMapping("/{name}")
    public List<StarWarsDTO> buscarPersonagem(@PathVariable String name){
        StarWarsService sw = new StarWarsService();
        return sw.findAllByNameContains(name);
    }

}
