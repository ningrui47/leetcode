package org.ning.leetcode.algorithms.easy._409_LongestPalindrome;

/**
 * 409. Longest Palindrome<br/>
 * Given a string which consists of lowercase or uppercase letters, find the
 * length of the longest palindromes that can be built with those letters.<br/>
 * This is case sensitive, for example "Aa" is not considered a palindrome here.
 * <br/>
 * Note: Assume the length of given string will not exceed 1,010. <br/>
 * Example:<br/>
 * Input: "abccccdd" <br/>
 * Output: 7 <br/>
 * Explanation: One longest palindrome that can be built is "dccaccd", whose
 * length is 7.
 */
public class Solution {
    public int longestPalindrome(String s) {
        int[][] map = new int[127][2];

        char[] arr = s.toCharArray();
        if (arr.length < 2) {
            return arr.length;
        }

        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            map[c - 1][1]++;
        }

        int oddLength = 0, evenLength = 0;
        int oddCount = 0, oneCount = 0;

        for (int i = 0; i < map.length; i++) {
            if (map[i][1] == 0) {
                continue;
            }

            if (map[i][1] % 2 == 0) {
                evenLength += map[i][1];
            } else {
                oddLength += map[i][1];
                if (1 == map[i][1]) {
                    oneCount++;
                }

                oddCount++;
            }
        }

        int sum = evenLength;
        if (oneCount > 1) {
            oddLength -= oneCount - 1;
            oddCount -= oneCount - 1;
        }

        if (oddCount > 0) {
            sum += oddLength - oddCount + 1;
        }

        return sum;
    }
}
