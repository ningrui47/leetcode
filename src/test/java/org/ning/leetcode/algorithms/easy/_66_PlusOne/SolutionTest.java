package org.ning.leetcode.algorithms.easy._66_PlusOne;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * 66. Plus One <br/>
 * Given a non-negative number represented as an array of digits, <br/>
 * plus one to the number. <br/>
 * The digits are stored such that the most significant digit is at the head of
 * the list.
 */
public class SolutionTest {

    /**
     * 66. Plus One <br/>
     */
    @Test
    public void testPlusOne() {
        Solution solution = new Solution();

        assertThat(solution.plusOne(new int[] { 0 }), is(new int[] { 1 }));
        assertThat(solution.plusOne(new int[] { 2 }), is(new int[] { 3 }));
        assertThat(solution.plusOne(new int[] { 9 }), is(new int[] { 1, 0 }));
        assertThat(solution.plusOne(new int[] { 1, 9 }), is(new int[] { 2, 0 }));
        assertThat(solution.plusOne(new int[] { 1, 2, 8 }), is(new int[] { 1, 2, 9 }));
        assertThat(solution.plusOne(new int[] { 1, 2, 9 }), is(new int[] { 1, 3, 0 }));
        assertThat(solution.plusOne(new int[] { 9, 9, 9 }), is(new int[] { 1, 0, 0, 0 }));
    }

}
