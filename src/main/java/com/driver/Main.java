package com.driver;

public class Main {
    public static class Boat implements WaterVehicle{
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
    public static void main(String[] args) {
        F1 mercedes = new F1("mercedes", false);
        mercedes.move(40, 0);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);
    }
}