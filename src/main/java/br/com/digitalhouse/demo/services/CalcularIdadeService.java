package br.com.digitalhouse.demo.services;

import org.springframework.stereotype.Service;

@Service
public interface CalcularIdadeService {

    Integer calcularIdade(String dia, String mes, String ano);
}
