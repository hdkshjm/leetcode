package leetcode.hdkshjm.challenge.year2021.month01.week5.chap3623;

import java.util.Arrays;

class Solution {
    public void nextPermutation(int[] nums) {
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                int target = nums.length;
                int min = Integer.MAX_VALUE;
                // i より後ろで(i<j)、 nums[i] < nums[j] の、最小のnums[j]を探す
                for (int j = nums.length - 1; j > i; j--) {
                    if (min > nums[j] && nums[j] > nums[i]) {
                        target = j;
                        min = nums[j];
                    }
                }

                int temp = nums[i];
                nums[i] = nums[target];
                nums[target] = temp;
                Arrays.sort(nums, i + 1, nums.length);
                return;
            }
        }
        Arrays.sort(nums);
    }
}
