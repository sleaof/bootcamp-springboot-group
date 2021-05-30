package br.com.digitalhouse.demo.DTOs;

import java.util.List;

public class PratoDTO {
    private String name;
    private List<Ingredientes> ingredientes;

    public PratoDTO(String name, List<Ingredientes> ingredientes) {
        this.name = name;
        this.ingredientes = ingredientes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredientes> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingredientes> ingredientes) {
        this.ingredientes = ingredientes;
    }
}
