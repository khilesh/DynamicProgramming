package org.dynamic.Programming;

import java.util.HashMap;

/********
 * Problem Statement
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed,
 * the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and
 * it will automatically contact the police if two adjacent houses were broken into on the same night.
 *
 * Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can
 * rob tonight without alerting the police.
 *
 * Input: nums = [1,2,3,1]
 * Output: 4
 * Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
 * Total amount you can rob = 1 + 3 = 4.
 *
 * Input: nums = [2,7,9,3,1]
 * Output: 12
 * Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
 * Total amount you can rob = 2 + 9 + 1 = 12.
 */

class HouseRobber {
    private HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();
    private int[] nums;

    private int dp(int i) {
        if (i == 0) return nums[0];
        if (i == 1) return Math.max(nums[0], nums[1]);

        if (!memo.containsKey(i)) {
            memo.put(i, Math.max(dp(i - 1), dp(i - 2) + nums[i]));
        }
        return memo.get(i);
    }

    public int rob(int[] nums) {
        this.nums = nums;
        System.out.println("Hello Khilesh");
        return dp(nums.length - 1);
    }
/***
 public static void main (String [] args){
 System.out.println("Hello Khilesh");

 int [] input1 = new int[]{2,7,9,3,1};

 System.out.println("Hello Khilesh" + rob(input1));
 } **/
}
