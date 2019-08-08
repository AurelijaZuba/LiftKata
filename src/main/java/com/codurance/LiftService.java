package com.codurance;

public class LiftService {
    private LiftLog log;

    public LiftService(LiftLog log, LiftCarriage liftCarriageMock) {
        this.log = log;
    }

    public void call(int currentFloor) {

        throw new UnsupportedOperationException();
    }

    public void move(int floorNumber) {

        throw new UnsupportedOperationException();
    }
}
