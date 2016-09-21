package org.ning.leetcode.problems.algorithms;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * Difficulty = easy problems and solutions
 */
public class EasySolutionsTest {

    /**
     * 66. Plus One <br/>
     * Given a non-negative number represented as an array of digits, <br/>
     * plus one to the number. <br/>
     * The digits are stored such that the most significant digit is at the head
     * of the list.
     */
    @Test
    public void testPlusOne() {
        assertThat(EasySolutions.plusOne(new int[] { 0 }), is(new int[] { 1 }));
        assertThat(EasySolutions.plusOne(new int[] { 2 }), is(new int[] { 3 }));
        assertThat(EasySolutions.plusOne(new int[] { 9 }), is(new int[] { 1, 0 }));
        assertThat(EasySolutions.plusOne(new int[] { 1, 9 }), is(new int[] { 2, 0 }));
        assertThat(EasySolutions.plusOne(new int[] { 1, 2, 8 }), is(new int[] { 1, 2, 9 }));
        assertThat(EasySolutions.plusOne(new int[] { 1, 2, 9 }), is(new int[] { 1, 3, 0 }));
        assertThat(EasySolutions.plusOne(new int[] { 9, 9, 9 }), is(new int[] { 1, 0, 0, 0 }));
    }

    /**
     * 344. Reverse String <br/>
     * Write a function that takes a string as input and returns the string
     * reversed. <br/>
     * Example: Given s = "hello", return "olleh".
     */
    @Test
    public void testReverseString() {
        assertThat(EasySolutions.reverseString(null), nullValue()); // $NON-NLS-1$
        assertThat(EasySolutions.reverseString(""), is("")); //$NON-NLS-1$ //$NON-NLS-2$
        assertThat(EasySolutions.reverseString("x"), is("x")); //$NON-NLS-1$//$NON-NLS-2$
        assertThat(EasySolutions.reverseString("ab"), is("ba")); //$NON-NLS-1$ //$NON-NLS-2$
        assertThat(EasySolutions.reverseString("xyz"), is("zyx")); //$NON-NLS-1$ //$NON-NLS-2$

        return;
    }

}
