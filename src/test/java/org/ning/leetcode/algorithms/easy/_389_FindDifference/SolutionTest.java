package org.ning.leetcode.algorithms.easy._389_FindDifference;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void testFindTheDifference() {
        Solution solution = new Solution();

        assertThat(solution.findTheDifference("abc", "bcad"), is('d'));
        assertThat(solution.findTheDifference("a", "ba"), is('b'));
        assertThat(solution.findTheDifference("", "a"), is('a'));
    }

}
