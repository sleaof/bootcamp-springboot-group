package br.com.digitalhouse.aluno.DTOs;

import java.util.List;

public class AlunoDTO {
    private String nome;
    private List<MateriasDTO> materia;

    public AlunoDTO(String nome, List<MateriasDTO> materia) {
        this.nome = nome;
        this.materia = materia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<MateriasDTO> getMateria() {
        return materia;
    }

    public void setMateria(List<MateriasDTO> materia) {
        this.materia = materia;
    }
}
