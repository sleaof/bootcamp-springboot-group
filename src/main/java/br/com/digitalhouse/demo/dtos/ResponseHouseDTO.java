package br.com.digitalhouse.demo.dtos;

import java.util.HashMap;

public class ResponseHouseDTO {

    private double totalSquareMeters;
    private double houseValue;
    private String biggestRoom;
    private HashMap<String, Double> squareMetersofRoom;

    public ResponseHouseDTO(){
    }

    public ResponseHouseDTO(double totalSquareMeters, double houseValue, String biggestRoom, HashMap<String, Double> squareMetersofRoom) {
        this.totalSquareMeters = totalSquareMeters;
        this.houseValue = houseValue;
        this.biggestRoom = biggestRoom;
        this.squareMetersofRoom = squareMetersofRoom;
    }

    public double getTotalSquareMeters() {
        return totalSquareMeters;
    }

    public void setTotalSquareMeters(double totalSquareMeters) {
        this.totalSquareMeters = totalSquareMeters;
    }

    public double getHouseValue() {
        return houseValue;
    }

    public void setHouseValue(double houseValue) {
        this.houseValue = houseValue;
    }

    public String getBiggestRoom() {
        return biggestRoom;
    }

    public void setBiggestRoom(String biggestRoom) {
        this.biggestRoom = biggestRoom;
    }

    public HashMap<String, Double> getSquareMetersofRoom() {
        return squareMetersofRoom;
    }

    public void setSquareMetersofRoom(HashMap<String, Double> squareMetersofRoom) {
        this.squareMetersofRoom = squareMetersofRoom;
    }
}
