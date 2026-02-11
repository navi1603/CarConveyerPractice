package model;

import enums.EngineType;

public class AtmosphereEngine extends Engine {
    public AtmosphereEngine() {
        super(EngineType.ATMOSPHERE);
    }

    @Override
    public void startEngine() {
        System.out.println("Atmosphere engine was started");
    }
}
