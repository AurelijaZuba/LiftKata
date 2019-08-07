package com.codurance.Unit;

import com.codurance.Elevator;
import com.codurance.LiftService;
import com.codurance.LiftStops;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ElevatorShould {

    @Test
    void start_on_the_ground_floor() {
        int[][] expectedFloor = { new int[0] };
        int[][] queue = { new int[0] };
        int capacity = 0;

        LiftStops liftMock = mock(LiftStops.class);
        Elevator elevator = mock(Elevator.class);

        LiftService liftService = new LiftService(liftMock, elevator);
        liftService.elevator(queue, capacity);

        verify(elevator).floor(expectedFloor);
    }
}
