package br.com.digitalhouse.demo.dtos;

public class ResponseStudentDTO {

    private String name;
    private Double avarage;
    private String msg;

    public ResponseStudentDTO(){
    }

    public ResponseStudentDTO(String name, Double avarage, String msg) {
        this.name = name;
        this.avarage = avarage;
        this.msg = msg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAvarage() {
        return avarage;
    }

    public void setAvarage(Double avarage) {
        this.avarage = avarage;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
