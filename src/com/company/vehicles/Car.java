package com.company.vehicles;

/*Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, водитель типа Driver, мотор типа Engine. Методы start()stop(),
turnRight()turnLeft() которые выводят на печать: "Поехали", "Останавливаемся", "Поворот направо" или "Поворот налево".
А также метод toString(), который выводит полную информацию об автомобиле,
ее водителе и моторе. Создать производный от Car класс  - Lorry (грузовик),
характеризуемый также грузоподъемностью кузова.Создать производный от Car класс - SportCar,
характеризуемый также предельной скоростью.Пусть класс Driver расширяет класс Person.
 */

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {

    private String model;
    private String carClass;
    private double weight;
    private Driver driver;
    private Engine engine;

    public Car() {
    }

    public Car(String model, String carClass, double weight, Driver driver, Engine engine) {
        this.model = model;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    /*Методы start()stop(),
    turnRight()turnLeft() которые выводят на печать: "Поехали", "Останавливаемся", "Поворот направо" или "Поворот налево".*/

    public void start(){
        System.out.println("Поехали");
    }

    public void stop(){
        System.out.println("Останавливаемся");
    }

    public void turnRight(){
        System.out.println("Поворот направо");
    }

    public void turnLeft(){
        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        return "Car" +
                "\nModel: " + model +
                "\nClass: " + carClass +
                "\nWeight: " + weight +
                "\nDriver " + driver +
                "\nEngine " + engine;

    }
}
