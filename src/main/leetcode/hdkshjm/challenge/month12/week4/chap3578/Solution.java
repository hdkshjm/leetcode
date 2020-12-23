package leetcode.hdkshjm.challenge.month12.week4.chap3578;

import java.util.Arrays;

class Solution {
    public int nextGreaterElement(int n) {
        char[] array = String.valueOf(n).toCharArray();

        if (array.length == 1) return -1;

        int left = -1;
        outside:
        for (int i = array.length - 2; i >= 0; i--) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[i] < array[j]) {
                    char temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    left = i;
                    break outside;
                }
            }
        }
        if (left == -1) return -1;

        Arrays.sort(array, left + 1, array.length);
        StringBuilder sb = new StringBuilder();
        for (char c : array) {
            sb.append(c);
        }

        try {
            return Integer.valueOf(sb.toString());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
