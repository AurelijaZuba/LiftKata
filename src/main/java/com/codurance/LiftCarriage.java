package com.codurance;

public class LiftCarriage {
    private LiftService liftService;

    public LiftCarriage(LiftService liftService) {

        this.liftService = liftService;
    }

    public void command(int floorNumber) {
        throw new UnsupportedOperationException();
    }
}
