package model;

import enums.Brand;

public class Lada extends Car{

    public Lada( Engine engine) {
        super(engine);
        this.setBrand(Brand.LADA);
    }

    public Lada(Brand brand, String serialNumber, Engine engine) {
        super(brand, serialNumber, engine);
    }

    @Override
    public void drive() {
        System.out.println("Lada driving");
    }
}
