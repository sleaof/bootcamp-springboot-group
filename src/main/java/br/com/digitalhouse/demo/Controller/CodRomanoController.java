package br.com.digitalhouse.demo.Controller;

import br.com.digitalhouse.demo.Services.Conversor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CodRomanoController {

        private Conversor conversor;

        @GetMapping("/numero/{numero}")
        public String traduzir(@PathVariable Integer numero){
            return Conversor.numero(numero);
        }
}
