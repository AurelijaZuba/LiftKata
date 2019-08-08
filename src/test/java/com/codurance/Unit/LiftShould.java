package com.codurance.Unit;

import com.codurance.LiftConsole;
import com.codurance.LiftService;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.mockito.Mockito.mock;

public class LiftShould {

    @Test
    void start_on_the_ground_floor() {
        int[][] groundFloor = { new int[0] };

        LiftConsole liftConsoleMock = mock(LiftConsole.class);

        LiftService liftService = new LiftService(liftConsoleMock);
        liftService.lift(groundFloor);

        assertThat(liftService.currentFloor(groundFloor)).isEqualTo(new int[0]);
    }
}
