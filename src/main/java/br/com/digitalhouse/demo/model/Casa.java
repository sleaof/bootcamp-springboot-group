package br.com.digitalhouse.demo.model;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Casa {

    private String nome;
    private String end;
    List<Comodo> comodos = new ArrayList<>();


    public Casa(){
    }

    public Casa(String nome, String end, List<Comodo> comodos){

    }





}
