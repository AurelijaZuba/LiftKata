package com.codurance;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

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


        LiftService liftService = new LiftService(liftMock);
        liftService.elevator(queue, capacity);


        verify(liftMock).print("  /----------------|  |----------------\\");
        verify(liftMock).print("10|             10 |  |                |");
        verify(liftMock).print("  |----------------|  |----------------|");
        verify(liftMock).print(" 9|                |  |                |");
        verify(liftMock).print("  |----------------|  |----------------|");
        verify(liftMock).print(" 8|                |  |                |");
        verify(liftMock).print("  |----------------|  |----------------|");
        verify(liftMock).print(" 7|                |  |                |");
        verify(liftMock).print("  |----------------|  |----------------|");
        verify(liftMock).print(" 6|          6,6,6 |  |                |");
        verify(liftMock).print("  |----------------|  |----------------|");
        verify(liftMock).print(" 5|            5,5 |  |                |");
        verify(liftMock).print("  |----------------|  |----------------|");
        verify(liftMock).print(" 4|          4,4,4 |  |                |");
        verify(liftMock).print("  |----------------|  |----------------|");
        verify(liftMock).print(" 3|            3,3 |  |                |");
        verify(liftMock).print("  |----------------|  |----------------|");
        verify(liftMock).print(" 2|          2,2,2 |  |                |");
        verify(liftMock).print("  |----------------|  |----------------|");
        verify(liftMock).print(" 1|            1,1 |  |                |");
        verify(liftMock).print("  |----------------|  |----------------|");
        verify(liftMock).print(" G|          0,0,0 |  |                |");
        verify(liftMock).print("  |====================================|");

    }
}
