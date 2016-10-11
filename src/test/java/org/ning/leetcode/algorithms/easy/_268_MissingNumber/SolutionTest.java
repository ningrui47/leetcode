package org.ning.leetcode.algorithms.easy._268_MissingNumber;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void testMissingNumber() {
        Solution solution = new Solution();
        assertThat(solution.missingNumber(new int[] { 0, 1, 2, 3, 5 }), is(4));
        assertThat(solution.missingNumber(new int[] { 1, 2, 3, 4, 5 }), is(0));
        assertThat(solution.missingNumber(new int[] { 0, 2 }), is(1));
        assertThat(solution.missingNumber(new int[] { 0 }), is(1));
    }

}
