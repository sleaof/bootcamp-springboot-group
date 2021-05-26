package br.com.digitalhouse.demo.services;

import org.springframework.stereotype.Service;

@Service
public interface CodigoMorseService {

    String traduzirCodigoMorse(String codigoMorse);

}
