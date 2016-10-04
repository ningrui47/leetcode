package org.ning.leetcode.algorithms.easy._258_AddDigits;

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
public class Solution {
    /**
     * @param num a non-negative integer number
     * @return the only one digit while repeatedly add all its digits
     */
    public int addDigits(int num) {
        if (num < 10) {
            return num;
        }

        int remain = num % 9;
        if (0 == remain) {
            remain = 9;
        }

        return remain;
    }

}
