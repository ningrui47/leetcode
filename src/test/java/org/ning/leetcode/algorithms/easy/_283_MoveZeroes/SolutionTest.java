package org.ning.leetcode.algorithms.easy._283_MoveZeroes;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

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
public class SolutionTest {

    @Test
    public void testMoveZeroes() {
        Solution solution = new Solution();
        int[] arr = new int[] { 0, 1, 0, 3, 12 };
        solution.moveZeroes(arr);
        assertThat(arr, is(new int[] { 1, 3, 12, 0, 0 }));

        arr = new int[] { 0 };
        solution.moveZeroes(arr);
        assertThat(arr, is(new int[] { 0 }));

        arr = new int[] { 1 };
        solution.moveZeroes(arr);
        assertThat(arr, is(new int[] { 1 }));

        arr = new int[] { 0, 1 };
        solution.moveZeroes(arr);
        assertThat(arr, is(new int[] { 1, 0 }));

        arr = new int[] { 1, 0 };
        solution.moveZeroes(arr);
        assertThat(arr, is(new int[] { 1, 0 }));
    }

}
