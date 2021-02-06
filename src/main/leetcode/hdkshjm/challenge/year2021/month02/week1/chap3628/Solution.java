package leetcode.hdkshjm.challenge.year2021.month02.week1.chap3628;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) map.merge(n, 1, Integer::sum);

        int max = 0;
        for (int n : map.keySet()) {
            if (map.containsKey(n - 1)) max = Math.max(max, map.get(n) + map.get(n - 1));
        }
        return max;
    }
}
