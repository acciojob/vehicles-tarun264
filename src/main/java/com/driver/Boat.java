package com.driver;

public class Boat implements WaterVehicle {
    private String name;
    private  int capacity;

    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public Boat() {
    }

    @Override
    public String getVehicleName() {
        return null;
    }

    @Override
    public int getVehicleCapacity() {
        return 0;
    }

    public String getName() {
        return this.name=getVehicleName();
    }

    public int getCapacity() {
        return this.capacity=getCapacity();
    }
}
