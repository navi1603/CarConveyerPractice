package service;

import model.Car;
import model.Engine;

public interface Produce {
    Car create(String serialNumber, Engine engine);
}