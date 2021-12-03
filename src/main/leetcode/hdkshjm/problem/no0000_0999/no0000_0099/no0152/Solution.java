package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0152;

class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int product = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int prevMax = max;
            int prevMin = min;

            max = Math.max(nums[i], prevMax * nums[i]);
            max = Math.max(max, prevMin * nums[i]);

            min = Math.min(nums[i], prevMax * nums[i]);
            min = Math.min(min, prevMin * nums[i]);
            product = Math.max(product, max);
        }

        return product;
    }
}
