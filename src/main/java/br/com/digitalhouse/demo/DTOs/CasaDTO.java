package br.com.digitalhouse.demo.DTOs;

import java.util.List;


public class CasaDTO {
    private String nome;
    private String endereco;
    private List<ComodosDTO> comodos;

    public CasaDTO(String nome, String endereco, List<ComodosDTO> comodos) {
        this.nome = nome;
        this.endereco = endereco;
        this.comodos = comodos;
    }

    public CasaDTO() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<ComodosDTO> getComodos() {
        return comodos;
    }

    public void setComodos(List<ComodosDTO> comodos) {
        this.comodos = comodos;
    }

    @Override
    public String toString() {
        return "CasaDTO{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", comodos=" + comodos +
                '}';
    }
}
