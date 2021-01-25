package leetcode.hdkshjm.challenge.year2021.month01.week4.chap3616;

class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int distance = k;
        for (int n : nums) {
            if (n == 1) {
                if (distance < k) return false;
                distance = 0;
                continue;
            }
            distance++;
        }
        return true;
    }
}
