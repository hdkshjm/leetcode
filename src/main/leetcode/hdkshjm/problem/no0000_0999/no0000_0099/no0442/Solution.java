package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0442;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int MAX = nums.length + 1;
        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int j = nums[i] >= MAX ? nums[i] - MAX - 1 : nums[i] - 1;
            if (nums[j] >= MAX) ret.add(j + 1);
            else nums[j] += MAX;
        }
        return ret;
    }
}
