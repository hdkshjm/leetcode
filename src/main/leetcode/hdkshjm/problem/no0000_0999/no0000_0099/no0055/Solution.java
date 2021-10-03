package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0055;

class Solution {
    public boolean canJump(int[] nums) {
        if (nums.length == 1) return true;

        seek:
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0 || (i < nums.length - 1 && nums[i + 1] == 0)) continue;

            for (int j = i - 1; j >= 0; j--) {
                if (nums[j] + j >= nums.length - 1) break seek;
                if (nums[j] > i - j) continue seek;
            }
            return false;
        }
        return true;
    }
}
