package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0001;

import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer[]> map = new HashMap<Integer, Integer[]>();
        for (int i = 0; i < nums.length; i++) {
            Integer[] indices = map.getOrDefault(nums[i], new Integer[]{i, i});
            indices[1] = i;
            map.put(nums[i], indices);
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                if (target == nums[i] << 1) {
                    Integer[] indices = map.get(nums[i]);
                    if (indices[0] != indices[1]) {
                        return new int[]{indices[0], indices[1]};
                    }
                } else {
                    Integer[] indices = map.get(target - nums[i]);
                    int[] ret = new int[]{i, indices[0]};
                    Arrays.sort(ret);
                    return ret;
                }
            }
        }
        return null;
    }
}
