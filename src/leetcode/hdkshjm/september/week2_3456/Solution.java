package leetcode.hdkshjm.september.week2_3456;

class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0) {
                max = Math.max(max, nums[i]);
                continue;
            }
            max = Math.max(max, nums[i]);
            int currentValue = nums[i];
            
            int indexOfZero = nums.length;

            for (int j = i + 1; j < indexOfZero; j++) {
                currentValue = currentValue * nums[j];
                max = Math.max(max, currentValue);
                if (nums[j] == 0) {
                    indexOfZero = j;
                    break;
                }
            }
        }
        return max;
    }
}