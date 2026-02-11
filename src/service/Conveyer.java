package service;

import model.Car;
import model.Engine;

public class Conveyer {
    private final Produce producable;

    public Conveyer(Produce producable){
        this.producable = producable;
    }

    public Car createCar(String serialNumber, Engine engine){
        return producable.create(serialNumber, engine) ;
    }
}
