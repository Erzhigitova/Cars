package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car{
    private double maxSpeed;

    public SportCar() {
    }

    public SportCar(String model, String carClass, double weight, Driver driver, Engine engine, double maxSpeed) {
        super(model, carClass, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        String sportCar = "Sport " + super.toString() + "\nSpeed: " + maxSpeed;
        return sportCar;

    }
}
