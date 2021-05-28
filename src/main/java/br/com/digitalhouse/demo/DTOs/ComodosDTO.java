package br.com.digitalhouse.demo.DTOs;

public class ComodosDTO {
    private String nome;
    private Double largura;
    private Double comprimento;

    public ComodosDTO(String nome, Double largura, Double comprimento) {
        this.nome = nome;
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public ComodosDTO() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public void setComprimento(Double comprimento) {
        this.comprimento = comprimento;
    }

    @Override
    public String toString() {
        return "ComodosDTO{" +
                "nome='" + nome + '\'' +
                ", largura=" + largura +
                ", comprimento=" + comprimento +
                '}';
    }
}
