package com.driver;

public class Boat implements WaterVehicle{
    String name="";
    int capacity=0;

    public Boat(String name,int capacity){
        this.name=name;
        this.capacity=capacity;
    }

    public Boat(){

    }
    @Override
    public int getVehicleCapacity() {
        return capacity;
    }

    @Override
    public String getVehicleName() {
        return name;
    }
}