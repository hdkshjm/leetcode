package leetcode.hdkshjm.challenge.month10.week4.chap3505;

import java.util.Map;
import java.util.TreeMap;

class Solution {
    public boolean find132pattern(int[] nums) {
        Map<Integer, Integer> countMap = new TreeMap<>();
        int[] minNumsFromStart = new int[nums.length];
        minNumsFromStart[0] = nums[0];
        for (int i = 1; i < minNumsFromStart.length; i++) {
            countMap.put(nums[i], countMap.getOrDefault(nums[i], 0) + 1);
            minNumsFromStart[i] = Math.min(minNumsFromStart[i - 1], nums[i]);
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > minNumsFromStart[i - 1]) {
                for (int k : countMap.keySet()) {
                    if (nums[i] > k && minNumsFromStart[i - 1] < k) {
                        return true;
                    }
                }
            }

            int cnt = countMap.get(nums[i]);
            if (cnt == 1) {
                countMap.remove(nums[i]);
            } else {
                countMap.put(nums[i], cnt - 1);
            }
        }
        return false;
    }
}
