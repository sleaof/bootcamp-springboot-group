package br.com.digitalhouse.demo.DTOs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ResponseCasaDTO {
    private Double totalMetrosQuadrados;
    private Double valorDaCasa;
    private String maiorComodo;
    private HashMap<String, Double> comodos = new HashMap<>();

    public Double getTotalMetrosQuadrados() {
        return totalMetrosQuadrados;
    }

    public void setTotalMetrosQuadrados(Double totalMetrosQuadrados) {
        this.totalMetrosQuadrados = totalMetrosQuadrados;
    }

    public Double getValorDaCasa() {
        return valorDaCasa;
    }

    public void setValorDaCasa(Double valorDaCasa) {
        this.valorDaCasa = valorDaCasa;
    }

    public String getMaiorComodo() {
        return maiorComodo;
    }

    public void setMaiorComodo(String maiorComodo) {
        this.maiorComodo = maiorComodo;
    }

    public HashMap<String, Double> getComodos() {
        return comodos;
    }

    public void setComodos(HashMap<String, Double> comodos) {
        this.comodos = comodos;
    }
}
