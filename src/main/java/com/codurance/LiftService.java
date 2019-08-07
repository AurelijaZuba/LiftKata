package com.codurance;

public class LiftService {

    private LiftStops lift;
    private Elevator elevator;

    public LiftService(LiftStops lift, Elevator elevator) {
        this.lift = lift;
        this.elevator = elevator;
    }

    public void lift(int[][] queue, int capacity) {
        elevator.floor(queue);
    }
}


