package br.com.digitalhouse.demo.dto;

import lombok.Data;

@Data
public class HomeDTO {

    private String name;
    private String address;
    private ComfortableDTO comfortable;

}
