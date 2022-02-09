package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0532;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

        int count = 0;
        if (k == 0) {
            for (int c : map.values()) if (c > 1) count++;
        } else {
            for (int n : map.keySet()) if (map.containsKey(n + k)) count++;
        }
        return count;
    }
}

