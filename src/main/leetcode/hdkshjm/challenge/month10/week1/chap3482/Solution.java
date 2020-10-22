package leetcode.hdkshjm.challenge.month10.week1.chap3482;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        int count = 0;

        if (k == 0) {
            for (int n: map.keySet()) {
                if (map.get(n) > 1)
                    count++;
            }
        } else {
            for (int n : map.keySet()) {
                if (map.containsKey((n + k)))
                    count++;
            }
        }

        return count;
    }
}