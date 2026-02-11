package model;

import enums.Brand;

public class Dodge extends Car {

    public Dodge(Engine engine) {
        super(engine);
        this.setBrand(Brand.DODGE);
    }

    public Dodge(Brand brand, String serialNumber, Engine engine) {
        super(brand, serialNumber, engine);
    }

    @Override
    public void drive() {
        System.out.println("Dodge driving");
    }
}
