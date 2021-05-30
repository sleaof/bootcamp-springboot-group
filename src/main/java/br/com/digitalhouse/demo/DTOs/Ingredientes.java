package br.com.digitalhouse.demo.DTOs;

public class Ingredientes {
    private String name;
    private Integer calories;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Ingredientes{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                '}';
    }
}
