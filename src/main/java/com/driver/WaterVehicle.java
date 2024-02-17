package com.driver;

public interface WaterVehicle {
    public String getVehicleName();
    public int getVehicleCapacity();
}


 class Boat implements WaterVehicle{
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