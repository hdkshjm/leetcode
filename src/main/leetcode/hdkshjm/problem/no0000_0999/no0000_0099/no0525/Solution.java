package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0525;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int length = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) count++;
            else count--;
            if (map.containsKey(count)) length = Math.max(length, i - map.get(count));
            else map.put(count, i);
        }

        return length;
    }
}

