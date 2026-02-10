package model;

import java.util.Objects;

public abstract class Car {
    private String serialNumber;

    private Engine engine;

    protected Car() {

    }
    protected Car(String serialNumber, Engine engine) {
        this.serialNumber = serialNumber;
        this.engine = engine;
    }
    public void drive() {
        System.out.println("Car driving");
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
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
        return Objects.equals(getSerialNumber(), car.getSerialNumber()) && Objects.equals(getEngine(), car.getEngine());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSerialNumber(), getEngine());
    }

    @Override
    public String toString() {
        return "Car{" +
                "serialNumber='" + serialNumber + '\'' +
                ", engine=" + engine +
                '}';
    }
}
