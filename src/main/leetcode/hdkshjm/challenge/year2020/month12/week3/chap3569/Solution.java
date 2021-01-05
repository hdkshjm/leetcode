package leetcode.hdkshjm.challenge.year2020.month12.week3.chap3569;

import java.util.HashMap;
import java.util.Map;

class Solution {
    // o(n^2)
    // Runtime: 60 ms
    // Memory Usage: 58.3 MB
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        //sum, count
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : A) {
            for (int b : B) {
                map.put(a + b, map.getOrDefault(a + b, 0) + 1);
            }
        }
        int result = 0;
        for (int c : C) {
            for (int d : D) {
                result += map.getOrDefault(-c - d, 0);
            }
        }
        return result;
    }
}
