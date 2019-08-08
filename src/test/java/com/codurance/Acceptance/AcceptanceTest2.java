package com.codurance.Acceptance;

import com.codurance.LiftCarriage;
import com.codurance.LiftLog;
import com.codurance.LiftService;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class AcceptanceTest2 {

        //Press button to go up from the ground floor
        //The door open
        //Pressed button to go floor 3
        //the door closed
        //the lift moves
        //the lift stops
        //the doors open on the 3rd floor
        //the doors close
    @Test
    void AcceptanceTest() {
        int currentFloor = 0;
        int floorNumber = 3;
        LiftLog logMock = mock(LiftLog.class);
        LiftCarriage liftCarriage = new LiftCarriage();

        LiftService liftService = new LiftService(logMock, liftCarriage);
        liftService.call(currentFloor);
        liftService.move(floorNumber);

        verify(logMock).logger("Button was pressed on the ground floor.");
        verify(logMock).logger("Doors opening");
        verify(logMock).logger("Button was pressed to go to floor 3");
        verify(logMock).logger("Doors closing");
        verify(logMock).logger("Lift moving");
        verify(logMock).logger("Lift stopping");
        verify(logMock).logger("Doors opening");
        verify(logMock).logger("Doors closing");
    }
}
