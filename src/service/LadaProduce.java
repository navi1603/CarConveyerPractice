package service;

import model.Engine;
import model.Lada;

public class LadaProduce implements Produce {
    @Override
    public Lada create(String serialNumber, Engine engine) {
        return new Lada(engine);
    }
}
