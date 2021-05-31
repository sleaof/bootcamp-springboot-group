package br.com.digitalhouse.demo.services;

import br.com.digitalhouse.demo.DTOs.AlunoDTO;
import br.com.digitalhouse.demo.DTOs.ResponseDiploma;
import br.com.digitalhouse.demo.models.Disciplina;
import org.springframework.stereotype.Service;

@Service
public class ObterDiploma {
    public ResponseDiploma obterDiploma(AlunoDTO alunoDTO) {
        ResponseDiploma diploma = new ResponseDiploma();
        Double somaNotas = 0.0;
        for(Disciplina disciplina: alunoDTO.getDisciplinas()) {
            somaNotas += disciplina.getNota();
        }

        diploma.setNomeAluno(alunoDTO.getNome());
        diploma.setMediaAluno(somaNotas / (double)(alunoDTO.getDisciplinas().size()));
        if(diploma.getMediaAluno() > 9.0) {
            diploma.setMensagem("média: " + diploma.getMediaAluno() + ". Parabéns!!");
        } else {
            diploma.setMensagem("média: " + diploma.getMediaAluno() + ". Estude mais.");
        }

        return diploma;
    }
}
