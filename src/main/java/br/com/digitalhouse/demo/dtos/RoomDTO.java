package br.com.digitalhouse.demo.dtos;

public class RoomDTO {

    private String name;
    private Double width;
    private Double height;

    public RoomDTO(String name, Double width, Double height) {
        this.name = name;
        this.width = width;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
}
