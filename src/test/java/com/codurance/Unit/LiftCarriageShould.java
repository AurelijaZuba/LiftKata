package com.codurance.Unit;

import com.codurance.LiftCarriage;
import com.codurance.LiftService;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class LiftCarriageShould {

    @Test
    void go_to_a_given_floor_and_lift_stops() {
        int floorNumber = 0;
        LiftService liftServiceMock = mock(LiftService.class);

        LiftCarriage liftCarriage = new LiftCarriage(liftServiceMock, "LiftCarriage");
        liftCarriage.command(floorNumber);

        verify(liftServiceMock).notify("Lift moving");
        verify(liftServiceMock).notify("Lift stopping");
    }
}
