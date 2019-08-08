package com.codurance;

import java.util.HashMap;

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

    public void notify(String message) {
        throw new UnsupportedOperationException();
    }

    public void register(LiftComponent liftComponent){

    }
}
