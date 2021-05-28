package br.com.digitalhouse.demo.Controller;

import br.com.digitalhouse.demo.DTOs.AlunoDTO;
import br.com.digitalhouse.demo.Services.CalcularAluno;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aluno")
public class AlunoMediaController {

    private CalcularAluno calcularAluno;

    @PostMapping
    public AlunoDTO alunoDaSala(@RequestBody AlunoDTO aluno){
        return aluno;
    }
    @PostMapping("/media")
    public String calcularMedia(@RequestBody AlunoDTO aluno){
        return CalcularAluno.calcular(aluno);
    }
}
