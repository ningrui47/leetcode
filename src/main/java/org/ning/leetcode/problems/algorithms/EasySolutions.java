package org.ning.leetcode.problems.algorithms;

/**
 * Difficulty = easy problems and solutions
 */
public class EasySolutions {

    /**
     * 66. Plus One <br/>
     * Given a non-negative number represented as an array of digits, <br/>
     * plus one to the number. <br/>
     * The digits are stored such that the most significant digit is at the head
     * of the list.
     * @param digits array of digits
     * @return result represented as an arrayu of digits
     */
    public static int[] plusOne(int[] digits) {
        int[] temp = new int[digits.length];
        boolean plusFinished = false;

        for (int i = digits.length - 1; i > -1; i--) {
            if (plusFinished) {
                temp[i] = digits[i];
                continue;
            }

            if (digits[i] == 9) {
                temp[i] = 0;
            } else {
                temp[i] = digits[i] + 1;
                plusFinished = true;
            }
        }

        int[] result = temp;
        if (false == plusFinished) {
            result = new int[digits.length + 1];
            result[0] = 1;
            for (int i = 0; i < temp.length; i++) {
                result[i + 1] = temp[i];
            }
        }

        return result;

    }

    /**
     * 344. Reverse String <br/>
     * Write a function that takes a string as input and returns the string
     * reversed. <br/>
     * Example: Given s = "hello", return "olleh".
     * @param s the input string
     * @return the the string reversed
     */
    public static String reverseString(String s) {

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
