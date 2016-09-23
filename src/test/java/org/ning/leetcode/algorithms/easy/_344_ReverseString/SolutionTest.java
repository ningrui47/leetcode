package org.ning.leetcode.algorithms.easy._344_ReverseString;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * 344. Reverse String <br/>
 * Write a function that takes a string as input and returns the string
 * reversed. <br/>
 * Example: Given s = "hello", return "olleh".
 */
public class SolutionTest {

    @Test
    public void testReverseString() {
        Solution solution = new Solution();
        assertThat(solution.reverseString(null), nullValue()); // $NON-NLS-1$
        assertThat(solution.reverseString(""), is("")); //$NON-NLS-1$ //$NON-NLS-2$
        assertThat(solution.reverseString("x"), is("x")); //$NON-NLS-1$//$NON-NLS-2$
        assertThat(solution.reverseString("ab"), is("ba")); //$NON-NLS-1$ //$NON-NLS-2$
        assertThat(solution.reverseString("xyz"), is("zyx")); //$NON-NLS-1$ //$NON-NLS-2$

        return;
    }

}
