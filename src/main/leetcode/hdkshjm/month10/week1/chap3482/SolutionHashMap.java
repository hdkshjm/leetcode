package leetcode.hdkshjm.month10.week1.chap3482;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// 2000ms...
class SolutionHashMap {
    public int findPairs(int[] nums, int k) {

        if (k == 0) {
            Arrays.sort(nums);
            Set<Integer> duplicatedNums = new HashSet<Integer>();
            int previous = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (previous == nums[i]) {
                    duplicatedNums.add(nums[i]);
                }
                previous = nums[i];
            }
            return duplicatedNums.size();
        }

        Map<Integer, Integer> diffs = new HashMap<Integer, Integer>();
        for (int n : nums) {
            diffs.put(n, n + k);
        }

        int count = 0;
        for (int n : diffs.keySet()) {
            if (diffs.containsValue(n)) {
                count++;
            }
        }

        return count;
    }
}