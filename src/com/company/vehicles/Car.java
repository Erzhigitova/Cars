package com.company.vehicles;

/*����� Car �������� ���� - ����� ����������, ����� ����������, ���, �������� ���� Driver, ����� ���� Engine. ������ start()stop(),
turnRight()turnLeft() ������� ������� �� ������: "�������", "���������������", "������� �������" ��� "������� ������".
� ����� ����� toString(), ������� ������� ������ ���������� �� ����������,
�� �������� � ������. ������� ����������� �� Car �����  - Lorry (��������),
��������������� ����� ����������������� ������.������� ����������� �� Car ����� - SportCar,
��������������� ����� ���������� ���������.����� ����� Driver ��������� ����� Person.
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
    /*������ start()stop(),
    turnRight()turnLeft() ������� ������� �� ������: "�������", "���������������", "������� �������" ��� "������� ������".*/

    public void start(){
        System.out.println("�������");
    }

    public void stop(){
        System.out.println("���������������");
    }

    public void turnRight(){
        System.out.println("������� �������");
    }

    public void turnLeft(){
        System.out.println("������� ������");
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
