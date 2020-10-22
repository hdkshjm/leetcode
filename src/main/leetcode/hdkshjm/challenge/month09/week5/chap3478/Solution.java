package leetcode.hdkshjm.challenge.month09.week5.chap3478;

import java.util.Arrays;

class Solution {

    public int firstMissingPositive(int[] nums) {

        Arrays.sort(nums);
        if (nums.length == 0 || nums[nums.length - 1] < 1) {
            return 1;
        }

        int min = 1;
        int previous =  nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 1) {
                continue;
            }

            if (nums[i] == min) {
                min++;
                continue;
            }

            if (previous + 1 < nums[i]) {
                Math.min(min, previous + 1);
            }
        }
        return min;
    }
}
