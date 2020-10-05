package leetcode.hdkshjm.month10.week2_3456;

class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int currentValue = nums[i];
            max = Math.max(max, currentValue);
            if(nums[i]==0) {
                continue;
            }

            for (int j = i + 1; j < nums.length; j++) {
                currentValue = currentValue * nums[j];
                max = Math.max(max, currentValue);
                if (nums[j] == 0) {
                    break;
                }
            }
        }
        return max;
    }
}
