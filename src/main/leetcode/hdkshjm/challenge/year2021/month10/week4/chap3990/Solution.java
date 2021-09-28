package leetcode.hdkshjm.challenge.year2021.month10.week4.chap3990;

class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] ret = new int[nums.length];
        int[] indices = new int[]{0, 1};
        for (int i = 0; i < nums.length; i++) {
            int remainder = nums[i] % 2;
            ret[indices[remainder]] = nums[i];
            indices[remainder] += 2;
        }
        return ret;
    }
}
