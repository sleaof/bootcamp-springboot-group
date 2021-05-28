package br.com.digitalhouse.demo.controller;

import java.util.Arrays;
import java.util.List;

public class StreamApi {

    public static void main(String[] args) {

        List<String> listaNomes = Arrays.asList("Maria", "Raimunda");

        for(String s : listaNomes){
            System.out.println(s);
        }

        listaNomes.forEach((String s) -> {
            System.out.println(s);
        });

        listaNomes.forEach(System.out::println);

        Runnable r = new Runnable() {
            public void run() {
                System.out.println("Thread com metodo interno");
            }
        };

        Runnable r2 = () -> System.out.println("Thread com função lambda!");

        new Thread(r).start();
        new Thread(r2).start();

    }
}
