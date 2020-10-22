package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0005;

class Solution {
    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        int end = 0;
        for (int i = 0; i < chars.length; i++) {
            int[] interval = getPalindrome(chars, i, i);
            // pattern: "AABAA"
            if (interval[1] - interval[0] > end - start) {
                start = interval[0];
                end = interval[1];
            }
            // pattern: "ABBA"
            interval = getPalindrome(chars, i, i + 1);
            if (interval[1] - interval[0] > end - start) {
                start = interval[0];
                end = interval[1];
            }
        }
        return s.substring(start, end + 1);
    }

    public int[] getPalindrome(char[] chars, int left, int right) {
        while (left >= 0 && right < chars.length) {
            if (chars[left] == chars[right]) {
                left--;
                right++;
            } else {
                break;
            }
        }
        return new int[]{left + 1, right - 1};
    }
}
