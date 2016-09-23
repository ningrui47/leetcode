package org.ning.leetcode.algorithms.easy._66_PlusOne;

/**
 * 66. Plus One <br/>
 * Given a non-negative number represented as an array of digits, <br/>
 * plus one to the number. <br/>
 * The digits are stored such that the most significant digit is at the head of
 * the list.
 */
public class Solution {
    /**
     * 66. Plus One
     * @param digits array of digits
     * @return result represented as an array of digits
     */
    public int[] plusOne(int[] digits) {
        int[] temp = new int[digits.length];

        int carry = 1;
        for (int i = digits.length - 1; i > -1; i--) {
            temp[i] = digits[i] + carry;
            if (temp[i] > 9) {
                temp[i] %= 10;
            } else {
                carry = 0;
            }
        }

        int[] result = temp;
        if (carry > 0) {
            result = new int[digits.length + 1];
            result[0] = 1;
            for (int i = 0; i < temp.length; i++) {
                result[i + 1] = temp[i];
            }
        }

        return result;
    }

}
