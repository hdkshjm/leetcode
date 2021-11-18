package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0448;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int bitMask = 2 << 16;
        for (int i = 0; i < nums.length; i++) nums[nums[i] % bitMask - 1] |= bitMask;

        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) if (nums[i] < bitMask) ret.add(i + 1);
        return ret;
    }
}
