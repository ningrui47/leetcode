package org.ning.leetcode.algorithms.easy._258_AddDigits;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * 258. Add Digits<br/>
 * Given a non-negative integer num, repeatedly add all its digits until the
 * result has only one digit.<br/>
 * For example:<br/>
 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only
 * one digit, return it.<br/>
 * Follow up: <br/>
 * Could you do it without any loop/recursion in O(1) runtime?
 */
public class SolutionTest {

    @Test
    public void testAddDigits() {
        Solution solution = new Solution();

        assertThat(0, is(solution.addDigits(0)));
        assertThat(9, is(solution.addDigits(9)));
        assertThat(2, is(solution.addDigits(11)));
        assertThat(1, is(solution.addDigits(91)));
        assertThat(2, is(solution.addDigits(191)));
        assertThat(9, is(solution.addDigits(90)));
    }

}
