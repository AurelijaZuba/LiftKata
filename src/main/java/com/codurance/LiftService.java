package com.codurance;

public class LiftService {
    private LiftLog log;
    private LiftCarriage liftCarriage;

    public LiftService(LiftLog log, LiftCarriage liftCarriage) {
        this.log = log;
        this.liftCarriage = liftCarriage;
    }

    public void call(int floorNumber) {

        liftCarriage.command(floorNumber);
    }

    public void move(int floorNumber) {

        throw new UnsupportedOperationException();
    }
}
