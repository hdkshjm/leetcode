package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0228;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ret = new ArrayList<>();
        if (nums.length == 0) return ret;

        int start = nums[0];
        StringBuilder sb = new StringBuilder();
        sb.append(start);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                if (start != nums[i - 1]) {
                    sb.append("->");
                    sb.append(nums[i - 1]);
                }
                ret.add(sb.toString());
                sb = new StringBuilder();
                start = nums[i];
                sb.append(start);
            }
        }

        if (start != nums[nums.length - 1]) {
            sb.append("->");
            sb.append(nums[nums.length - 1]);
        }
        ret.add(sb.toString());

        return ret;
    }
}
