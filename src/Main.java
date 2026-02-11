import enums.Brand;
import model.Car;
import service.ConveyerService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) {
        ConveyerService conveyerService = new ConveyerService();
        List<Car> cars = conveyerService.generateCarsByTechTask();

        Map<Brand, Integer> brandAmount = new HashMap<>();
        cars.stream().forEach(car -> brandAmount.put(car.getBrand(),
                brandAmount.containsKey(car.getBrand()) ? brandAmount.get(car.getBrand()) + 1 : 0));

        System.out.printf("Автомобилей Lada: %s \nАвтомобилей Dodge: %d",
                brandAmount.get(Brand.LADA), brandAmount.get(Brand.DODGE));
    }
}
