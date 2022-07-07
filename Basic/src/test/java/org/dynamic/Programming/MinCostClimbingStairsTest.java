package org.dynamic.Programming;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinCostClimbingStairsTest {

    final int[] input1 = new int[]{10, 15, 20};
    final int[] input2 = new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1};

    MinCostClimbingStairs minCostClimbingStairsObj = new MinCostClimbingStairs();

    @Test
    @DisplayName("Testing Minimum Climbing stairs")
    public void testMinCostClimbingStairs() {
        assertAll(() -> assertEquals(6, minCostClimbingStairsObj.output(input2)),
                () -> assertEquals(6, minCostClimbingStairsObj.output(input2)));
    }
}