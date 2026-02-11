package model;

import enums.Brand;

import java.util.Objects;

public abstract class Car {
    private Brand brand;
    private String serialNumber;
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public Car(Brand brand) {
        this.brand = brand;
    }

    public Car(Brand brand, Engine engine) {
        this.brand = brand;
        this.engine = engine;
    }

    public Car(Brand brand, String serialNumber, Engine engine) {
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.engine = engine;
    }

    public void drive() {
        System.out.println("Car driving");
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return car.getBrand().equals(getBrand()) && Objects.equals(getSerialNumber(), car.getSerialNumber()) && Objects.equals(getEngine(), car.getEngine());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getSerialNumber(), getEngine());
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand=" + brand +
                ", serialNumber='" + serialNumber + '\'' +
                ", engine=" + engine +
                '}';
    }
}
