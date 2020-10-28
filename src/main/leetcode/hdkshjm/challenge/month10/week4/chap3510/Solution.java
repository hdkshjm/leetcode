package leetcode.hdkshjm.challenge.month10.week4.chap3510;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ret = new ArrayList<>();
        if (nums.length == 0) return ret;

        int previous = nums[0];
        int start = nums[0];
        StringBuilder sb = new StringBuilder();
        for (int n : nums) {
            if (n == nums[0]) continue;

            if (n - previous == 1) {
                previous = n;
                continue;
            }

            sb.append(start);
            if (start != previous) sb.append("->").append(previous);
            ret.add(sb.toString());
            sb.setLength(0);

            previous = n;
            start = n;
        }

        sb.append(start);
        if (start != previous) sb.append("->").append(previous);
        ret.add(sb.toString());

        return ret;
    }
}
