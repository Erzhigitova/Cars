package com.company.professions;

public class Driver extends Person{
    private double experience;

    public Driver() {
    }

    public Driver(String firstName, String lastName, int age, double experience) {
        super(firstName, lastName, age);
        this.experience = experience;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "\nExperience: " + experience;
    }
}
