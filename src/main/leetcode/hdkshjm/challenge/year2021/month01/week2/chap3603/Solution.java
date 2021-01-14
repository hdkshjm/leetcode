package leetcode.hdkshjm.challenge.year2021.month01.week2.chap3603;

class Solution {
    public int minOperations(int[] nums, int x) {
        int ret = 100001;

        int right = -1;
        int sum = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (sum + nums[i] < x) {
                sum += nums[i];
                continue;
            }
            if (sum + nums[i] == x) ret = Math.min(nums.length - i, ret);
            right = i + 1;
            break;
        }
        if (right == -1) return -1;

        int i = 0;
        while (i < right) {
            if (sum + nums[i] < x) {
                sum += nums[i];
                i++;
                continue;
            }

            if (sum + nums[i] == x) ret = Math.min(nums.length - right + i + 1, ret);
            if (right == nums.length) {
                i++;
                continue;
            }
            sum -= nums[right];
            right++;
        }

        return ret != 100001 ? ret : -1;
    }
}
