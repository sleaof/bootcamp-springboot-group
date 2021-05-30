package br.com.digitalhouse.demo.Repository;

import br.com.digitalhouse.demo.DTOs.PriceDTO;

public interface PriceRepository {
    PriceDTO findPriceByLocation(String location);
}
