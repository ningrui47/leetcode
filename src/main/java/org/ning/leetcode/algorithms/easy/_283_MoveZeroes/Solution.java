package org.ning.leetcode.algorithms.easy._283_MoveZeroes;

/**
 * 283. Move Zeroes <br/>
 * Given an array nums, write a function to move all 0's to the end of it while
 * maintaining the relative order of the non-zero elements. <br/>
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums
 * should be [1, 3, 12, 0, 0]. <br/>
 * Note: <br/>
 * 1. You must do this in-place without making a copy of the array. <br/>
 * 2. Minimize the total number of operations.
 */
public class Solution {

    /**
     * 283. Move Zeroes
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }

        for (; j < nums.length; j++) {
            nums[j] = 0;
        }

        return;
    }
}
