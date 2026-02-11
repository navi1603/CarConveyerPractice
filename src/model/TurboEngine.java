package model;

import enums.EngineType;

public class TurboEngine extends Engine {
    public TurboEngine() {
        super(EngineType.TURBO);
    }

    @Override
    public void startEngine() {
        System.out.println("Turbo engine was started");
    }
}
