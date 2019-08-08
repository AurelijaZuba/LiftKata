package com.codurance.Unit;

import com.codurance.LiftCarriage;
import com.codurance.LiftLog;
import com.codurance.LiftService;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class LiftServiceShould {

    @Test
    void call_lift_carriage_to_a_given_floor() {
        int groundFloor = 0;
        LiftCarriage liftCarriageMock = mock(LiftCarriage.class);
        LiftLog logMock = mock(LiftLog.class);

        LiftService liftService = new LiftService(logMock, liftCarriageMock);
        liftService.call(groundFloor);

        verify(liftCarriageMock).command(groundFloor);
    }
}
