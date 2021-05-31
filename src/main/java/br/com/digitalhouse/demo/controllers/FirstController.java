package br.com.digitalhouse.demo.controllers;

import br.com.digitalhouse.demo.DTOs.AlunoDTO;
import br.com.digitalhouse.demo.DTOs.CasaDTO;
import br.com.digitalhouse.demo.DTOs.ResponseCasaDTO;
import br.com.digitalhouse.demo.DTOs.ResponseDiploma;
import br.com.digitalhouse.demo.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class FirstController {

    @Autowired
    NumerosRomanos numerosRomanosService;
    CodigoMorse codigoMorseService;
    CalculadoraIdade calculadoraIdade;
    @Autowired
    CalculadoraMetrosQuadrados calculadoraMetrosQuadrados;
    @Autowired
    ObterDiploma obterDiploma;

    @GetMapping
    public String cumprimento() {
        return "Ola Mundo";
    }

    @GetMapping("numero/{numero}")
    public String numRomanos(@PathVariable Integer numero) {
        return numerosRomanosService.intToRoman(numero);
    }

    @GetMapping("/morse/{morse}")
    public String convertMorse(@PathVariable String morse) {
        return codigoMorseService.morseToPT(morse);
    }

    @GetMapping("/idade/{dia}/{mes}/{ano}")
    public String convertMorse(@PathVariable Integer dia, @PathVariable Integer mes, @PathVariable Integer ano) {
        return calculadoraIdade.calcularIdade(dia, mes, ano);
    }

    @PostMapping("/metrosQuadrados")
    public ResponseCasaDTO calcMetrosQuadrados(@RequestBody CasaDTO casaDTO) {
        return calculadoraMetrosQuadrados.calcMetrosQuadrados(casaDTO);
    }

    @PostMapping("/obterDiploma")
    public ResponseDiploma obterDiploma(@RequestBody AlunoDTO alunoDTO) {
        return obterDiploma.obterDiploma(alunoDTO);
    }
}
