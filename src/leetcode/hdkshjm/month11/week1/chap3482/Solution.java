package leetcode.hdkshjm.month11.week1.chap3482;

import java.util.Arrays;

class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);

        int count = 0;
        int previous = nums[0] - 1;
        int index = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (previous == nums[i]) {
                continue;
            }
            for (int j = Math.max(index, i + 1); j < nums.length; j++) {
                if ((nums[i] + k) == nums[j]) {
                    count++;
                    index = j + 1;
                    break;
                }
            }
            previous = nums[i];
        }
        return count;
    }
}