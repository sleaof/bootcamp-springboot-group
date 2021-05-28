package br.com.digitalhouse.demo.services.impl;

import br.com.digitalhouse.demo.dtos.HouseDTO;
import br.com.digitalhouse.demo.dtos.ResponseHouseDTO;
import br.com.digitalhouse.demo.dtos.RoomDTO;
import br.com.digitalhouse.demo.services.HouseJavaService;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class HouseServiceImpl implements HouseJavaService {

    //private static HashMap<String, Double> squareMetersPerPartOfTheHouse = new HashMap<>();


    @Override
    public ResponseHouseDTO calculateHouseData(HouseDTO houseDTO) {
        ResponseHouseDTO response = new ResponseHouseDTO();

        response.setTotalSquareMeters(getHouseSize(houseDTO));
        response.setHouseValue(getHouseValue(houseDTO));
        response.setBiggestRoom(getBiggestRoom(houseDTO));
        response.setSquareMetersofRoom(getHouseRoomsAmount(houseDTO));


        return response;
    }

    @Override
    public Double getHouseSize(HouseDTO houseDTO) {
        double totalSize = 0.0;

        for(RoomDTO r : houseDTO.getRooms()){
            totalSize += r.getHeight() * r.getWidth();
        }
        return totalSize;
    }

    @Override
    public Double getHouseValue(HouseDTO houseDTO) {
        return getHouseSize(houseDTO) * 800.00;
    }

    @Override
    public String getBiggestRoom(HouseDTO houseDTO) {
        String bigRoomName = "Big";
        double roomSize = 0.0;
        double aux = 0.0;

        for(RoomDTO r : houseDTO.getRooms()){
            roomSize = r.getHeight()*r.getWidth();
            if(aux < roomSize){
                aux = roomSize;
                bigRoomName = r.getName();

            }
        }
        return bigRoomName;
    }

    @Override
    public HashMap<String, Double> getHouseRoomsAmount(HouseDTO houseDTO) {
        HashMap<String, Double> roomsAmountHashMap = new HashMap<>();
        double sizeRoom = 0.0;

        for (RoomDTO r : houseDTO.getRooms()){
            sizeRoom = r.getHeight()* r.getWidth();
            roomsAmountHashMap.put(r.getName(), sizeRoom);
        }
        return roomsAmountHashMap;
    }
}
