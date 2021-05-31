package br.com.digitalhouse.demo.DTOs;

public class ResponseDiploma {
    private String nomeAluno;
    private Double mediaAluno;
    private String mensagem;

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public Double getMediaAluno() {
        return mediaAluno;
    }

    public void setMediaAluno(Double mediaAluno) {
        this.mediaAluno = mediaAluno;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
