package com.company.details;

public class Engine {
    private String fuelType;
    private double power;
    private double torque;

    public Engine() {
    }

    public Engine(String fuelType, double power, double torque) {
        this.fuelType = fuelType;
        this.power = power;
        this.torque = torque;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getTorque() {
        return torque;
    }

    public void setTorque(double torque) {
        this.torque = torque;
    }

    @Override
    public String toString() {
        return "\nFuelType: " + fuelType +
                "\nPower: " + power +
                "\nTorque: " + torque;
    }
}
