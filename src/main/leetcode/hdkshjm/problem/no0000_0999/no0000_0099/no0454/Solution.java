package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0454;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            for (int j : nums2) {
                int sum = i + j;
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }

        int count = 0;
        for (int i : nums3) for (int j : nums4) count += map.getOrDefault(-i - j, 0);

        return count;
    }
}
