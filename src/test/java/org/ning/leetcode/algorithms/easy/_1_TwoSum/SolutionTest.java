package org.ning.leetcode.algorithms.easy._1_TwoSum;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void testTwoSum() {
        Solution solution = new Solution();

        assertThat(solution.twoSum(new int[] { 1, 2 }, 3), is(new int[] { 0, 1 }));
        assertThat(solution.twoSum(new int[] { -1, -2, -3, -4, -5 }, -8), is(new int[] { 2, 4 }));

        assertThat(solution.twoSum(new int[] { 1, 3 }, 3), is(new int[] { 0, 0 }));
        assertThat(solution.twoSum(new int[] { 1 }, 1), is(new int[] { 0, 0 }));
    }

}
