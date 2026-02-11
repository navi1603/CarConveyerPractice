package service;

import commone.TechTask;
import enums.Brand;
import enums.EngineType;
import exception.IncorrectBrandException;
import model.*;

import java.util.ArrayList;
import java.util.List;

public class ConveyerService {

    public List<Car> generateCarsByTechTask() {
        List<Car> preparedCarList = new ArrayList<>();
        TechTask.mapBrandAmount.forEach((brand, amount) -> {
            for (int i = 0; i <= amount; i++) {
                preparedCarList.add(makeCar(brand));
            }
        });
        return preparedCarList;
    }

    public Car makeCar(Brand brand) {
        switch (brand) {
            case LADA:
                return new Lada(setUpEngine(Brand.LADA));
            case DODGE:
                return new Dodge(setUpEngine(Brand.DODGE));
            default:
                throw new IncorrectBrandException();
        }
    }

    public Engine setUpEngine(Brand brand) {
        return Brand.LADA.equals(brand) ? new Engine(EngineType.ATMOSPHERE) : new Engine(EngineType.TURBO);
    }
}
