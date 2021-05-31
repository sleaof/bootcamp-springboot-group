package br.com.digitalhouse.restauranteV2.DTOs;

import java.util.List;

public class MesaDTO {
    private int id;
    private List<PedidosDTO> pedidos;
    private Double valorTotal;

    public MesaDTO(int id, List<PedidosDTO> pedidos, Double valorTotal) {
        this.id = id;
        this.pedidos = pedidos;
        this.valorTotal = valorTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<PedidosDTO> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<PedidosDTO> pedidos) {
        this.pedidos = pedidos;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
