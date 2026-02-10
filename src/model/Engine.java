package model;

import enums.EngineType;

public final class Engine {
    private EngineType engineType;

    public Engine(EngineType engineType) {
        this.engineType = engineType;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }
}
