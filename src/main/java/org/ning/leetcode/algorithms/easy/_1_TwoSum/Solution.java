package org.ning.leetcode.algorithms.easy._1_TwoSum;

/**
 * 1. Two Sum<br/>
 * Given an array of integers, return indices of the two numbers such that they
 * add up to a specific target. You may assume that each input would have
 * exactly one solution. Example:<br/>
 * Given nums = [2, 7, 11, 15], target = 9, <br/>
 * Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == num) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[] { 0, 0 };

    }
}
