package com.codurance.Acceptance;

import com.codurance.LiftConsole;
import com.codurance.LiftService;
import org.junit.jupiter.api.Test;

import static java.util.Arrays.asList;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class LiftFeature {


    @Test
    void AcceptanceTest() {
        int[][] queue = {
                new int[0],                 //G
                new int[]{5, 5, 2},         //1
                new int[]{4},               //2
                new int[0],                 //3
                new int[]{0, 0, 0},         //4
                new int[0]                  //5

        };
        int[][] secondQueue = {
                new int[]{2},               //G
                new int[]{3, 5, 4, 5, 2},   //1
                new int[0],                 //2
                new int[]{1 ,1, 2} ,        //3
                new int[]{1, 4, 3, 2},      //4
                new int[]{0}                //5

        };
        LiftConsole liftConsole = mock(LiftConsole.class);

        LiftService liftService = new LiftService(liftConsole);
        liftService.lift(queue);
        liftService.lift(secondQueue);

        verify(liftConsole).record(
                asList(new int[]{0, 0, 0, 0},
                        new int[]{1, 1, 1},
                        new int[]{2, 2, 2, 2, 2},
                        new int[]{3, 3},
                        new int[]{4, 4, 4},
                        new int[]{5, 5, 5, 5}));

    }
}
