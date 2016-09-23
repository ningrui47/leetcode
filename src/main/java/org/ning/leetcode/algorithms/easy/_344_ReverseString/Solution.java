package org.ning.leetcode.algorithms.easy._344_ReverseString;

/**
 * 344. Reverse String <br/>
 * Write a function that takes a string as input and returns the string
 * reversed. <br/>
 * Example: Given s = "hello", return "olleh".
 */
public class Solution {

    /**
     * @param s the input string
     * @return the the string reversed
     */
    public String reverseString(String s) {

        if (null == s || s.length() < 2) {
            return s;
        }

        char[] chars = s.toCharArray();
        for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;

        }

        return new String(chars);
    }
}
