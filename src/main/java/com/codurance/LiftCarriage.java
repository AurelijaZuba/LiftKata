package com.codurance;

public class LiftCarriage implements LiftComponent{
    private LiftService liftService;
    private String componentId;

    public LiftCarriage(LiftService liftService, String componentId) {
        this.liftService = liftService;
        setId(componentId);
    }

    public void command(int floorNumber) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setId(String componentName) {
        this.componentId = componentName;
    }

    @Override
    public String getId() {
        return componentId;
    }
}
