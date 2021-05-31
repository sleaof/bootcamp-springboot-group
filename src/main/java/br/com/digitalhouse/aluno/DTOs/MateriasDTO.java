package br.com.digitalhouse.aluno.DTOs;

public class MateriasDTO {
    private String nome;
    private Integer nota;

    public MateriasDTO(String nome, Integer nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }
}
