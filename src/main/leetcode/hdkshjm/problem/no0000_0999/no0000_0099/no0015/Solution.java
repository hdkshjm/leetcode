package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0015;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int[] counts = new int[200001];
        for (int n : nums) counts[n + 100000]++;

        Set<List<Integer>> ret = new HashSet<>();
        Arrays.sort(nums);

        int previous = -100001;
        for (int i = 0; i < nums.length; i++) {
            counts[nums[i] + 100000]--;
            if (previous == nums[i]) continue;

            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (-sum > nums[nums.length - 1]) continue;
                if (-sum < nums[j]) break;
                int count = -sum == nums[j] ? counts[-sum + 100000] - 1 : counts[-sum + 100000];
                if (count > 0) ret.add(Arrays.asList(nums[i], nums[j], -sum));
            }
            previous = nums[i];
        }
        return new ArrayList<>(ret);
    }
}
