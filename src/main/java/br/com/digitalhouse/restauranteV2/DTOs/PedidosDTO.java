package br.com.digitalhouse.restauranteV2.DTOs;

import java.util.List;

public class PedidosDTO {

    private int id;
    private Integer mesa;
    private List<PratosDTO> pratos;

    public PedidosDTO(int id, Integer mesa, List<PratosDTO> pratos) {
        this.id = id;
        this.mesa = mesa;
        this.pratos = pratos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getMesa() {
        return mesa;
    }

    public void setMesa(Integer mesa) {
        this.mesa = mesa;
    }

    public List<PratosDTO> getPratos() {
        return pratos;
    }

    public void setPratos(List<PratosDTO> pratos) {
        this.pratos = pratos;
    }

}
