package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car{
    private double loadCapacity;

    public Lorry(){
    }

    public Lorry(String model, String carClass, double weight, Driver driver, Engine engine, double loadCapacity) {
        super(model, carClass, weight, driver, engine);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        String lorry = "Lorry " + super.toString() + "\nloadCapacity: " + loadCapacity;
        return lorry;

    }
}
