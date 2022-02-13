package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0560;

import java.util.*;

class Solution {
    public int subarraySum(int[] nums, int k) {
        // k = sum(i,j) = sum(0,j) - sum(0,i)
        // sum(0,i) = sum(0,j) - k
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int count = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k)) count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
