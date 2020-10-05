package leetcode.hdkshjm.month10.week2_3459;

class Solution {
    public int rob(int[] nums) {
        int current = 0;
        int previous = 0;
        for (int num : nums) {
            int max = Math.max(current, previous + num);
            previous = current;
            current = max;
        }
        return Math.max(current, previous);
    }
}
