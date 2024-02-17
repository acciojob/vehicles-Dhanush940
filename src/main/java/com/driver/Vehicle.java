package com.driver;

public class Vehicle {

    public String getName() {
        return name;
    }

    private String name;

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed+=currentSpeed;
    }

    private int currentSpeed;

    public int getCurrentDirection() {
        return currentDirection;
    }

    private int currentDirection;

    public Vehicle(String name) {
        currentSpeed=0;
        currentDirection=0;
    }
    public Vehicle(){

    }

    public void steer(int direction){
        //direction is in degrees, add it to the current direction
        this.currentDirection+=direction;
        System.out.println("steer method called - The direction is changed to: " + currentDirection + " degrees");
    }

    public void move(int speed, int direction){
        //set the values of currentSpeed and currentDirection
        this.currentSpeed=speed;
        this.currentDirection=direction;
        System.out.println("move method called - The speed is changed to: " + currentSpeed + ", and the direction is changed to: " + currentDirection + " degrees");
    }

    public void stop(){
        this.currentSpeed=0;
        System.out.println("stop method called - The vehicle is stopped");
    }

}
