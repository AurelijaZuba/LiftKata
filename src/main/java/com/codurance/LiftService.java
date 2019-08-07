package com.codurance;

public class LiftService {
    private LiftStops liftMock;
    private Elevator elevator;

    public LiftService(LiftStops liftMock, Elevator elevator) {
        this.liftMock = liftMock;
        this.elevator = elevator;
    }

    public void elevator(int[][] queue, int capacity) {
        elevator.floor(queue);
    }
}
