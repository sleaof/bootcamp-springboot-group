package br.com.digitalhouse.demo.DTOs;

import br.com.digitalhouse.demo.models.Disciplina;

import java.util.ArrayList;
import java.util.List;

public class AlunoDTO {
    private String nome;
    List<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
}
