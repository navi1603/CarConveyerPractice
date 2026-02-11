package service;

import model.Dodge;
import model.Engine;

public class DodgeProduce implements Produce {
    @Override
    public Dodge create(String serialNumber, Engine engine) {
        return new Dodge(engine);
    }
}
