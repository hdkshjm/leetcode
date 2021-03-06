package leetcode.hdkshjm.challenge.year2020.month11.week1.chap3521;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        Map<Integer, Long> map = new HashMap<>();
        if (getDivisionSum(nums, 1, map) <= threshold) {
            return 1;
        }

        int left = (int) (getDivisionSum(nums, 1, map) / threshold);
        int right = (left + nums.length) * 2;
        int center = (right + left) / 2;

        // left > center > right
        // leftSum > threshold > rightSum
        while (right - left > 1) {
            // leftSum > centerSum > threshold > rightSum
            if (getDivisionSum(nums, center, map) > threshold) {
                left = center;
                center = (right + center) / 2;
                continue;
            }

            // leftSum > threshold => centerSum  > rightSum
            right = center;
            center = (left + center) / 2;
        }

        for (int i = left; i <= right; i++) {
            if (getDivisionSum(nums, i, map) == threshold) return i;
            if (i > 1 && getDivisionSum(nums, i - 1, map) > threshold && getDivisionSum(nums, i, map) < threshold)
                return i;
        }
        return left;
    }

    private long getDivisionSum(int[] nums, int value, Map<Integer, Long> map) {
        if (!map.containsKey(value)) {
            long ret = 0;
            for (int n : nums) {
                ret += n / value + (n % value == 0 ? 0 : 1);
            }
            map.put(value, ret);
        }
        return map.get(value);
    }
}
