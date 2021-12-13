package leetcode.hdkshjm.problem.no1000_1999.no1200_1299.no1413;

class Solution {
    public int minStartValue(int[] nums) {
        int min = nums[0];
        int current = 0;
        for (int n : nums) {
            current += n;
            min = Math.min(current, min);
        }
        return min < 0 ? 1 - min : 1;
    }
}
