package model;

import enums.EngineType;

public class Engine {
    private EngineType engineType;

    public Engine(EngineType engineType) {
        this.engineType = engineType;
    }
    public void startEngine(){
        System.out.println("Engine started");
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }
}
