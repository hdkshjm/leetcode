package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0238;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ret = new int[nums.length];

        ret[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            ret[i] = ret[i - 1] * nums[i - 1];
        }

        int pre = nums[nums.length - 1];
        nums[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            int tmp = nums[i];
            nums[i] = pre * nums[i + 1];
            pre = tmp;
        }

        for (int i = 0; i < nums.length; i++) {
            ret[i] = ret[i] * nums[i];
        }

        return ret;
    }
}
