package com.codurance;

import java.util.HashMap;

public class LiftService {
    private LiftLog log;
    private HashMap<String, LiftComponent> components;

    public LiftService(LiftLog log) {
        this.log = log;
        this.components = new HashMap<>();
    }

    private LiftComponent getComponentById(String componentId) {
        return components.get(componentId);
    }

    public void register(LiftComponent liftComponent){
        this.components.put(liftComponent.getId(), liftComponent);
    }

    public void notify(String message) {
        throw new UnsupportedOperationException();
    }

    public void call(int floorNumber) {
        LiftCarriage liftCarriage = (LiftCarriage) getComponentById("LiftCarriage");
        liftCarriage.command(floorNumber);
    }

    public void move(int floorNumber) {

        throw new UnsupportedOperationException();
    }
}
