package br.com.digitalhouse.price.Repository;

import br.com.digitalhouse.price.DTOs.PriceDTO;

public interface PriceRepository {
    PriceDTO findPriceByLocation(String location);
}
