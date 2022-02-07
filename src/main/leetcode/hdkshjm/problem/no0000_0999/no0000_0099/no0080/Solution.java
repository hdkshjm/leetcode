package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0080;

class Solution {
    public int removeDuplicates(int[] nums) {
        int first = 0;
        int second = -1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[first] == nums[i + 1]) {
                if (second > 0) nums[i + 1] = Integer.MAX_VALUE;
                else second = i + 1;
            } else {
                first = i + 1;
                second = -1;
            }
        }

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == Integer.MAX_VALUE) continue;
            nums[index] = nums[i];
            index++;
        }
        return index;
    }
}
