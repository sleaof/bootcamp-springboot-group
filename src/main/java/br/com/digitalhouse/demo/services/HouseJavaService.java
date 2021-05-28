package br.com.digitalhouse.demo.services;

import br.com.digitalhouse.demo.dtos.HouseDTO;
import br.com.digitalhouse.demo.dtos.ResponseHouseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.DoubleBuffer;
import java.util.HashMap;

@Service
public interface HouseJavaService {


    public ResponseHouseDTO calculateHouseData(HouseDTO houseDTO);

    public Double getHouseSize(HouseDTO houseDTO);

    public Double getHouseValue(HouseDTO houseDTO);

    public String getBiggestRoom(HouseDTO houseDTO);

    public HashMap<String, Double> getHouseRoomsAmount(HouseDTO houseDTO);
}
