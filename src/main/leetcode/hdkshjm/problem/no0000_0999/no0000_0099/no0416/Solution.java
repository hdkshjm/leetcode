package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0416;

class Solution {
    public boolean canPartition(int[] nums) {
        int total = 0;
        for (int n : nums) total += n;
        if (total % 2 != 0) return false;
        return canPartition(nums, total / 2, 0);
    }

    public boolean canPartition(int[] nums, int target, int index) {
        if (target == 0) return true;
        if (index >= nums.length - 1 || target < 0) return false;
        return canPartition(nums, target - nums[index + 1], index + 1) ||
                canPartition(nums, target, index + 1);
    }
}
