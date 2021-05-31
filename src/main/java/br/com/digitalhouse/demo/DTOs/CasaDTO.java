package br.com.digitalhouse.demo.DTOs;

import br.com.digitalhouse.demo.models.Comodo;

import java.util.ArrayList;
import java.util.List;

public class CasaDTO {
    private String nome;
    private String endereco;
    private List<Comodo> comodos = new ArrayList<Comodo>();

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

    public List<Comodo> getComodos() {
        return comodos;
    }

    public void setComodos(List<Comodo> comodos) {
        this.comodos = comodos;
    }
}
