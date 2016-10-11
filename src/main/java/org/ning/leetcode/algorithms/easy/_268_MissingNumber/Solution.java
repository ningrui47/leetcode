package org.ning.leetcode.algorithms.easy._268_MissingNumber;

/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find
 * the one that is missing from the array. <br/>
 * For example, Given nums = [0, 1, 3] return 2. <br/>
 * Note: Your algorithm should run in linear runtime complexity. Could you
 * implement it using only constant extra space complexity?
 */
public class Solution {
    /**
     * @param nums an array containing n distinct numbers taken from 0, 1, 2,
     *            ..., n,
     * @return the one that is missing from the array
     */
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expected = (1 + n) * n / 2;

        int actual = 0;
        for (int i = 0; i < nums.length; i++) {
            actual += nums[i];
        }

        int missed = expected - actual;

        return missed;
    }

}
