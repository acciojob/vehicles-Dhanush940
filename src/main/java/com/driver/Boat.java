package com.driver;

public class Boat implements WaterVehicle{
    String name="";
    int capacity=0;
    @Override
    public int getVehicleCapacity() {
        return capacity;
    }

    @Override
    public String getVehicleName() {
        return name;
    }
}