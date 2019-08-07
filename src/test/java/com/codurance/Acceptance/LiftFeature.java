package com.codurance.Acceptance;

import com.codurance.Elevator;
import com.codurance.LiftService;
import com.codurance.LiftStops;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class LiftFeature {

    @Test
    void AcceptanceTest() {
        int capacity = 5;
        int[][] queue = {
                new int[0],                 //G
                new int[]{6, 5, 2},         //1
                new int[]{4},               //2
                new int[0],                 //3
                new int[]{0, 0, 0},         //4
                new int[0],                 //5
                new int[0],                 //6
                new int[]{3, 6, 4, 5, 6},   //7
                new int[0],                 //8
                new int[]{1 ,10, 2},        //9
                new int[]{1, 4, 3, 2}       //10
        };

        LiftStops liftMock = mock(LiftStops.class);
        Elevator elevator = mock(Elevator.class);


        LiftService liftService = new LiftService(liftMock, elevator);
        liftService.lift(queue, capacity);


        verify(liftMock).liftStops("  /----------------|  |----------------\\");
        verify(liftMock).liftStops("10|             10 |  |                |");
        verify(liftMock).liftStops("  |----------------|  |----------------|");
        verify(liftMock).liftStops(" 9|                |  |                |");
        verify(liftMock).liftStops("  |----------------|  |----------------|");
        verify(liftMock).liftStops(" 8|                |  |                |");
        verify(liftMock).liftStops("  |----------------|  |----------------|");
        verify(liftMock).liftStops(" 7|                |  |                |");
        verify(liftMock).liftStops("  |----------------|  |----------------|");
        verify(liftMock).liftStops(" 6|          6,6,6 |  |                |");
        verify(liftMock).liftStops("  |----------------|  |----------------|");
        verify(liftMock).liftStops(" 5|            5,5 |  |                |");
        verify(liftMock).liftStops("  |----------------|  |----------------|");
        verify(liftMock).liftStops(" 4|          4,4,4 |  |                |");
        verify(liftMock).liftStops("  |----------------|  |----------------|");
        verify(liftMock).liftStops(" 3|            3,3 |  |                |");
        verify(liftMock).liftStops("  |----------------|  |----------------|");
        verify(liftMock).liftStops(" 2|          2,2,2 |  |                |");
        verify(liftMock).liftStops("  |----------------|  |----------------|");
        verify(liftMock).liftStops(" 1|            1,1 |  |                |");
        verify(liftMock).liftStops("  |----------------|  |----------------|");
        verify(liftMock).liftStops(" G|          0,0,0 |  |                |");
        verify(liftMock).liftStops("  |====================================|");

    }
}
