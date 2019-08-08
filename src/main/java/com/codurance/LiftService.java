package com.codurance;

import static java.util.Arrays.asList;

public class LiftService {
    private LiftConsole liftConsole;

    public LiftService(LiftConsole liftConsole) {

        this.liftConsole = liftConsole;
    }

    public void lift(int[][] queue) {
        liftConsole.record(queue);
    }

    public int[] currentFloor(int[][] groundFloor) {
        throw new UnsupportedOperationException();
    }
}
