package org.dynamic.Programming;

import java.util.HashMap;

/***
 * Problem statement:
 * You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either
 * climb one or two steps. You can either start from the step with index 0, or the step with index 1.
 *
 * Return the minimum cost to reach the top of the floor.
 * Input: cost = [10,15,20]
 * Output: 15
 * Explanation: You will start at index 1.
 * - Pay 15 and climb two steps to reach the top.
 * The total cost is 15.
 *
 * Input: cost = [1,100,1,1,1,100,1,1,100,1]
 * Output: 6
 * Explanation: You will start at index 0.
 * - Pay 1 and climb two steps to reach index 2.
 * - Pay 1 and climb two steps to reach index 4.
 * - Pay 1 and climb two steps to reach index 6.
 * - Pay 1 and climb one step to reach index 7.
 * - Pay 1 and climb two steps to reach index 9.
 * - Pay 1 and climb one step to reach the top.
 * The total cost is 6.
 *
 * Say f[i] is the final cost to climb to the top from step i. Then f[i] = cost[i] + min(f[i+1], f[i+2]).
 */


public class MinCostClimbingStairs {

    private final HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();

    private int minimumCost(int i, int[] cost) {

        //int costValue = 0;
        // Base Case, You can either start from the step with index 0, or the step with index 1.
        if (i <= 1) {
            return 0;
        }

        if (memo.containsKey(i)) {
            return memo.get(i);
        }


        int downOne = cost[i - 1] + minimumCost(i - 1, cost);
        int downTwo = cost[i - 2] + minimumCost(i - 2, cost);
        memo.put(i, Math.min(downOne, downTwo));

        return memo.get(i);


    }

    public int output(int[] input) {
        return minimumCost(input.length, input);
    }
}
