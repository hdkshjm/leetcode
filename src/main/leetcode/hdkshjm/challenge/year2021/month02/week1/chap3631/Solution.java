package leetcode.hdkshjm.challenge.year2021.month02.week1.chap3631;

class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] ret = new int[s.length()];

        char[] array = s.toCharArray();
        int distance = s.length();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == c) distance = 0;
            else distance++;
            ret[i] = distance;
        }

        distance = ret[array.length - 1];
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == c) distance = 0;
            else distance++;
            ret[i] = Math.min(distance, ret[i]);
        }

        return ret;
    }
}
