package repository;

import exception.CarNotFoundException;
import model.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarsRepository {
    public static final List<Car> cars = new ArrayList<>();

    public static List<Car> getAllCars() {
        return Collections.unmodifiableList(cars);
    }

    public static boolean addCar(Car car) {
        return cars.add(car);
    }

    public static boolean removeCar(Car car) {
        return cars.remove(car);
    }

    public static Car getCarBySerialNumber(String serialNumber) {
        for (Car car : cars) {
            if (car.getSerialNumber().equals(serialNumber)) {
                return car;
            } else {
                throw new CarNotFoundException("Car with serial number " + serialNumber + " not found");
            }
        }
        return null;
    }
}


