package org.ning.leetcode.algorithms.easy._409_LongestPalindrome;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void testLongestPalindrome() {
        Solution solution = new Solution();

        assertThat(solution.longestPalindrome(""), is(0));
        assertThat(solution.longestPalindrome("0"), is(1));
        assertThat(solution.longestPalindrome("bb"), is(2));
        assertThat(solution.longestPalindrome("abccccdd"), is(7));
        assertThat(solution.longestPalindrome("ab"), is(1));
        assertThat(solution.longestPalindrome("a"), is(1));
        assertThat(solution.longestPalindrome("abcdc"), is(3));
        assertThat(solution.longestPalindrome("aebcbc"), is(5));
        assertThat(solution.longestPalindrome("ababcdd"), is(7));
    }

}
